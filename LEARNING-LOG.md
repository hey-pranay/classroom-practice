# DSA Learning Log

A collection of important concepts, coding observations, problem-solving lessons, and mistakes learned throughout DSA preparation.

The purpose of this file is to maintain a quick revision reference across all DSA topics.

---

# 1. Java Fundamentals for DSA

## For Loop vs Enhanced For Loop

### Normal For Loop

```java
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
```

Use when:
- You need the array index.
- You need to traverse backwards.
- You need to modify elements using their indexes.
- You need to compare elements at different positions.

### Enhanced For Loop

```java
for (int num : arr) {
    System.out.println(num);
}
```

Use when:
- You only need to access element values.
- You don't need the index.
- You want simple, readable traversal.

### Important Difference

| Feature | Normal For | Enhanced For |
|---|---|---|
| Access index | Yes | No |
| Access value | Yes | Yes |
| Reverse traversal | Yes | Not directly |
| Modify array using index | Yes | No |
| Simple traversal | Yes | Yes |

**Remember:** When solving DSA problems, prefer a normal `for` loop whenever the index is important.

---

# 2. Array Fundamentals

## Lesson 01: Array Traversal

Example:

```java
int[] arr = {12, 45, 23, 67, 89, 10};
```

### A. Forward Traversal

```java
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

- Start at index 0.
- Continue while `i < arr.length`.
- Increment using `i++`.

### B. Reverse Traversal

```java
for (int i = arr.length - 1; i >= 0; i--) {
    System.out.println(arr[i]);
}
```

- Start at the last valid index.
- Continue while `i >= 0`.
- Decrement using `i--`.

### C. Calculate Array Sum

```java
int sum = 0;

for (int num : arr) {
    sum += num;
}
```

- Initialize sum to 0.
- Add every element.
- Final value contains the total.

### Important Observations

1. Array indexing starts at 0.
2. Last valid index = `arr.length - 1`.
3. Accessing an array element by index takes O(1).
4. Traversing an array takes O(n).
5. Reverse traversal does not mean modifying or reversing the original array.

### Complexity

| Operation | Time | Extra Space |
|---|---|---|
| Forward traversal | O(n) | O(1) |
| Reverse traversal | O(n) | O(1) |
| Sum of elements | O(n) | O(1) |

---

# 3. Important Rules to Remember

- Never use `i <= arr.length` when accessing an array using `arr[i]`.
- Array indexing begins at 0.
- Initialize maximum/minimum using an actual array element when appropriate.
- Understand the difference between printing in reverse and reversing an array in place.
- Always dry-run loops when the iteration logic is unclear.

---

# 4. Future Learning Entries

New concepts will be added here as we progress.

Each entry should contain:

- Concept or topic.
- What I learned.
- When to use it.
- Important rules.
- Common mistakes.
- A small Java example.

**Revision principle:** Read this file before attempting previously solved problems again.