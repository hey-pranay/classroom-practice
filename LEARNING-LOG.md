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

## Revision Rules

1. Always check whether an array can be empty before accessing `arr[0]`.
2. Use enhanced `for` when an index is unnecessary.
3. Use normal `for` when index-based operations are required.
4. Finding a maximum or minimum does not require sorting.
5. Track the best value found so far using a variable.
