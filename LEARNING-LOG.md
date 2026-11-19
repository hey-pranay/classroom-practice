# DSA Learning Log

This file records important concepts, observations, mistakes, and rules learned while solving DSA problems using Java.

---

## Array Fundamentals

### Lesson 01: Array Traversal

**Concept:** Accessing and processing array elements.

**Forward traversal:**

```java
for(int num :arr){
        System.out.

print(num +" ");
}
```

**Reverse traversal:**

```java
for(int i = arr.length - 1;
i >=0;i--){
        System.out.

print(arr[i]+" ");
}
```

**Calculate array sum:**

```java
int sum = 0;

for(
int num :arr){
sum +=num;
}
```

**Important observations:**

- Use enhanced `for` when you only need element values.
- Use normal `for` when you need the index.
- Reverse traversal does not modify the original array.
- Array indexing starts at `0`.

**Complexity:**

- Time: O (n)
- Auxiliary space: O (1)

---

### Lesson 02: Finding Maximum Element

**Concept:** Find the largest element in an integer array using linear traversal.

**Java implementation:**

```java
int max = Integer.MIN_VALUE;

for(
int num :arr){
        if(num >max){
max =num;
    }
            }

            System.out.

println(max);
```

**Logic:**

1. Initialize `max` with `Integer.MIN_VALUE`.
2. Visit each element.
3. Compare the current element with `max`.
4. If the current element is greater, update `max`.
5. After traversal, `max` stores the largest element.

**Important observations:**

- `Integer.MIN_VALUE` is the smallest possible Java `int`.
- This initialization works even when all array elements are negative.
- We only update `max` when we find a larger element.
- An empty array must be handled separately.
- We don't need to sort the array to find its maximum.

**Alternative initialization:**

```java
int max = arr[0];
```

This also works, provided the array is not empty.

**Complexity:**

- Time: O (n)
- Auxiliary space: O (1)

**Pattern:** Linear Traversal / Running Maximum.

**Recognition clue:** When a problem asks for the largest element, consider maintaining a variable that stores the
maximum value found so far.

---

### Lesson 03: Finding the Minimum Element

**Concept:** Find the smallest element in an integer array using linear traversal.

**Logic:**

1. Initialize `min` with `Integer.MAX_VALUE`.
2. Traverse every element.
3. Compare the current element with `min`.
4. If the current element is smaller, update `min`.
5. After traversal, `min` contains the smallest element.

**Java implementation:**

```java
int min = Integer.MAX_VALUE;

for(
int num :arr){
        if(num<min){
min =num;
    }
            }

            System.out.

println(min);
```

**Important observations:**

- Use `Integer.MAX_VALUE` as the initial value.
- Update `min` only when the current element is smaller.
- An empty array must be handled separately.
- The same traversal pattern works for both maximum and minimum.

**Pattern:** Linear Traversal / Running Minimum.

**Recognition clue:** When asked to find the smallest element in an unsorted array, maintain a variable that stores the
smallest value found so far.

**Complexity:**

- Time: `O(n)`
- Auxiliary space: `O(1)`

---

### Lesson 04: Finding the Second Largest Element

**Concept:** Find the second-largest distinct element in an array using a single traversal.

**Logic:**

1. Maintain two variables: `largest` and `secondLargest`.
2. If the current element is greater than `largest`:
    - Move the previous `largest` into `secondLargest`.
    - Update `largest`.
3. Otherwise, check whether the current element is smaller than `largest` but greater than `secondLargest`.
4. Update `secondLargest` when the condition is satisfied.
5. Use a boolean flag to track whether a second-largest element has been found.

**Important observations:**

- Second largest means the second-largest distinct value.
- Duplicate largest values must be ignored.
- Save the previous largest before updating it.
- A boolean flag helps distinguish a valid `Integer.MIN_VALUE` from an uninitialized value.
- Handle arrays with fewer than two elements and arrays without a second distinct value.

**Pattern:** Two Variables / Running Best and Second Best.

**Recognition clue:** When asked to find the second-largest or second-smallest element, consider maintaining two
candidate values during one traversal.

**Complexity:**

- Time: `O(n)`
- Auxiliary space: `O(1)`

---

