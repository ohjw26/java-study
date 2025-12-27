package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for문
        for (int i = 0; i < numbers.length; ++i) {
            int number = numbers[i];
            System.out.println(number);
        }

        //향상된 for문, for-each문
        for (int number : numbers) {
            System.out.println(number);
        }

        //증가하는 index값 필요
        for (int i = 0; i < numbers.length; ++i) {
            System.out.println("number" + i + "번의 결과는: " + numbers[i]); //향상된 for문을 사용하지 못하는 경우(억지스럽게 가능은 하나, 일반 for문을 사용하는 것이 더 좋음)
        }
    }
}
