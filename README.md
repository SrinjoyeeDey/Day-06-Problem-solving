# 🌳 Day 6: Binary Search Tree (BST) Problem Solutions

Welcome to my LeetCode Daily Challenge – Day 7/Day 6!
In this repository, I focused on Binary Search Tree (BST) problems. Each problem includes:

Problem Statement 📜

Solution Approaches 💡

Time & Space Complexity ⏱

Edge Cases ⚠



---

## 1️⃣ Sum of Elements in a Range [Low, High]

### Problem Statement:
Given a BST and integers low and high, find the sum of all node values within the inclusive range [low, high].

### Solution Approaches:

Approach 1 – Recursive DFS

Traverse the tree recursively.

Add node value to sum if low ≤ node.val ≤ high.

Explore left if node.val > low, explore right if node.val < high.


Approach 2 – Optimized using BST property

Skip entire subtrees that cannot contain values in the range.


### Complexity:

Type	Complexity

Time	O(N) worst case
Space	O(H) recursion stack


### Edge Cases:

🌳 Empty tree → sum = 0

❌ No nodes in range → sum = 0

✅ All nodes in range → sum = sum of all nodes


### Flowchart:

Start
           |
           v
      Check Node
      /       \
     /         \
  Node < low   Node > high
     |            |
   Go right      Go left
     |            |
     v            v
Add node.val if in range
           |
           v
        Recur left & right
           |
           v
          End


---

## 2️⃣ Find Closest Element in BST

### Problem Statement:
Given a BST and a target, find the node value closest to the target.

### Approach:

Recursive:

Compare target with node value.

Traverse left if target < node.val, else right.

Track closest value along the way.


Iterative (optimized):

Traverse down tree using while loop.

Update closest value if current node is nearer.


### Complexity:

Type	Complexity

Time	O(H) average, O(N) worst
Space	O(H) recursive, O(1) iterative


### Flowchart:

Start
          |
          v
      Check Node
      /       \
   target<val  target>val
      |           |
      v           v
    Go Left      Go Right
      |           |
      +-----------+
          |
          v
 Update closest if needed
          |
          v
         End


---

## 3️⃣ K-th Smallest Element in BST

### Problem Statement:
Return the k-th smallest element in a BST.

### Approach:

In-order traversal (left → root → right gives sorted order).

Increment a counter while visiting nodes.

Return node when counter = k.


Optimized Iterative:

Use stack to simulate in-order traversal.

Stop when k-th node is reached.


### Complexity:

Type	Complexity

Time	O(H + k) average, O(N) worst
Space	O(H) stack


### Edge Cases:

k = 1 → smallest

k = total nodes → largest

k > total nodes → invalid input


### Flowchart:

Start
           |
           v
       Go Left
           |
           v
     Visit Node → increment counter
           |
           v
    counter == k? → Yes → Return
           |
           No
           |
           v
        Go Right
           |
           v
          End


---

## 4️⃣ Validate BST (Two Approaches)

### Problem Statement:
Check if a binary tree is a valid BST.

Approach 1 – Recursive with Limits:

Each node must satisfy: min < node.val < max.

Pass updated limits to child nodes.


Approach 2 – Iterative In-order (Two-pointer):

Traverse in-order iteratively.

Previous node value must always be less than current.


### Complexity:

Type	Complexity

Time	O(N)
Space	O(H)


### Edge Cases:

🌳 Empty tree → valid

Single node → valid

Duplicate values → depends on definition


### Flowchart (Recursive Limits):

Start
         |
         v
     Check Node
         |
   Node < min or > max?
      /       \
    Yes        No
   Invalid   Recur left & right
         |
         v
        End


---

## 5️⃣ Maximum Sum BST in Binary Tree

### Problem Statement:
Find the maximum sum of nodes forming a BST in any subtree of a binary tree.

### Approach:

Post-order Traversal:

For each node, track:

1. isBST → subtree BST validity


2. sum → sum of BST nodes


3. minVal → minimum value


4. maxVal → maximum value




BST Validation:

Valid if left & right subtrees are BST and left.max < node.val < right.min.

Update maxSum if valid.


### Complexity:

Type	Complexity

Time	O(N)
Space	O(H)


### Edge Cases:

Empty tree → sum = 0

Entire tree is BST → sum = sum of all nodes

Multiple BST subtrees → choose max sum


### Flowchart:

Start
           |
           v
      Post-order Traversal
       /           \
     Left          Right
       \            /
        Collect sum, min, max
           |
           v
     Check BST property
      /             \
   Yes               No
   |                 |
Update maxSum       Return invalid
   |
   v
  End


---

### Repository Structure

BST-Problems/
│
├── SumInRange/
│   └── solution.java
├── ClosestValue/
│   └── solution.java
├── KthSmallest/
│   └── solution.java
├── ValidateBST/
│   └── solution.java
├── MaxSumBST/
│   └── solution.java
└── README.md


---

### 🎯 Conclusion

Day 6 focused on BST problems enhancing:

Recursive traversal 🌲

Iterative solutions using stack 🧰

Optimized BST checks ✅

Handling edge cases ⚠


These problems cover common patterns in interviews and demonstrate problem-solving skills using BST properties.



---
