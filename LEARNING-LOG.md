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

**Problem:** Rotate an array to the left by K positions. The first K elements move to the end while maintaining their
relative order.

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

- Time: O (n × k)
- Auxiliary Space: O (1)

### Approach 2: Temporary Array

- Create a temporary array of size K.
- Copy the first K elements into the temporary array.
- Shift the remaining elements K positions to the left.
- Copy the saved elements from the temporary array to the end.

**Complexity:**

- Time: O (n)
- Auxiliary Space: O (k)

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
reverse(arr, 0,k -1);

reverse(arr, k, arr.length -1);

reverse(arr, 0,arr.length -1);
```

**Complexity:**

- Time: O (n)
- Auxiliary Space: O (1)

### Important Observations

- Always handle an empty array before performing rotation.
- Use `k = k % arr.length` to handle cases where K is greater than the array length.
- Java array indices start at zero, so the last index is `arr.length - 1`.
- The reversal algorithm modifies the original array without requiring extra storage.
- The reversal algorithm is the optimal approach among these three methods.

**Pattern Recognition:** Array Rotation — Reversal Algorithm and Two Pointers.

**Complexity Comparison:**

| Approach           | Time     | Auxiliary Space |
|--------------------|----------|-----------------|
| Repeated Rotation  | O(n × k) | O(1)            |
| Temporary Array    | O(n)     | O(k)            |
| Reversal Algorithm | O(n)     | O(1)            |

**Key Takeaway:** The Reversal Algorithm uses three reversals to rotate an array in O (n) time and O (1) auxiliary
space. It is an important array manipulation technique.

---

### Lesson 14: Right Rotate an Array by K Positions

**Problem:** Rotate an array to the right by K positions. The last K elements move to the beginning while maintaining
their relative order.

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

- Time: O (n × k)
- Auxiliary Space: O (1)

**Approach 2: Temporary Array**

- Create a temporary array of size K.
- Copy the last K elements into the temporary array.
- Shift the remaining elements K positions to the right, traversing backward.
- Copy the saved elements to the beginning of the original array.

**Complexity:**

- Time: O (n)
- Auxiliary Space: O (k)

**Approach 3: Reversal Algorithm (Optimal)**

- Reverse the complete array.
- Reverse the first K elements.
- Reverse the remaining N-K elements.

**Three cases:**

```java
reverse(arr, 0,arr.length -1);

reverse(arr, 0,k -1);

