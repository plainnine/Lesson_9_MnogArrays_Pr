import java.util.Scanner;

// Массивы одномерные, многомерные часть 2

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Main | Введите c клавиатуры вариант:\n");
       // int slct = scan.nextInt();
        switch (1) {
            case 1:
                zadach1 Z1 = new zadach1();
                Z1.zz1();
                break;
            case 2:
                zadach2 Z2 = new zadach2();
                Z2.zz2();
                break;
            default:
                System.out.println("Такого варианта нет");
                scan.close();
        }
    }
}