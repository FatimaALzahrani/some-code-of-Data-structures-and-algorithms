package Stack_Using_Array;
/**
 *
 * @author 12fat
 */
public class StackArMain {
    public static void main(String arg[]){
    //ط§ط³ظˆظٹ ط§ظˆط¨ط¬ظƒطھ ط¹ط´ط§ظ† ط§ط³طھط¯ط¹ظٹ ظ…ظ† ط§ظ„ظƒظ„ط§ط³ ط§ظ„ظ„ظٹ ظپظٹظ‡ ط§ظ„ظ…ظٹط«ظˆط¯ط²
StackAr fat = new StackAr(5);
//ظ†ط¶ظٹظپ ط¹ظ†ط§طµط± 
fat.push(1);
fat.push(2);
fat.push(3);
fat.push(4);
while(!fat.isEmpty()){//ط§ط°ط§ ظ…ط§ ظƒط§ظ†طھ ط§ظ„ط³طھط§ظƒ ظپط§ط¶ظٹظ‡
System.out.println(fat.Top());//ط§ط·ط¨ط¹ ط§ظ„طھظˆط¨ (ط§ط®ط± ط¹ظ†طµط± ظپظٹ ط§ظ„ط§ط³طھط§ظƒ)
fat.pop();//ط§ط­ط°ظپ ط§ظ„ط¹ظ†طµط± ط§ظ„ظ„ظٹ ط·ط¨ط¹طھظ‡ ط¹ط´ط§ظ† ظ†ط±ظˆط­ ظ„ظ„ط¹ظ†طµط± ط§ظ„ظ„ظٹ ط¨ط¹ط¯ظ‡
}//while loop
} // main method
} // class