reverse(arr, k, arr.length -1);
```

**Complexity:**

- Time: O (n)
- Auxiliary Space: O (1)

**Important Observations:**

- Always handle an empty array before performing rotation.
- Normalize K using `k = k % arr.length`.
- Use backward traversal when shifting elements to the right.
- The same `reverse()` helper method works for both left and right rotations.
- The reversal algorithm avoids using an extra array.

**Pattern Recognition:** Array Rotation — Reversal Algorithm and Two Pointers.

**Complexity Comparison:**

| Approach           | Time     | Auxiliary Space |
|--------------------|----------|-----------------|
| Repeated Rotation  | O(n × k) | O(1)            |
| Temporary Array    | O(n)     | O(k)            |
| Reversal Algorithm | O(n)     | O(1)            |

**Key Takeaway:** Right rotation can be performed optimally using three reversals: reverse the entire array, reverse the
first K elements, and reverse the remaining elements.

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
- This approach assumes the array is sorted, contains distinct numbers, has exactly one missing number, and all other
  numbers in the range are present.

**Pattern Recognition:** Array Fundamentals — Mathematical Approach.

**Complexity:**

- Time: O (n)
- Auxiliary Space: O (1)

**Key Takeaway:** Instead of searching for every number individually, calculate the expected sum and subtract the actual
array sum to find the missing number.

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

- Time: O (n)
- Auxiliary Space: O (1)

**Key Takeaway:** Use two variables to track the current consecutive count and the maximum count. Reset the current
count whenever the sequence is broken.

---

### Lesson 17: Find the Number That Appears Once (LeetCode 136)

**Problem:** Given a non-empty array where every element appears twice except one element, find the element that appears
only once.

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

- Time: O (n²)
- Auxiliary Space: O (1)

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

- Time: O (n)
- Auxiliary Space: O (1)

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

- Time: O (n²)
- Auxiliary Space: O (1)

**Approach 2: Sliding Window (Two Pointers)**

- Initialize `left = 0` and `sum = 0`.
- Move `right` through the array, adding each element to `sum`.
- While `sum > k`, remove the leftmost element and increment `left`.
- When `sum == k`, calculate the window length and update `maxLength`.

**Complexity:**

- Time: O (n)
- Auxiliary Space: O (1)

**Important Observations:**

- `left` shrinks the window.
- `right` expands the window.
- `while` is necessary because removing one element may not be enough.
- This sliding-window approach works for positive or non-negative array elements, not arbitrary negative numbers.

**Pattern Recognition:** Sliding Window / Two Pointers

**Key Takeaway:** When working with positive numbers and a target sum, a sliding window can optimize a nested-loop
solution from O (n²) to O (n).

---

### Lesson 19: Maximum Sum Subarray of Size K

**Java Class:** `MaximumSumSubarrayOfSizeK`  
**Package:** `Array.slidingWindow`  
**File:** `MaximumSumSubarrayOfSizeK.java`

**Problem:**  
Given an integer array and an integer `k`, find the maximum sum of any contiguous subarray containing exactly `k`
elements.

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
windowSum =windowSum -arr[i -k]+arr[i];
maxSum =Math.

max(maxSum, windowSum);
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

- Time Complexity: O (n) — each array element is processed a constant number of times.
- Auxiliary Space: O (1) — only a few variables are used.

**Key Takeaway:**

Instead of recalculating the sum of every subarray, reuse the previous window sum. Remove the outgoing element and add
the incoming element. This reduces the brute-force O (n × k) approach to O (n).

---

### Lesson 20: 2Sum

**Problem:** Given a sorted array and a target value, find the indices of two elements whose sum equals the target.

**Example:**

```java
int[] arr = {1, 2, 4, 6, 8, 9};
int target = 10;
```

Output:

```text
0
5
```

**Approach: Two Pointers**

- Initialize `left = 0` and `right = arr.length - 1`.
- Calculate the sum of the elements at both pointers.
- If the sum equals the target, print or return both indices.
- If the sum is smaller than the target, increment `left` to increase the sum.
- If the sum is greater than the target, decrement `right` to decrease the sum.
- Continue until `left` is no longer smaller than `right`.

**Important Observations:**

- The array must be sorted for this two-pointer logic to work.
- Use a `while (left < right)` loop because both pointers move independently.
- When the sum is too small, move the left pointer forward.
- When the sum is too large, move the right pointer backward.
- Do not move both pointers simultaneously.
- If no valid pair exists, handle the case after the loop.

**Pattern Recognition:** Array — Two Pointers Technique.

**Complexity:**

- Time: O (n)
- Auxiliary Space: O (1)

**Key Takeaway:** In a sorted array, two pointers allow us to find a pair with a target sum efficiently without using
nested loops or an extra data structure.

---

### Lesson 21: Container With Most Water

**Problem:** Given an array where each element represents the height of a vertical line, find two lines that can hold
the maximum amount of water.

**Example:**

```java
int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
```

Output:

```text
49
```

**Approach: Two Pointers**

- Initialize `left = 0` and `right = height.length - 1`.
- Calculate the width using `right - left`.
- Calculate the limiting height using `Math.min(height[left], height[right])`.
- Calculate the current area using `width * height`.
- Update the maximum area using `Math.max(maxArea, currentArea)`.
- If the left height is smaller, increment `left`.
- If the right height is smaller, decrement `right`.
- If both heights are equal, move both pointers inward.
- Continue until `left` is no longer smaller than `right`.

**Formula:**

```text
Width = right - left

Height = min(height[left], height[right])

Area = Width * Height

