import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива:   ");
        int sz = in.nextInt();

        System.out.println("Введите вещественные данные массива:");
        double[] arr = new double[sz];
        double avg = 0;  // Среднее арифметическое элементов массива
        for (int i = 0; i < sz; ++i) {
            System.out.print("array[" + i + "] = ");
            arr[i] = in.nextDouble();
            avg += arr[i];
        }
        avg /= sz;

        int i = 0;
        for (double el : arr) {
            System.out.println("array[" + i++ + "] * avg = " + el * avg);
        }
    }
}