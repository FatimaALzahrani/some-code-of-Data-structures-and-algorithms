/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 12fat
 */
public class BinaryTreeMain {
 public static void main(String arg [])	{
BinaryTree T = new BinaryTree();
// the following lines construct a simple tree 
T.root = new Node(1);
T.root.left = new Node(2);
T.root.right = new Node(3);
T.root.left.left = new Node(4);
T.root.left.right = new Node(5);
System.out.print("\nPreorder traversal of this binary tree is   "); 
T.Preorder(T.root);
System.out.print("\nInorder traversal of this binary tree is   "); 
T.Inorder(T.root);
System.out.print("\nPostorder traversal of this binary tree is  "); 
T.Postorder(T.root);
 }
}
