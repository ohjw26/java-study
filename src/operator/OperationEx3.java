package operator;

public class OperationEx3 {
    public static void main(String[] args) {
        int score = 80;

//        if (score >= 80 && score <= 100) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }

        boolean result = score >= 80 && score <= 100;
        System.out.println(result);
    }
}
