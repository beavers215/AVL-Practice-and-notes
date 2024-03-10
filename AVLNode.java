

class AVLNode {
    int key;          // Key or value of the node
    int height;       // Height of the node
    AVLNode left;     // Left child
    AVLNode right;    // Right child

    // Constructor to initialize a new node
    public AVLNode(int key) {
        this.key = key;
        this.height = 1; // New node has height 1
        this.left = null;
        this.right = null;
    }
    public String toString() {
        return "Node(" +
                "key=" + key +
                ", height=" + height +
                ", left=" + (left != null ? left.key : "null") +
                ", right=" + (right != null ? right.key : "null") +
                ')';
    }
}

/*
 * 1. Binary Search Tree (BST) Property:
At its core, an AVL tree is a binary search tree, meaning that each node has at 
most two children.
For every node, all nodes in its left subtree have keys less than its key, and 
all nodes in its right subtree have keys greater than its key.

2. Balance Factor:
The balance factor of a node is defined as the difference between the height of 
its left subtree and the height of its right subtree.
Balance factor = height(left subtree) - height(right subtree)

3. AVL Tree Property:
An AVL tree is a balanced binary search tree where the balance factor of every 
node is in the range [-1, 0, 1].
The tree is kept balanced by performing rotations (single or double) whenever 
the balance factor violates this range during insertions and deletions.

4. Rotations:
Rotations are the fundamental operations to maintain the balance of the AVL tree.
There are four types of rotations: left rotation, right rotation, left-right r
otation (LR), and right-left rotation (RL).
Rotations are applied when an imbalance occurs during an insertion or deletion.

5. Insertion:
During an insertion, the AVL tree is updated like a regular binary search tree.
After insertion, the heights of ancestors along the path to the root are updated.
If the AVL property is violated (balance factor becomes less than -1 or greater 
than 1), rotations are performed to restore balance.

6. Deletion:
During a deletion, the AVL tree is updated like a regular binary search tree.
After deletion, the heights of ancestors along the path to the root are updated.
If the AVL property is violated, rotations are performed to restore balance.

7. Single and Double Rotations:
Single rotations (left or right) are performed when an imbalance occurs with a 
node and its child.
Double rotations (LR or RL) are performed when an imbalance occurs with a node 
and its grandchild.

8. Height Update:
After each rotation or tree modification, the height of each node is updated.
The height of a node is the maximum height among its left and right children, 
plus one.

9. Advantages:
AVL trees ensure that the height of the tree remains logarithmic, providing 
efficient search, insertion, and deletion operations.
The self-balancing property helps in maintaining a balanced structure, 
preventing performance degradation in skewed scenarios.

10. Real-world Applications:
AVL trees are widely used in databases, file systems, networking, and other 
applications where efficient search and retrieval are crucial.
In summary, AVL trees are designed to provide a balanced and efficient binary 
search tree structure, and they achieve this through self-balancing techniques 
involving rotations and height adjustments. The AVL property ensures that the 
tree remains balanced, leading to optimal performance in various applications.
 */