import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
// Задача 1
        System.out.println("Задача 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] volumes = {1.57, 7.654, 9.986};
        short[] clocks = new short[2];
        clocks[0] = 5;
        clocks[1] = 2;
        // Задача 2
        System.out.println("Задача 2");
        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1) {
                System.out.print(numbers[i] + ",");
            } else System.out.println(numbers[i]);
        }
        for (int i = 0; i < volumes.length; i++) {
            if (i != volumes.length - 1) {
                System.out.print(volumes[i] + ",");
            } else System.out.println(volumes[i]);
        }

        for (int i = 0; i < clocks.length; i++) {
            if (i != clocks.length - 1) {
                System.out.print(clocks[i] + ",");
            } else System.out.println(clocks[i]);
        }
        // Задача 3
        System.out.println("Задача 3");
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(numbers[i] + ",");
            } else System.out.println(numbers[i]);
        }
        for (int i = volumes.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(volumes[i] + ",");
            } else System.out.println(volumes[i]);
        }

        for (int i = clocks.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(clocks[i] + ",");
            } else System.out.println(clocks[i]);
        }
        // задача 4
        System.out.println("Задача 4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] +=  1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
