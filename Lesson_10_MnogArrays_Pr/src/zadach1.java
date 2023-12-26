import java.util.Scanner;

//Два одномерных массива заполняются случайными числами. Необходимо:
//1 Сформировать третий массив, содержащий элементы обоих массивов;
//2 Сформировать третий массив, содержащий элементы обоих массивов без повторений;
//3 Сформировать третий массив, содержащий элементы общие для двух массивов;
//5 Сформировать третий массив, содержащий только минимальное и максимальное значение каждого из массивов.
public class zadach1 {
    public void zz1() {
        int[] mas01 = new int[5];
        int[] mas02 = new int[5];
        String s1 = "";
        //объявляется переменная типа массив с именем mas

        mas01[0] = 1;
        mas01[1] = 9;
        mas01[2] = 2;
        mas01[3] = 4;
        mas01[4] = 5;

        mas02[0] = 5;
        mas02[1] = 7;
        mas02[2] = 8;
        mas02[3] = 9;
        mas02[4] = 3;

        s1 = "mas01/ ";
        for (int i = 0; i < mas01.length; i++) {
         //  mas01[i] = (int) (1 + Math.random() * 10 );
            s1 = s1 +"№_"+i+": "+ mas01[i] + " | ";
        }
        System.out.println(s1);

        s1 = "mas02/ ";
        for (int i = 0; i < mas02.length; i++) {
         //   mas02[i] = (int) (1 + Math.random() * 10 );
            s1 = s1 +"№_"+i+": "+ mas02[i] + " | ";

        }
        System.out.println(s1);

        int[] mas1 = new int[mas01.length+mas02.length];
        int count1 = 0;
        for (int i = 0; i < mas01.length; i++) {
            mas1[i] =  mas01[i];
            count1++;
        }
        for (int j : mas02) {
            mas1[count1++] = j;
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("\n z1 | Введите c клавиатуры вариант:\n");
        int slct = 4;
        switch (slct) {
            case 1: {
                System.out.println("1) Сформировать третий массив, содержащий элементы обоих массивов;");

                s1 = "mas1/ ";
                for (int i = 0; i < mas1.length; i++) {

                    s1 = s1 + "№_"+i+": " + mas1[i] + " | ";
                }
                System.out.println("1) "+s1);
            }
            break;
            case 2: {
                s1 = "mas2/ ";
                System.out.println("2) Сформировать третий массив, содержащий элементы обоих массивов без повторений;");
                int[] mas2 = new int[mas1.length];
                boolean LogProverkaMas2 = false;
                for (int i = 0; i < mas2.length; i++) { //mas2 массив пуст
                    for (int j1 = i; j1 < mas1.length; j1++) {

                        for (int j2 = 0; j2 < mas1.length; j2++) {
                            if ((mas1[j2] == mas1[j1])&&(j1!=j2)) {//mas2 поиск уникальных
                                LogProverkaMas2 = true;
                                break;
                            }
                        }
                        if (i > 0) {
                            for (int i2 = 0; i2 < i; i2++) { //mas2 массив уже не пуст
                                if (mas2[i2] == mas1[j1]) {
                                    LogProverkaMas2 = false;
                                    break;
                                }
                            }}
                        if (LogProverkaMas2) {
                            mas2[i] = mas1[j1];
                            s1 = s1 + "№_"+i+": " + mas2[i] + " | ";
                            break;
                        }
                       // LogProverkaMas2 = true;
                    }
                } // Запись уникальных чисел из массива
                System.out.println("\n 2) "+s1);
            }
            break;
            case 3: {
                System.out.println("3) Сформировать третий массив, содержащий элементы общие для двух массивов;");
                s1 = "mas3/ ";
                int[] mas3 = new int[mas1.length];
                boolean LogProverkaMas3 = false;
                for (int i = 0; i < mas3.length; i++) { //mas2 массив пуст
                    for (int j1 = i; j1 < mas1.length; j1++) {
                        for (int j2 = 0; j2 < mas1.length; j2++) { //mas2 поиск повторов
                            if ((mas1[j2] == mas1[j1])&&(j1!=j2)) {
                                LogProverkaMas3 = true;
                                break;
                            }}
                        if (i > 0) {
                            for (int i2 = 0; i2 < i; i2++) { //mas2 массив уже не пуст
                                if (mas3[i2] == mas1[j1]) {
                                    LogProverkaMas3 = false;
                                    break;
                                }}
                        }
                     if (LogProverkaMas3) {
                            mas3[i] = mas1[j1];
                            s1 = s1 + "№_" + i + ": " + mas3[i] + " | ";
                            LogProverkaMas3 = false;
                            break;
                        }
                    }} // Запись уникальных чисел из массива
                System.out.println("\n 3) "+s1);
            }
            break;
            case 4: {
System.out.println("5) Сформировать третий массив, содержащий только минимальное и максимальное значение каждого из массивов");
            s1 = "mas4/ ";
            int[] mas4 = new int[2];
            boolean LogProverkaMas4 = false;
            for (int i = 0; i < mas4.length; i++) { //mas массив пуст
            for (int j1 = i; j1 < mas1.length; j1++) {


                 if (LogProverkaMas4) {
                  mas4[i] = mas1[j1];
                  s1 = s1 + "№_" + i + ": " + mas4[i] + " | ";
                  LogProverkaMas4 = false;
                  break;
                    }
                    }}
            System.out.println("\n 3) "+s1);
            break;
            }
            default:
                System.out.println("\n Такого варианта нет");
        }
}}