### Lesson 05: Finding the Second Smallest Element

**Concept:** Find the second-smallest distinct element in an array using a single traversal.

**Logic:**

1. Maintain two variables: `minimum` and `secondMin`.
2. If the current element is smaller than `minimum`:
    - Move the previous `minimum` into `secondMin`.
    - Update `minimum`.
3. Otherwise, check whether the current element is greater than `minimum` and smaller than `secondMin`.
4. Update `secondMin` when the condition is satisfied.
5. Use a boolean flag to track whether a second minimum has been found.

**Important observations:**

- Second smallest means the second-smallest distinct value.
- Duplicate minimum values must be ignored.
- Save the previous minimum before updating it.
- Compare `num < secondMin`, not `minimum < secondMin`.
- A boolean flag helps distinguish a valid `Integer.MAX_VALUE` from an uninitialized value.
- Handle arrays without a second distinct minimum.

**Pattern:** Two Variables / Running Best and Second Best.

**Recognition clue:** When asked to find the second-smallest element, maintain the smallest and second-smallest
candidates during one traversal.

**Complexity:**

- Time: `O(n)`
- Auxiliary space: `O(1)`

---

### Lesson 06: Check if an Array Is Sorted

**Concept:** Check whether an array is sorted in non-decreasing order.

**Logic:**

1. Initialize a boolean variable `isSorted = true`.
2. Traverse the array using a normal `for` loop.
3. Compare each element with the next element.
4. If `arr[i] > arr[i + 1]`, the array is not sorted.
5. Set `isSorted = false` and stop the loop using `break`.

**Important observations:**

- Compare adjacent elements to check sorted order.
- Use `arr.length - 1` to avoid accessing an invalid next index.
- Use `>` instead of `>=` to allow duplicate elements.
- `break` avoids unnecessary comparisons.
- Empty and single-element arrays are considered sorted.

**Pattern:** Adjacent Element Comparison / Linear Traversal.

**Recognition clue:** When asked whether an array is sorted, compare each element with its immediate neighbour.

**Complexity:**

- Best case: `O(1)`
- Worst case: `O(n)`
- Auxiliary space: `O(1)`

---

### Lesson 07: Reverse an Array

**Concept:** Reverse an array in-place using two pointers.

**Logic:**

1. Initialize `left = 0`.
2. Initialize `right = arr.length - 1`.
3. Continue while `left < right`.
4. Swap the elements at `left` and `right` using a temporary variable.
5. Increment `left` and decrement `right`.
6. Stop when the pointers meet or cross.

**Important observations:**

- Use a temporary variable to perform swapping safely.
- Both pointers move towards the center.
- `left < right` prevents unnecessary swaps.
- The original array is modified.
- No additional array is required.

**Pattern:** Two Pointers.

**Recognition clue:** When a problem involves processing or swapping elements from opposite ends of an array, consider
the Two Pointers pattern.

**Key takeaway**

- left < right → Stop when pointers meet. No unnecessary swap.
- left <= right → Also processes the middle element. Result remains correct, but performs an unnecessary self-swap.

**Complexity:**

- Time: `O(n)`
- Auxiliary space: `O(1)`

---

### Lesson 08: Remove Duplicates from a Sorted Array

**Problem:** Remove duplicate elements from a sorted array in-place.

**Example:**

```java
int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
```

Unique elements: `1 2 3 4 5`

**Approach: Two Pointers (Slow and Fast)**

- `slow` tracks the position of the last unique element.
- `fast` scans the array to find new unique elements.
- Compare `arr[fast]` with `arr[slow]`.
- If different, increment `slow` and copy `arr[fast]` to `arr[slow]`.
- The number of unique elements is `slow + 1`.

**Important observations:**

- Start `slow = 0` and `fast = 1`.
- The first element is already considered unique.
- The array must be sorted so duplicates are adjacent.
- Only the first `slow + 1` positions contain valid unique elements.
- Handle an empty array separately to avoid invalid indexing.

**Pattern Recognition:** Two Pointers — Slow and Fast.

**Complexity:**

- Time: O (n)
- Auxiliary Space: O (1)

**Key takeaway:** Use the fast pointer to explore and the slow pointer to maintain the valid unique portion of the
array.

