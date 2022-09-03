/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 12fat
 */
public class BinaryTree {
         Node root;
     BinaryTree () {root = null;} 
     //L-R-root
     void Postorder (Node node){ 
if (node == null) return;
Postorder (node.left);// left subtree
Postorder (node.right);// right subtree
System.out.print(node.key+"  ");  // then print the node
}

// root-L-R
void Preorder (Node node){
 if(node == null)return;
System.out.print(node.key+"  ");// print the node
Preorder (node.left); // left subtree
Preorder (node.right);// right subtree
}

//L-root-R
void Inorder (Node node){// an inorder traversal
if(node == null) return;
Inorder (node.left);// left subtree
System.out.print(node.key+"  "); // print the node
Inorder (node.right);// right subtree
}
}
