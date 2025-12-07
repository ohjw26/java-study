package Casting;

//명시적 형변환
//큰 범위에서 작은 범위 대입은 명시적 형변환이 필요
public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValuel //컴파일 오류 발생
        intValue = (int) doubleValue; //형변환
        System.out.println(intValue);
    }
}
