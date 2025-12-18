package scanner.ex;

//변수 값 교환
public class ChangeVarEx {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;
        int temp;

         temp = a;
         a = b;
         b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
