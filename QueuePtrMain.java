/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 12fat
 */
public class QueuePtrMain {
    public static void main(String arg[]){
   QueuePtr Q = new QueuePtr () ;
   Q.ENQUEUE(4);
   Q.ENQUEUE(6);
   Q.ENQUEUE(9);
   Q.ENQUEUE(12);
   while (!Q.isEmpty())
   {
   System.out.println(Q.FRONT ());
   Q.DEQUEUE ();
   }
}  // end of main method
}  // end of class
