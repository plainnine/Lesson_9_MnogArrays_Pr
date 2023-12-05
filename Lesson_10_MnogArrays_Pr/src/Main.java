import java.util.Scanner;

// Массивы одномерные, многомерные часть 2

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Main | Введите c клавиатуры вариант:\n");
       // int slct = scan.nextInt();
        switch (1) {
            case 1:
                z1 Z1 = new z1();
                Z1.zz1();
                break;
            case 2:
                z2 Z2 = new z2();
                Z2.zz2();
                break;
            default:
                System.out.println("Такого варианта нет");
                scan.close();
        }
    }
}