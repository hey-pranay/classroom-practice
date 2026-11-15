# DSA Learning Log

This file records important concepts, observations, mistakes, and rules learned while solving DSA problems using Java.

---

## Array Fundamentals

### Lesson 01: Array Traversal

**Concept:** Accessing and processing array elements.

**Forward traversal:**
```java
for (int num : arr) {
    System.out.print(num + " ");
}
```

**Reverse traversal:**
```java
for (int i = arr.length - 1; i >= 0; i--) {
    System.out.print(arr[i] + " ");
}
```

**Calculate array sum:**
```java
int sum = 0;

for (int num : arr) {
    sum += num;
}
```

**Important observations:**
- Use enhanced `for` when you only need element values.
- Use normal `for` when you need the index.
- Reverse traversal does not modify the original array.
- Array indexing starts at `0`.

**Complexity:**
- Time: O(n)
- Auxiliary space: O(1)

---

### Lesson 02: Finding Maximum Element

**Concept:** Find the largest element in an integer array using linear traversal.

**Java implementation:**
```java
int max = Integer.MIN_VALUE;

for (int num : arr) {
    if (num > max) {
        max = num;
    }
}

System.out.println(max);
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
- Time: O(n)
- Auxiliary space: O(1)

**Pattern:** Linear Traversal / Running Maximum.

**Recognition clue:** When a problem asks for the largest element, consider maintaining a variable that stores the maximum value found so far.

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

for (int num : arr) {
    if (num < min) {
        min = num;
    }
}

System.out.println(min);
```

**Important observations:**
- Use `Integer.MAX_VALUE` as the initial value.
- Update `min` only when the current element is smaller.
- An empty array must be handled separately.
- The same traversal pattern works for both maximum and minimum.

**Pattern:** Linear Traversal / Running Minimum.

**Recognition clue:** When asked to find the smallest element in an unsorted array, maintain a variable that stores the smallest value found so far.

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

**Recognition clue:** When asked to find the second-largest or second-smallest element, consider maintaining two candidate values during one traversal.

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

**Recognition clue:** When asked to find the second-smallest element, maintain the smallest and second-smallest candidates during one traversal.

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
## Revision Rules

1. Always check whether an array can be empty before accessing `arr[0]`.
2. Use enhanced `for` when an index is unnecessary.
3. Use normal `for` when index-based operations are required.
4. Finding a maximum or minimum does not require sorting.
5. Track the best value found so far using a variable.