---

### Lesson 09: Move Zeroes to the End

**Problem:** Move all zeroes to the end of an array while maintaining the relative order of non-zero elements.

**Example:**

```java
int[] arr = {0, 1, 0, 3, 12};
```

Output: `1 3 12 0 0`

**Approach: Two Pointers (Slow and Fast)**

- `fast` traverses the entire array and searches for non-zero elements.
- `slow` tracks the next position where a non-zero element should be placed.
- When `arr[fast] != 0`, copy it to `arr[slow]` and increment `slow`.
- After moving all non-zero elements, fill the remaining positions with zeroes.

**Important observations:**

- Start `slow = 0` and `fast = 0`.
- Do not start `fast` at 1 because the first element might be non-zero.
- The first loop moves non-zero elements to the beginning.
- The second loop fills the remaining positions with zeroes.
- The relative order of non-zero elements is maintained.

**Pattern Recognition:** Two Pointers — Slow and Fast.

**Complexity:**

- Time: O (n) — two linear traversals.
- Auxiliary Space: O (1) — modification happens in the original array.

**Key takeaway:** Use one pointer to explore and another to maintain the position where valid elements should be placed.

---

### Lesson 10: Move Zeroes to the Start

**Problem:** Move all zeroes to the beginning of an array while maintaining the relative order of non-zero elements.

**Example:**

```java
int[] arr = {1, 0, 3, 0, 12};
```

Output: `0 0 1 3 12`

**Approach: Two Pointers (Slow and Fast)**

- `fast` traverses the array to find non-zero elements.
- `slow` tracks the next position where a non-zero element should be placed.
- Copy non-zero elements into the beginning of the array while maintaining their relative order.
- After processing all non-zero elements, fill the remaining positions at the end with zeroes.
- To move zeroes to the start instead, shift non-zero elements towards the end while preserving their order, then fill
  the remaining positions at the beginning with zeroes.

**Important observations:**

- Moving zeroes to the start is the reverse arrangement of moving zeroes to the end.
- Preserve the relative order of non-zero elements.
- Be careful about traversal direction when modifying the original array in-place.
- Handle empty arrays safely.

**Pattern Recognition:** Two Pointers — Slow and Fast.

**Complexity:**

- Time: O (n)
- Auxiliary Space: O (1)

**Key takeaway:** Decide which section of the array should contain the non-zero elements, maintain their relative order,
and fill the remaining positions with zeroes.

---

### Lesson 11: Left Rotate an Array by One Position

**Problem:** Move the first element of an array to the last position and shift all remaining elements one position to
the left.

**Example:**

```java
int[] arr = {10, 20, 30, 40, 50};
```

Output: `20 30 40 50 10`

**Approach: Temporary Variable and Array Traversal**

- Store the first element in a temporary variable before modifying the array.
- Traverse the array from index `0` to `arr.length - 2`.
- Shift each element one position to the left using `arr[i] = arr[i + 1]`.
- Place the stored first element at the last index using `arr[arr.length - 1] = first`.
- Handle empty arrays safely before accessing the first element.

**Important observations:**

- Store the first element before shifting to avoid losing it.
- Use forward traversal when shifting elements to the left.
- The last valid array index is `arr.length - 1`, not `arr.length`.
- A single-element array remains unchanged after rotation.
- The original array is modified in-place.

**Pattern Recognition:** Array Traversal — In-place Modification.

**Complexity:**

- Time: O (n)
- Auxiliary Space: O (1)

**Key takeaway:** Save the element that needs to move, shift the remaining elements in the correct direction, and place
the saved element at its destination.

---

### Lesson 12: Right Rotate an Array by One Position

**Problem:** Move the last element of an array to the first position and shift all remaining elements one position to
the right.

**Example:**

```java
int[] arr = {10, 20, 30, 40, 50};
```

Output: `50 10 20 30 40`

**Approach: Temporary Variable and Backward Traversal**

- Store the last element in a temporary variable before modifying the array.
- Traverse the array backward, starting from `arr.length - 1` and moving towards index `1`.
- Shift each element one position to the right using `arr[i] = arr[i - 1]`.
- Place the stored last element at the first index using `arr[0] = last`.
- Handle empty arrays safely before accessing the last element.

