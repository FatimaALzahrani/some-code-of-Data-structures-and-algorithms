/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Selection_Sort;

/**
 *
 * @author 12fat
 */
public class Main {
public static void main (String args []){
  SelectionSort Array=new SelectionSort (6);
    Array.read();
    System.out.print ("Initial Array : ");
    Array.write();
    Array. SelectionSort ();
 System.out.print ("Sorted array with Selection Sort: ");
    Array.write ();
}
}
