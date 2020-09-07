public class BSTMain {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // print inorder traversal of the BST
        tree.inorder();
        int key = 70;
       if (tree.root.key == key) {
            System.out.println( "Node has been Found");
        }
        else
            System.out.println("Node Not Found");
    }
}