**Important observations:**

- Store the last element before shifting to avoid losing it.
- Use backward traversal when shifting elements to the right.
- Stop the loop at `i > 0` because accessing `arr[i - 1]` when `i = 0` would cause an index error.
- A single-element array remains unchanged after rotation.
- The original array is modified in-place.

**Pattern Recognition:** Array Traversal — In-place Modification.

**Complexity:**

- Time: O (n)
- Auxiliary Space: O (1)

**Key takeaway:** Save the element that needs to move, shift the remaining elements backward in the correct direction,
and place the saved element at the beginning.

---

### Lesson 13: Left Rotate an Array by K Positions

**Problem:** Rotate an array to the left by K positions. The first K elements move to the end while maintaining their relative order.

**Example:**
```java
int[] arr = {10, 20, 30, 40, 50};
int k = 2;
```

Output: `30 40 50 10 20`

### Approach 1: Repeated Rotation (Brute Force)

- Rotate the array left by one position.
- Repeat this operation K times.
- Store the first element temporarily.
- Shift all remaining elements one position to the left.
- Place the saved element at the end.

**Complexity:**
- Time: O(n × k)
- Auxiliary Space: O(1)

### Approach 2: Temporary Array

- Create a temporary array of size K.
- Copy the first K elements into the temporary array.
- Shift the remaining elements K positions to the left.
- Copy the saved elements from the temporary array to the end.

**Complexity:**
- Time: O(n)
- Auxiliary Space: O(k)

### Approach 3: Reversal Algorithm (Optimal)

**Idea:** Reverse three sections of the array to achieve the required rotation without using an extra array.

For `arr = {10, 20, 30, 40, 50}` and `k = 2`:

**Step 1:** Reverse the first K elements.

`[20, 10, 30, 40, 50]`

**Step 2:** Reverse the remaining N-K elements.

`[20, 10, 50, 40, 30]`

**Step 3:** Reverse the complete array.

`[30, 40, 50, 10, 20]`

**Three cases:**
```java
reverse(arr, 0, k - 1);
reverse(arr, k, arr.length - 1);
reverse(arr, 0, arr.length - 1);
```

**Complexity:**
- Time: O(n)
- Auxiliary Space: O(1)

### Important Observations

- Always handle an empty array before performing rotation.
- Use `k = k % arr.length` to handle cases where K is greater than the array length.
- Java array indices start at zero, so the last index is `arr.length - 1`.
- The reversal algorithm modifies the original array without requiring extra storage.
- The reversal algorithm is the optimal approach among these three methods.

**Pattern Recognition:** Array Rotation — Reversal Algorithm and Two Pointers.

**Complexity Comparison:**

| Approach | Time | Auxiliary Space |
|---|---|---|
| Repeated Rotation | O(n × k) | O(1) |
| Temporary Array | O(n) | O(k) |
| Reversal Algorithm | O(n) | O(1) |

**Key Takeaway:** The Reversal Algorithm uses three reversals to rotate an array in O(n) time and O(1) auxiliary space. It is an important array manipulation technique.

---

### Lesson 14: Right Rotate an Array by K Positions

**Problem:** Rotate an array to the right by K positions. The last K elements move to the beginning while maintaining their relative order.

**Example:**
```java
int[] arr = {1, 2, 3, 4, 5, 6};
int k = 2;
```

Output: `5 6 1 2 3 4`

**Approach 1: Repeated Rotation (Brute Force)**

- Store the last element in a temporary variable.
- Shift all remaining elements one position to the right.
- Place the saved element at index 0.
- Repeat the process K times.

**Complexity:**
- Time: O(n × k)
- Auxiliary Space: O(1)

**Approach 2: Temporary Array**

- Create a temporary array of size K.
- Copy the last K elements into the temporary array.
- Shift the remaining elements K positions to the right, traversing backward.
- Copy the saved elements to the beginning of the original array.

**Complexity:**
- Time: O(n)
- Auxiliary Space: O(k)

**Approach 3: Reversal Algorithm (Optimal)**

- Reverse the complete array.
- Reverse the first K elements.
- Reverse the remaining N-K elements.

