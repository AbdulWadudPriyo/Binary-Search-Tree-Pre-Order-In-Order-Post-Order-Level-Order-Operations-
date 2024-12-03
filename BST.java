package BinarySearchTree;
import java.util.Scanner;
public class BST {
Node root;
int[] queue;
public BST() {
this.root= null;
queue =new int[500];
}
public Node getNode() {
Node newNode = new Node();
Scanner input = new Scanner(System.in);
System.out.println(&quot;Enter Data:&quot;);
newNode.data = input.nextInt();
newNode.left = null;
newNode.right = null;
return newNode;
}
public void insertBST() {
Node newNode = getNode();
if(root==null) {
root = newNode;
}
else {
Node temp = root;
while(true) {
if(newNode.data&lt;temp.data) {
if(temp.left==null) {
temp.left=newNode;
break;
}
else {
temp = temp.left;
}
}
if(newNode.data&gt;temp.data) {
if(temp.right==null) {
temp.right=newNode;
break;
}
else {
temp = temp.right;
}
}
}
}
}
public void preOrder(Node temp) {
if(temp!=null) {

System.out.println(temp.data+&quot; &quot;);
preOrder(temp.left);
preOrder(temp.right);
}
}
public void inOrder(Node temp) {
if(temp!=null) {
inOrder(temp.left);
System.out.println(temp.data+&quot; &quot;);
inOrder(temp.right);
}
}
public void postOrder(Node temp) {
if(temp!=null) {
postOrder(temp.left);
postOrder(temp.right);
System.out.println(temp.data+&quot; &quot;);
}
}
public void levelOrder(Node temp, int index) {
if(temp!=null) {
queue[index]=temp.data;
levelOrder(temp.left, 2*index+1);
levelOrder(temp.right, 2*index+2);
}
}
public void printQueue() {
for(int i=0; i&lt;queue.length; i++) {
if(queue[i]!=0) {
System.out.println(queue[i]+&quot; &quot;);
}
}
}
}