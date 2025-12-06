package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;
        if (m > 10) {
            int temp = m * 2; //메모리 효율적 사용, 유지보수 용이
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