**Three cases:**
```java
reverse(arr, 0, arr.length - 1);
reverse(arr, 0, k - 1);
reverse(arr, k, arr.length - 1);
```

**Complexity:**
- Time: O(n)
- Auxiliary Space: O(1)

**Important Observations:**

- Always handle an empty array before performing rotation.
- Normalize K using `k = k % arr.length`.
- Use backward traversal when shifting elements to the right.
- The same `reverse()` helper method works for both left and right rotations.
- The reversal algorithm avoids using an extra array.

**Pattern Recognition:** Array Rotation — Reversal Algorithm and Two Pointers.

**Complexity Comparison:**

| Approach | Time | Auxiliary Space |
|---|---|---|
| Repeated Rotation | O(n × k) | O(1) |
| Temporary Array | O(n) | O(k) |
| Reversal Algorithm | O(n) | O(1) |

**Key Takeaway:** Right rotation can be performed optimally using three reversals: reverse the entire array, reverse the first K elements, and reverse the remaining elements.

---

### Lesson 15: Find the Missing Number in an Array

**Problem:** Given an array containing distinct numbers from a consecutive range, find the one missing number.

**Example:**
```java
int[] arr = {1, 2, 4, 5};
```

Output: `3`

**Approach: Sum Formula**

- Find the starting and ending numbers of the range.
- Calculate the expected sum of all numbers using the arithmetic progression formula.
- Calculate the actual sum of the array elements.
- Subtract the actual sum from the expected sum to find the missing number.

**Formula:**
```
ExpectedSum = { (start+end) * (end-start+1) } / 2

MissingNumber = ExpectedSum - ActualSum
```

**Important Observations:**

- `arr[i]` accesses the actual array element, whereas `i` represents its index.
- `end - start + 1` calculates the total count of numbers in the range.
- Use `long` to reduce the risk of integer overflow during sum calculations.
- This approach assumes the array is sorted, contains distinct numbers, has exactly one missing number, and all other numbers in the range are present.

**Pattern Recognition:** Array Fundamentals — Mathematical Approach.

**Complexity:**

- Time: O(n)
- Auxiliary Space: O(1)

**Key Takeaway:** Instead of searching for every number individually, calculate the expected sum and subtract the actual array sum to find the missing number.

---

### Lesson 16: Maximum Consecutive Ones

**Problem:** Given a binary array containing only 0s and 1s, find the maximum number of consecutive 1s.

**Example:**
```java
int[] nums = {1, 1, 0, 1, 1, 1};
```

Output: `3`

**Approach: Single Traversal (Counting)**

- Initialize `count = 0` to track the current consecutive ones.
- Initialize `maxCount = 0` to store the maximum consecutive ones.
- Traverse the array.
- If the current element is 1, increment `count`.
- If the current element is 0, reset `count` to 0.
- After every element, update `maxCount` using `Math.max()`.
- Return `maxCount`.

**Important Observations:**

- `count` tracks the current consecutive sequence.
- `maxCount` remembers the longest sequence found so far.
- Encountering 0 breaks the current sequence, so `count` resets to 0.
- Update `maxCount` inside the loop to avoid missing an earlier maximum.
- An empty array returns 0.

**Pattern Recognition:** Array Traversal — Counting and Tracking Maximum.

**Complexity:**

- Time: O(n)
- Auxiliary Space: O(1)

**Key Takeaway:** Use two variables to track the current consecutive count and the maximum count. Reset the current count whenever the sequence is broken.

---

### Lesson 17: Find the Number That Appears Once (LeetCode 136)

**Problem:** Given a non-empty array where every element appears twice except one element, find the element that appears only once.

**Example:**

```java
int[] nums = {5, 3, 5, 2, 3};
```

Output: `2`

**Approach 1: Brute Force (Nested Loops)**

- Traverse each element.
- Count how many times it appears in the entire array.
- Return the element whose frequency is exactly one.

**Complexity:**
- Time: O(n²)
- Auxiliary Space: O(1)

**Approach 2: XOR (Optimized Array Approach)**

XOR (`^`) follows these properties:

- `a ^ a = 0`
- `a ^ 0 = a`
- `a ^ b = b ^ a` (Commutative)
- XOR is associative, so elements can be regrouped.

