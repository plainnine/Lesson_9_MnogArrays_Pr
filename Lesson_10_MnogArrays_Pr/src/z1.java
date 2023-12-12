import java.util.Scanner;
import java.util.Arrays;
//Два одномерных массива заполняются случайными числами. Необходимо:
//1 Сформировать третий массив, содержащий элементы обоих массивов;
//2 Сформировать третий массив, содержащий элементы обоих массивов без повторений;
//3 Сформировать третий массив, содержащий элементы общие для двух массивов;
//5 Сформировать третий массив, содержащий только минимальное и максимальное значение каждого из массивов.
public class z1 {
    public void zz1() {
        int[] mas01 = new int[5];
        int[] mas02 = new int[5];
        String s1 = "";
        //объявляется переменная типа массив с именем mas

     /*  mas01[0] = 1;
        mas01[1] = 2;
        mas01[2] = 2;
        mas01[3] = 3;
        mas01[4] = 4;
        mas02[0] = 4;
        mas02[1] = 5;
        mas02[2] = 6;
        mas02[3] = 7;
        mas02[4] = 8;
*/
        s1 = "mas01 ";
        for (int i = 0; i < mas01.length; i++) {
           mas01[i] = (int) (1 + Math.random() * 10 );
            s1 = s1 +"№ "+i+": "+ mas01[i] + " | ";
        }
        System.out.println(s1);

        s1 = "mas02 ";
        for (int i = 0; i < mas02.length; i++) {
            mas02[i] = (int) (1 + Math.random() * 10 );
            s1 = s1 +"№ "+i+": "+ mas02[i] + " | ";

        }
        System.out.println(s1);

        Scanner scan = new Scanner(System.in);
        System.out.println("\n z1 | Введите c клавиатуры вариант:\n");
        int slct = 3;
        switch (slct) {
            case 1: {
                System.out.println("1) Сформировать третий массив, содержащий элементы обоих массивов;");
                int[] mas1 = new int[10];
                s1 = "mas1 ";
                for (int i = 0; i < mas01.length; i++) {
                    mas1[i] =  mas01[i];
                }
                for (int i = 0; i < mas02.length; i++) {
                    mas1[i + mas01.length] =  mas02[i];
                }
                for (int i = 0; i < mas1.length; i++) {

                    s1 = s1 + "№ "+i+": " + mas1[i] + " | ";
                }
                System.out.println("1) "+s1);

            }
            break;
            case 2: {
                System.out.println("2) Сформировать третий массив, содержащий элементы обоих массивов без повторений;");
                int[] mas2 = new int[10];
                s1 = "mas2 ";
                boolean LogProverkaMas01 = true;
                boolean LogProverkaMas02 = true;
               int i0 = 0;
                for (int i = 0; i < mas2.length; i++) { //mas2 массив пуст
                    for (int j1 : mas01) { //mas01 в массиве повторы
                        for (int i2 = 0; i2 < i; i2++) {
                            //mas2 массив уже не пуст
                            if (mas2[i2] == j1) {
                                LogProverkaMas01 = false;
                                break;
                            }

                        }
                        if (LogProverkaMas01) {
                            mas2[i] = j1;
                            s1 = s1 + "№ "+i+": " + mas2[i] + " | ";
                            i0++; //
                            break;
                        }
                        LogProverkaMas01 = true;
                    }

                } // Запись уникальных чисел из 1 массива
                for (int i = i0; i < mas2.length; i++) {
                 for (int j2 : mas02) { //mas02 в массиве повторы
                    for (int i2 = 0; i2 < i; i2++) {
                        //mas2 массив уже не пуст
                        if (mas2[i2] == j2) {
                            LogProverkaMas02 = false;
                            break;
                        }
                    }
                    if (LogProverkaMas02) {
                        mas2[i] = j2;
                        s1 = s1 + "№ "+i+": " + mas2[i] + " | ";
                        break;
                    }
                     LogProverkaMas02 = true;
                }}
                System.out.println("\n 2) "+s1 + " ");

            }
            break;
            case 3: {
                System.out.println("3) Сформировать третий массив, содержащий элементы общие для двух массивов;");
                int[] mas3 = new int[10];
                boolean LogProverkaMas3 = true;
                s1 = "mas3 ";
                for (int i = 0; i < mas3.length; i++) { //mas3 массив пуст

                        for (int i2 = 0; i2 < i; i2++) {
                            //mas3 массив уже не пуст
                            if (mas3[i2] == j1) {
                                LogProverkaMas3 = false;
                                break;
                            }

                        }

                        if (LogProverkaMas3) {
                            mas3[i] = j1;
                            s1 = s1 + "№ "+i+": " + mas3[i] + " | ";

                            break;
                        }
                        LogProverkaMas3 = true;


                }
                System.out.println("\n 3) "+s1 + " ");
                
            }
            break;
            default:
                System.out.println("\n Такого варианта нет");
        }
    }

}
