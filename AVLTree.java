
class AVLTree {
    private AVLNode root;
  
    // Constructor to initialize an empty AVL tree
    public AVLTree() {
        this.root = null;
    }

    // Method to get the height of a node
    private int height(AVLNode node) {
        return (node == null) ? 0 : node.height;
    }

    // Method to get the balance factor of a node
    private int getBalance(AVLNode node) {
        return (node == null) ? 0 : (height(node.left) - height(node.right));
    }

    // Method to update the height of a node
    private void updateHeight(AVLNode node) {
        if (node != null) {
            node.height = Math.max(height(node.left), height(node.right)) + 1;
        }
    }

    // Method to perform a right rotation on a given node
    private AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        //update height
        updateHeight(y);
        updateHeight(x);

        return x;
    }
    
    // Method to perform a left rotation on a given node
    private AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;

        //perform rotation
        y.left = x;
        x.right = T2;
        
        //update height
        updateHeight(x);
        updateHeight(y);

        return y;
    }

    // Method to insert a key into the AVL tree
    public void insert(int key) {
        root = insertRecursive(root, key);
    }

     // Recursive method to insert a key into the AVL tree
    private AVLNode insertRecursive(AVLNode node, int key) {
        
        if (node == null) { // Perform standard BST insertion
            System.out.println("Inserting key: " + key + ". Creating a new node.");
            return new AVLNode(key);
        }

        if (key < node.key) {
            System.out.println("Key " + key + " is less than current node key. Moving to the left subtree.");
            node.left = insertRecursive(node.left, key);
        } else if (key > node.key) {
            System.out.println("Key " + key + " is greater than current node key. Moving to the right subtree.");
            node.right = insertRecursive(node.right, key);
        } else {// Duplicate keys are not allowed in AVL tree
            System.out.println("Duplicate key found. Ignoring the duplicate.");
            return node;
        }

        updateHeight(node);   // Update height of the current node

        int balance = getBalance(node);// Get the balance factor to check if this node became unbalanced
        
        // Perform rotations if needed to balance the tree
        
        // Left Left Case
        if (balance > 1 && key < node.left.key) {
            System.out.println("Left Left Case detected. Performing right rotation.");
            return rightRotate(node);
        }
        // Right Right Case
        if (balance < -1 && key > node.right.key) {
            System.out.println("Right Right Case detected. Performing left rotation.");
            return leftRotate(node);
        }
        
        // Left Right Case
        if (balance > 1 && key > node.left.key) {
            System.out.println("Left Right Case detected. Performing left rotation on left child, then right rotation on current node.");
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        
        // Right Left Case
        if (balance < -1 && key < node.right.key) {
            System.out.println("Right Left Case detected. Performing right rotation on right child, then left rotation on current node.");
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        // If the node is still balanced, return it
        System.out.println("Node is balanced. Returning the updated node.");
        return node;
    }



    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();
        avlTree.insert(10);
        avlTree.insert(20);
        avlTree.insert(30);
        avlTree.insert(50);
        avlTree.insert(40);
        avlTree.insert(60);
        avlTree.insert(70);
        avlTree.insert(1);
        avlTree.insert(48);
        avlTree.insert(37);
        avlTree.insert(99);
        avlTree.insert(28);
        
    }
}
