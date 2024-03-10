# AVL-Practice-and-notes
Simple AVL structure to for practice


AVL Tree Implementation
This repository contains a Java implementation of an AVL (Adelson-Velsky and Landis) tree—a self-balancing binary search tree. The AVL tree ensures that the tree remains balanced after every insertion operation, maintaining logarithmic height and efficient search, insertion, and deletion operations.

AVLTree Class
The AVLTree class represents the AVL tree and includes the following methods:

Public Methods
Constructor: public AVLTree()

Initializes an empty AVL tree.
Insert Method: public void insert(int key)

Inserts a key into the AVL tree.
Private Methods
Height Method: private int height(AVLNode node)

Returns the height of a given node.
Get Balance Method: private int getBalance(AVLNode node)

Returns the balance factor of a given node.
Update Height Method: private void updateHeight(AVLNode node)

Updates the height of a given node.
Right Rotate Method: private AVLNode rightRotate(AVLNode y)

Performs a right rotation on a given node.
Left Rotate Method: private AVLNode leftRotate(AVLNode x)

Performs a left rotation on a given node.
Insert Recursive Method: private AVLNode insertRecursive(AVLNode node, int key)

Recursive method to insert a key into the AVL tree.
AVLNode Class
The AVLNode class represents a node in the AVL tree and includes the following properties:

key: Key or value of the node.
height: Height of the node.
left: Left child.
right: Right child.

Usage
To use the AVL tree, create an instance of the AVLTree class and call the insert method to insert keys into the tree. A sample usage is provided in the main method of the AVLTree class.
