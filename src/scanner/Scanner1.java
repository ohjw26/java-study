package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자를 입력하세요:");
        String str = scanner.nextLine();
        System.out.println("입력한 문자열: " + str);
    }
}
