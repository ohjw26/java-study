
package Casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int최고값
        long maxIntOver = 2147483648L; //int최고값 + 1 (초과)
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver;
        System.out.println("maxIntOver casting = " + intValue); //출력: -2147483648
        //오버플로우 발생
    }
}