MaximumArea = max(MaximumArea, Area)
```

**Important Observations:**

- The shorter line determines the maximum water height.
- Water spills over the shorter boundary.
- Moving the shorter pointer gives a chance to find a taller boundary.
- Moving the taller pointer cannot improve the limiting height while the shorter boundary remains fixed.
- `Math.max()` maintains the largest area found so far.

**Pattern Recognition:** Array — Two Pointers Technique.

**Complexity:**

- Time: O (n)
- Auxiliary Space: O (1)

**Key Takeaway:** When calculating the maximum container area, always consider the shorter boundary as the limiting
height. Move the shorter pointer inward to explore the possibility of finding a larger area.

---

### Lesson 22: Squares of a Sorted Array

**Problem:** Given an integer array sorted in non-decreasing order, return a new array containing the squares of every
element, also sorted in non-decreasing order.

**Example:**

```java
int[] nums = {-7, -3, 2, 3, 11};
```

Output:

```text
[4, 9, 9, 49, 121]
```

**Approach: Two Pointers with a Result Array**

- Create a new result array of the same length.
- Initialize `left = 0` and `right = nums.length - 1`.
- Initialize `index = result.length - 1`.
- Compare the absolute values at the left and right pointers using `Math.abs()`.
- Square the element with the larger absolute value and store it at `result[index]`.
- Move the pointer corresponding to the element used.
- Decrement `index` after every placement.
- Continue while `left <= right` to process every element, including the middle element.

**Important Observations:**

- The original array is sorted, but its squared values may not be sorted.
- The largest square must be at either end of the original array.
- `Math.abs()` helps compare negative and positive values correctly.
- We fill the result array from right to left because we identify the largest square first.
- The original array remains unchanged.
- Use `left <= right` so no element is left unprocessed.

**Pattern Recognition:** Array — Two Pointers Technique.

**Complexity:**

- Time: O (n)
- Auxiliary Space: O (n) — result array.

**Key Takeaway:** When squaring a sorted array, compare the absolute values at both ends. Place the larger square at the
end of a new array and move the corresponding pointer. This avoids sorting the squared array separately.

---

### Lesson 23: 3Sum (LeetCode 15)

**Java Class:** `ThreeSum`  
**Package:** `Array.twoPointers`  
**File:** `ThreeSum.java`

**Problem:**  
Given an integer array, find all unique triplets `[a, b, c]` such that their sum equals zero.

**Example:**

```java
int[] nums = {-1, 0, 1, 2, -1, 2, -4};
```

**Output:**

```text
[[-4, 2, 2], [-1, -1, 2], [-1, 0, 1]]
```

**Approach: Sorting + Two Pointers**

1. Sort the array.
2. Use an outer `for` loop to fix the first element.
3. Skip duplicate fixed elements.
4. Initialize `left = i + 1` and `right = nums.length - 1`.
5. Calculate the remaining target:

   `remainingTarget = 0 - nums[i]`

6. Use two pointers to find the remaining pair:
    - If `sum < remainingTarget`, increment `left`.
    - If `sum > remainingTarget`, decrement `right`.
    - If equal, store the triplet and move both pointers.
7. Skip duplicate values after finding a valid triplet.
8. Stop the outer loop when the fixed element becomes positive.

**Formula:**

```text
nums[i] + nums[left] + nums[right] = 0

