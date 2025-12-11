package scanner;

import java.util.Scanner;
import java.util.SortedMap;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner 변수 선언

        System.out.println("문자를 입력하세요:");
        //엔터(\n)를 입력할 때 까지 문자를 가져온다
        String str = scanner.nextLine(); //입력한 문자열을 String으로 가져온다
        System.out.println("입력한 문자열: " + str);

        System.out.println("정수를 입력하세요:");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수: " + intValue);

        System.out.println("실수를 입력하세요:");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수: " + doubleValue);
    }
}