**Binary Example:**

```text
5 = 0101
3 = 0011
---------
    0110 = 6
```

Therefore:
- `5 ^ 3 = 6`
- `3 ^ 5 = 6`
- `5 ^ 3 ^ 5 = 3`

All duplicate elements cancel each other because `a ^ a = 0`. The unique element remains.

**Complexity:**
- Time: O(n)
- Auxiliary Space: O(1)

**Pattern Recognition:** XOR / Bit Manipulation

**Key Takeaway:** XOR can solve certain frequency-based array problems efficiently without using extra data structures.

---

### Lesson 18: Longest Subarray with Given Sum (Positive Numbers)

**Problem:** Find the length of the longest contiguous subarray whose sum equals a given target `k`.

**Example:**

```java
int[] arr = {1, 2, 1, 1, 1, 3, 2};
int k = 6;
```

Output: `5`

**Approach 1: Brute Force (Nested Loops)**

- Use `i` as the starting index.
- Use `j` as the ending index.
- Maintain a running sum for each starting index.
- If `sum == k`, calculate the subarray length using `j - i + 1`.
- Update `maxLength`.

**Complexity:**
- Time: O(n²)
- Auxiliary Space: O(1)

**Approach 2: Sliding Window (Two Pointers)**

- Initialize `left = 0` and `sum = 0`.
- Move `right` through the array, adding each element to `sum`.
- While `sum > k`, remove the leftmost element and increment `left`.
- When `sum == k`, calculate the window length and update `maxLength`.

**Complexity:**
- Time: O(n)
- Auxiliary Space: O(1)

**Important Observations:**

- `left` shrinks the window.
- `right` expands the window.
- `while` is necessary because removing one element may not be enough.
- This sliding-window approach works for positive or non-negative array elements, not arbitrary negative numbers.

**Pattern Recognition:** Sliding Window / Two Pointers

**Key Takeaway:** When working with positive numbers and a target sum, a sliding window can optimize a nested-loop solution from O(n²) to O(n).

---

### Lesson 19: Maximum Sum Subarray of Size K

**Java Class:** `MaximumSumSubarrayOfSizeK`  
**Package:** `Array.slidingWindow`  
**File:** `MaximumSumSubarrayOfSizeK.java`

**Problem:**  
Given an integer array and an integer `k`, find the maximum sum of any contiguous subarray containing exactly `k` elements.

**Example:**

```java
int[] arr = {1, 2, 3, 4, 2, 1};
int k = 3;
```

**Output:**

```text
9
```

**Approach: Fixed-Size Sliding Window**

1. Initialize `windowSum = 0`.
2. Calculate the sum of the first `k` elements.
3. Initialize `maxSum = windowSum`.
4. Start the second loop from index `k`.
5. Remove the outgoing element and add the incoming element.
6. Update the maximum sum using `Math.max()`.
7. Continue until the array ends.

**Formula:**

```java
windowSum = windowSum - arr[i - k] + arr[i];
maxSum = Math.max(maxSum, windowSum);
```

**Important Observations:**

- Every window contains exactly `k` elements.
- The first window is calculated separately.
- Each next window removes one element and adds one element.
- We don't need to recalculate the entire window sum.
- The window size remains fixed throughout the algorithm.

**Pattern Recognition:**

Use Fixed-Size Sliding Window when:
- We need to examine contiguous subarrays.
- Every subarray must have exactly `k` elements.
- We need maximum sum, minimum sum, or another aggregate over each fixed-size window.

**Complexity:**

- Time Complexity: O(n) — each array element is processed a constant number of times.
- Auxiliary Space: O(1) — only a few variables are used.

**Key Takeaway:**

Instead of recalculating the sum of every subarray, reuse the previous window sum. Remove the outgoing element and add the incoming element. This reduces the brute-force O(n × k) approach to O(n).

---
## Revision Rules

1. Always check whether an array can be empty before accessing `arr[0]`.
2. Use enhanced `for` when an index is unnecessary.
3. Use normal `for` when index-based operations are required.
4. Finding a maximum or minimum does not require sorting.
5. Track the best value found so far using a variable.