nums[left] + nums[right] = 0 - nums[i]
```

**Important Observations:**

- Sorting makes the two-pointer technique possible.
- The fixed element must be different from the two pointer elements.
- `left < right` ensures we use two different elements.
- Duplicate fixed elements must be skipped.
- Duplicate left and right values must also be skipped after finding a triplet.
- If the fixed element is positive, we can stop because the array is sorted.
- Both pointers move inward after finding a valid triplet to continue searching.

**Pattern Recognition:**

Use Sorting + Two Pointers when:

- We need to find pairs or triplets satisfying a target sum.
- The array can be sorted.
- We need to avoid duplicate combinations.

**Complexity:**

- Time Complexity: O (n²) — sorting takes O (n log n), and the outer loop combined with the two-pointer search takes O
  (n²).
- Auxiliary Space: O (1) excluding sorting implementation and output storage.
- Output Space: Depends on the number of valid triplets.

**Key Takeaway:**

3Sum extends the Two Sum pattern. Fix one element using a `for` loop, then use two pointers to find the remaining pair.
Sorting helps us move pointers intelligently and skip duplicates.

---

### Lesson 24: 4Sum (Two Fixed Elements + Two Pointers)

**Problem:**

Given an integer array `nums` and an integer `target`, find all unique quadruplets `[a, b, c, d]` such that:

`a + b + c + d = target`

Each quadruplet must contain four different indices. The result must not contain duplicate quadruplets.

**Example:**

```java
int[] arr = {1, 0, -1, 0, -2, 2};
int target = 0;
```

**Output:**

```text
[[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]
```

**Approach:**

1. Sort the array so that the two-pointer technique can be applied.
2. Use the first loop (`i`) to fix the first element.
3. Use the second loop (`j`) to fix the second element.
4. Initialize `left = j + 1` and `right = arr.length - 1`.
5. Calculate the remaining target:

   `remainingTarget = target - arr[i] - arr[j]`

6. Use two pointers to find the remaining two elements:
    - If `arr[left] + arr[right] < remainingTarget`, increment `left`.
    - If `arr[left] + arr[right] > remainingTarget`, decrement `right`.
    - If both sums are equal, store the quadruplet and move both pointers.
7. Skip duplicate values at `i`, `j`, `left`, and `right` to avoid duplicate quadruplets.

**Important Observations:**

1. Sorting is necessary for the two-pointer technique.
2. `i` fixes the first element, while `j` fixes the second element.
3. `j = i + 1` ensures that the same index is not reused.
4. `left = j + 1` ensures that the remaining elements come after the fixed elements.
5. `i < arr.length - 3`: At least three elements must remain after fixing `i`.
6. `j < arr.length - 2`: At least two elements must remain after fixing `j`.
7. Since the array is sorted, we can move pointers intelligently instead of checking every combination.
8. Use `long` for sum calculations to prevent integer overflow.
9. Duplicate handling is necessary to ensure unique quadruplets.

**Pattern Recognition:**

The common pattern connecting 2Sum, 3Sum, and 4Sum is **Two Sum using Two Pointers**.

| Problem | Fixed elements | Remaining elements |
|---------|---------------:|-------------------:|
| 2Sum    |              0 |                  2 |
| 3Sum    |              1 |                  2 |
| 4Sum    |              2 |                  2 |

- 2Sum: Directly use two pointers.
- 3Sum: Fix one element, then apply two pointers.
- 4Sum: Fix two elements, then apply two pointers.

The general idea is to fix the required number of elements and solve the remaining Two Sum problem using two pointers.

**Complexity:**

- **Time Complexity:** O (n³)
    - First loop: O (n)
    - Second loop: O (n)
    - Two-pointer traversal: O (n)
- **Auxiliary Space:** O (1), excluding sorting implementation and output storage.
- **Output Space:** Depends on the number of unique quadruplets.

**Key Takeaway:**

The Two Sum pattern can be extended to larger sum problems.

Instead of using four nested loops for 4Sum, we fix two elements and use two pointers to find the remaining two
elements.

Remember:

**2Sum → 0 fixed elements**

**3Sum → 1 fixed element**

**4Sum → 2 fixed elements**

The number of fixed elements increases, but the remaining search is handled using the same Two Pointer technique.

---

### Lesson 25: K-Sum using Recursion + Two Pointers

**Problem:**

Given a sorted or unsorted integer array, find all unique combinations of `k` elements whose sum equals the given target.

Instead of implementing separate solutions for 2Sum, 3Sum, 4Sum, and 5Sum, we use one generic recursive function.

**Example:**

Input:
```java
int[] arr = {1, 0, -1, 0, -2, 2};
int k = 4;
int target = 0;
```

Output:
```text
[[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]
```

**Approach:**

1. Sort the array so that Two Pointers can be used.
2. Create a recursive function with four parameters:
    - `arr`: Input array.
    - `start`: Starting index for searching.
    - `k`: Number of elements still required.
    - `target`: Remaining sum required.
3. If `k == 2`, solve the remaining problem using Two Pointers.
4. Otherwise, fix one element using a loop.
5. Recursively call KSum with:
    - `i + 1` as the new starting index.
    - `k - 1` as the new number of required elements.
    - `target - arr[i]` as the new remaining target.
6. Add the fixed element to every combination returned by recursion.
7. Skip duplicate elements to avoid duplicate combinations.

**Formula:**

Recursive relationship:

```text
kSum(arr, start, k, target)

        |
        v

Fix arr[i]

        |
        v

kSum(arr, i + 1, k - 1, target - arr[i])
```

Base case:

```text
When k == 2:

Use Two Pointers.
```

**Important Observations:**

- `k == 2` is the base case because Two Sum can be solved efficiently using Two Pointers on a sorted array.
- `i + 1` ensures that the same array element is not reused.
- `k - 1` means one element has already been selected.
- `target - arr[i]` updates the remaining sum.
- `i > start` is important when skipping duplicates at each recursion level.
- The array must be sorted before calling KSum.
- The recursive method returns combinations, which are extended by adding the current fixed element.
- Using `long` for the target and sum is safer when input values can cause integer overflow.

**Pattern Recognition:**

| Problem | Fixed Elements | Remaining Problem |
|---|---:|---|
| 2Sum | 0 | Two Pointers |
| 3Sum | 1 | 2Sum |
| 4Sum | 2 | 2Sum |
| 5Sum | 3 | 2Sum |
| KSum | K - 2 | 2Sum |

**Complexity:**

- **Time Complexity:** O(n^(k-1)) for fixed k, using the Two Pointers base case. For K = 4, this becomes O(n³).
- **Auxiliary Space:** O(k) recursion stack, excluding sorting, returned combinations, and temporary result storage.

**Key Takeaway:**

KSum is a generalization of 2Sum, 3Sum, and 4Sum.

Instead of writing separate algorithms for every value of K, we repeatedly fix one element and reduce the problem to K - 1 Sum until we reach the 2Sum base case.

**One recursive pattern can solve multiple Sum problems!**

---
### Lesson 26: Binary Search Fundamentals (LeetCode 704)

**Problem:**

Given a sorted integer array and a target value, find the index of the target.

If the target does not exist, return `-1`.

**Example:**

Input:
```java
int[] arr = {-1, 0, 3, 5, 9, 12};
int target = 9;
```

Output:
```text
4
```

**Approach:**

Binary Search works on a sorted array. Instead of checking every element one by one, it repeatedly divides the search range into half.

1. Initialize `left = 0` and `right = arr.length - 1`.
2. Calculate the middle index.
3. Compare the middle element with the target.
4. If the middle element equals the target, return its index.
5. If the middle element is smaller than the target, search the right half.
6. If the middle element is greater than the target, search the left half.
7. If the search range becomes empty, return `-1`.

**Important Formula:**

Middle index:

```java
int mid = left + (right - left) / 2
```

---

### Lesson 27: Find First and Last Position of Element in Sorted Array (LeetCode 34)

**Problem:**

Given a sorted array and a target, find the first and last occurrence of that target.

If the target is not present, return `[-1, -1]`.

**Example:**

```java
int[] arr = {2, 4, 4, 4, 4, 7};
int target = 4;
```

**Output:**

```text
[1, 4]
```

**Approach:**

We use Binary Search twice.

1. **First Occurrence:**
    - If `arr[mid] == target`, save `mid` in `ans`.
    - Move towards the left using `right = mid - 1`.
    - Continue searching to find an earlier occurrence.

2. **Last Occurrence:**
    - If `arr[mid] == target`, save `mid` in `ans`.
    - Move towards the right using `left = mid + 1`.
    - Continue searching to find a later occurrence.

3. **Combine Results:**
    - Call both methods.
    - Store their results in an array.

**Output:**

```text
1 4
```

**Important Observations:**

- Normal Binary Search can return any matching index.
- First Occurrence requires searching further left after finding the target.
- Last Occurrence requires searching further right after finding the target.
- Initialize `ans = -1` because the target might not exist.
- Always move a pointer after finding the target to avoid an infinite loop.
- Both searches work on the same sorted array.

**Pattern Recognition:**

Whenever a sorted array contains duplicate elements and we need a boundary position:

- First position → Binary Search + move left.
- Last position → Binary Search + move right.

This is a variation of Binary Search called **Boundary Binary Search**.

**Complexity:**

- First Occurrence: O(log n)
- Last Occurrence: O(log n)
- Total Time Complexity: O(log n)
- Auxiliary Space Complexity: O(1)

**Key Takeaway:**

Binary Search is not limited to finding whether an element exists. By modifying the pointer movement after finding the target, we can find its first and last occurrences efficiently.

---

### Lesson 28: Search Insert Position (LeetCode 35)

**Problem:**

Given a sorted array of distinct integers and a target value:

- If the target exists, return its index.
- If the target doesn't exist, return the index where it should be inserted to maintain sorted order.

**Example:**

```java
int[] arr = {1, 3, 5, 6};
int target = 4;
```

**Output:**

```text
2
```

**Approach:**

Use Binary Search to find the target or its correct insertion position.

1. Initialize `left = 0` and `right = arr.length - 1`.
2. Calculate the middle index.
3. Compare `arr[mid]` with the target.
4. If equal, return `mid`.
5. If the middle element is smaller, move right using `left = mid + 1`.
6. If the middle element is greater, move left using `right = mid - 1`.
7. If the loop ends, return `left`.

**Important Observations:**

- If the target exists, return its index immediately.
- If the target doesn't exist, `left` points to its correct insertion position.
- When the loop ends, `left > right`.
- We don't need to shift array elements because the problem only asks for the insertion index.

**Pattern Recognition:**

This is a Binary Search insertion-position pattern.

Whenever a problem asks for the position where an element should be inserted into a sorted array, consider returning `left` after the Binary Search loop.

**Complexity:**

- Time Complexity: O(log n)
- Auxiliary Space Complexity: O(1)

**Key Takeaway:**

Binary Search can find more than existing elements. The final value of `left` can also identify the correct insertion position when the target is absent.

---

### Lesson 29: Sqrt(x) — LeetCode 69

**Problem:**

Given a non-negative integer `x`, return the square root of `x`, rounded down to the nearest integer.

Do not use built-in square root functions.

**Example:**

```java
Input: x = 8
Output: 2

Explanation:
sqrt(8) = 2.828...
The integer part is 2.
```

**Approach: Binary Search on Answer**

Instead of calculating the square root directly, we search for the largest integer whose square is less than or equal to `x`.

1. Initialize `left = 0` and `right = x`.
2. Calculate the middle element.
3. Calculate its square.
4. If `mid * mid <= x`:
    - Store `mid` in `ans`.
    - Search the right half for a potentially larger answer.
5. Otherwise, search the left half.
6. When the loop ends, return `ans`.

**Formula:**

$$
mid = left + \frac{right-left}{2}
$$

The required answer is:

$$
\boxed{\max(mid) \text{ such that } mid^2 \leq x}
$$

**Important Observations:**

- We use `ans` because finding one valid number does not guarantee it is the largest valid number.
- `left = mid + 1` searches for a larger valid answer.
- `right = mid - 1` eliminates numbers whose squares are too large.
- We use `(long) mid * mid` to prevent integer overflow.
- When the loop terminates, `ans` contains the floor square root.

**Dry Run:**

Input: `x = 8`

| left | right | mid | mid² | Action |
|---:|---:|---:|---:|---|
| 0 | 8 | 4 | 16 | Search left |
| 0 | 3 | 1 | 1 | Save 1, search right |
| 2 | 3 | 2 | 4 | Save 2, search right |
| 3 | 3 | 3 | 9 | Search left |

Now `left = 3` and `right = 2`.

Loop terminates.

Output: `2`

**Pattern Recognition:**

This problem introduces **Binary Search on Answer**.

Recognize this pattern when:
- The answer lies within a searchable range.
- You can check whether a candidate answer is valid.
- You need the smallest or largest candidate satisfying a condition.

**Complexity:**

- Time Complexity: \(O(\log x)\) — search space is halved in every iteration.
- Auxiliary Space: \(O(1)\) — only a few variables are used.

**Key Takeaway:**

Binary Search is not limited to finding an existing element in a sorted array.

We can also use it to find an optimal answer within a range by checking whether a candidate answer satisfies a condition.

---
### Lesson 30: Search in Rotated Sorted Array (LeetCode 33)

**Problem:**

Given an array that was originally sorted in ascending order but rotated at an unknown pivot, find the index of a given target.

Return `-1` if the target does not exist.

The solution must run in **O(log n)** time.

**Example:**

```java
int[] arr = {4, 5, 6, 7, 0, 1, 2};
int target = 0;

// Output: 4
```

**Approach: Binary Search**

A rotated sorted array has an important property:

- At least one half of the current search range is always sorted.
- Identify the sorted half.
- Check whether the target belongs to that half.
- Eliminate the half that cannot contain the target.
- Repeat until the target is found or the search space becomes empty.

**Important Observations:**

1. At least one half of the current search range is always sorted.
2. `nums[left] <= nums[mid]` identifies whether the left half is sorted.
3. If the left half is not sorted, the right half is sorted.
4. When the target belongs to the sorted left half, update `right = mid - 1`.
5. When the target belongs to the sorted right half, update `left = mid + 1`.
6. Always check `nums[mid] == target` before eliminating any half.
7. Use `while (left <= right)` to ensure the final remaining element is checked.

**Pattern Recognition:**

**Modified Binary Search**

Whenever an array is sorted but rotated, think about:

1. Identifying the sorted half.
2. Checking whether the target belongs to that half.
3. Eliminating the unnecessary half.

**Complexity:**

- Time Complexity: `O(log n)` — The search space is reduced approximately by half in every iteration.
- Auxiliary Space: `O(1)` — Only a few variables are used.

**Key Takeaway:**

In a rotated sorted array, normal binary search cannot directly decide which direction to move.

Instead, first identify the sorted half, check whether the target belongs to it, and eliminate the other half.

This is an important Binary Search pattern used in many interview problems.

---
### Lesson 31: Find Minimum in Rotated Sorted Array (LeetCode 153)

**Problem:**

Given an array that was originally sorted in ascending order but rotated at an unknown pivot, find and return the minimum element.

The solution must run in **O(log n)** time.

**Example:**

```java
int[] arr = {4, 5, 6, 1, 2, 3};

// Output: 1
```

**Approach: Binary Search**

Instead of searching for a particular target, we use Binary Search to find the minimum element.

Compare the middle element with the rightmost element:

- If `arr[mid] > arr[right]`, the minimum is in the right half, excluding `mid`.
- Otherwise, the minimum is either at `mid` or in the left half.

Continue reducing the search space until `left == right`.



**Formula:**

Middle index:

$$
mid = left + \frac{right-left}{2}
$$

Pointer movement:

$$
\text{If } arr[mid] > arr[right]:
$$

$$
left = mid + 1
$$

Otherwise:

$$
right = mid
$$

**Important Observations:**

1. The array contains distinct elements.
2. We compare `arr[mid]` with `arr[right]`.
3. If the middle element is greater than the rightmost element, the minimum must be to the right of `mid`.
4. Otherwise, the minimum could be at `mid`, so we must not eliminate it.
5. We use `right = mid`, not `right = mid - 1`.
6. We use `while (left < right)` because when both pointers meet, the minimum's index has been found.
7. The final answer is `arr[left]`.

**Pattern Recognition:**

**Binary Search on a Rotated Sorted Array**

When asked to find the minimum element in a rotated sorted array:

1. Calculate `mid`.
2. Compare `arr[mid]` with `arr[right]`.
3. Eliminate the half that cannot contain the minimum.
4. Continue until both pointers meet.

**Complexity:**

- Time Complexity: `O(log n)` — The search space is approximately halved in every iteration.
- Auxiliary Space: `O(1)` — Only a few variables are used.

**Key Takeaway:**

In this problem, we don't search for a target. Instead, we use the relationship between the middle and rightmost elements to determine where the minimum exists.

Remember the important distinction:

- `left = mid + 1` eliminates the middle element.
- `right = mid` keeps the middle element because it could be the minimum.

---



---

## Revision Rules

1. Always check whether an array can be empty before accessing `arr[0]`.
2. Use enhanced `for` when an index is unnecessary.
3. Use normal `for` when index-based operations are required.
4. Finding a maximum or minimum does not require sorting.
5. Track the best value found so far using a variable.