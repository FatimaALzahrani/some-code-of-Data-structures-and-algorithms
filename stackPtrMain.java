/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_Using_List;

/**
 *
 * @author 12fat
 */
public class stackPtrMain {
public static void main(String arg[]){
StackPtr fat = new StackPtr();
fat.push(4);
fat.push(3);
fat.push(2);
fat.push(1);
  System.out.println("the stack is : ");
while(!fat.isEmpty()){
  System.out.println(fat.Top());
  fat.pop();
}//while loop
  System.out.println("the stack after make it null : ");
fat.makeNull();
}// End of the main function
}
