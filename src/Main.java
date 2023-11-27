import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

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

        int [] arr = generateRandomArray();
        int minsum = arr[0];
        int maxsum = arr[0];
        for (int item:arr) {
            if (item > maxsum) {
                maxsum = item;
                if (item < minsum) {
                    minsum = item;
                }
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

    static public void task4() {
        System.out.println("Задача №4");
        char[] Name = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = Name.length -1; i >=0 ; i--) {
            System.out.print(Name[i]);

        }
    }
}