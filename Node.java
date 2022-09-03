/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 12fat
 */
/* Doubly Linked list Node*/
public class Node {
    int data; 
    Node prev; 
    Node next; 
// Constructor to create a new node 
// next and prev is by default initialized as null 
    Node(int d) {
    data = d;
    prev=null;
    next=null; }// Constructor
}//class 
