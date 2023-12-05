import java.util.Scanner;
import java.util.Arrays;
//Два одномерных массива заполняются случайными числами. Необходимо:
//1 Сформировать третий массив, содержащий элементы обоих массивов;
//2 Сформировать третий массив, содержащий элементы обоих массивов без повторений;
//3 Сформировать третий массив, содержащий элементы общие для двух массивов;
//4 Сформировать третий массив, содержащий только уникальные элементы каждого из массивов;
//5 Сформировать третий массив, содержащий только минимальное и максимальное значение каждого из массивов.
public class z1 {
    public void zz1() {
        int[] mas01 = new int[5];
        int[] mas02 = new int[5];
        String s1 = "";
        //объявляется переменная типа массив с именем mas


        for (int i = 0; i < mas01.length; i++) {
            mas01[i] = (int) (1 + Math.random() * 10 );
            s1 = s1 +" mas01["+i+"]: "+ mas01[i] + " |";
           // System.out.println("mas1["+i+"]: "+ mas01[i]);
        }
        System.out.println(s1);
        s1="";
        for (int i = 0; i < mas02.length; i++) {
            mas02[i] = (int) (1 + Math.random() * 10 );
            s1 = s1 +" mas02["+i+"]: "+ mas02[i] + " |";
          //  System.out.println("mas2["+i+"]: "+ mas02[i]);
        }
        System.out.println(s1);
        s1="";
        Scanner scan = new Scanner(System.in);
        System.out.println("\n z1 | Введите c клавиатуры вариант:\n");
        int slct = scan.nextInt();
        switch (slct) {
            case 1: {
                System.out.println("Сформировать третий массив, содержащий элементы обоих массивов;");
                int[] mas1 = new int[10];
                for (int i = 0; i < mas01.length; i++) {
                    mas1[i] =  mas01[i];
                }
                for (int i = 0; i < mas02.length; i++) {
                    mas1[i + mas01.length] =  mas02[i];
                }
                for (int i = 0; i < mas1.length; i++) {

                    s1 = s1 +" mas1["+i+"]: "+ mas1[i] + " |";
                }
                System.out.println(s1);
                s1="";
            }
            case 2: {
                System.out.println("Сформировать третий массив, содержащий элементы обоих массивов без повторений;");
                int[] mas2 = new int[10];
                boolean b = true;
                for (int i = 0; i < mas2.length; i++) {
                   // for (int i1 = 0; i1 < mas01.length; i1++) {}
                    b = mas2[i] == findNumberInArray(mas01, mas2[i]);
                   if (b==true) {mas2[i] = findNumberInArray(mas01, mas2[i]);}
                    s1 = s1 +" mas2["+i+"]: "+ mas2[i] + " |";
                }
                System.out.println(s1 + " " +b);
                s1="";
            }
            break;
            default:
                System.out.println("Такого варианта нет");
        }
    }

    public static int findNumberInArray(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                return i; // возвращаем индекс элемента, если он найден
            }
        }
        return -1; // возвращаем -1, если элемент не найден
    }

}
