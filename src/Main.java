import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();

    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    static public void task1() {

        System.out.println("Задача 1");

        int [] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];}

        System.out.println("«Сумма трат за месяц составила " + sum + " рублей»");

        System.out.println( );
    }
    public static void task2() {

        System.out.println("Задача 2");

        int maxsum = -1;
        int minsum = 200_001;
        int [] arr = generateRandomArray();
        for (int element : arr) {
            if (element > maxsum) {
                maxsum = element;
            }
            if (element < minsum) {
                minsum = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+ minsum + " рублей");
        System.out.println("Максимальная сумма трат за день составила "+ maxsum + " рублей»");


        System.out.println( );
    }
    static public void task3() {

        System.out.println("Задача 3");

        float sred = 0;
        float suma = 0;
        int [] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
            sred = suma / 30;
        }
        System.out.println(suma);
        System.out.println(sred);

        System.out.println( );
    }

}