package BinarySearchTree;
public class Main {
public static void main(String[] args) {
BST bst = new BST();
bst.insertBST();
bst.insertBST();
bst.insertBST();
bst.insertBST();
bst.insertBST();
bst.insertBST();
System.out.println(&quot;Pre Order:&quot;);
bst.preOrder(bst.root);
System.out.println(&quot;In Order:&quot;);

bst.inOrder(bst.root);
System.out.println(&quot;Post Order:&quot;);
bst.postOrder(bst.root);
System.out.println(&quot;level Order:&quot;);
bst.levelOrder(bst.root, 0);
bst.printQueue();
}
}