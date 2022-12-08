public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }


    public static void task1() {
        System.out.println("Задача 1");
        //С помощью цикла for выведите в консоль все числа от 1 до 10.
        for (int a = 1; a <= 10; a++) {
            System.out.println("Итерация цикла " + a);
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
//С помощью цикла for выведите в консоль все числа от 10 до 1.
        for (int b = 10; b >= 1; b--) {
            System.out.println("Итерация цикла отсчета " + b);

        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        //Выведите в консоль все четные числа от 0 до 17.
        for (int c = 2; c <= 17; c = c + 2) {
            System.out.println("Четное число " + c);
        }
        System.out.println();

    }

    public static void task4() {
        System.out.println("Задача 4");
        //Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
        for (int e = 10; e >= -10; e--) {
            System.out.println(e);
        }
        System.out.println();
    }


    private static void task5() {
        System.out.println("Задача 5");
        //Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096. В консоль результат должен выводиться в формате: «… год является високосным»
        for (int d = 1904; d <= 2096; d = d + 4) {
            System.out.println(d + "год является високосным");
        }
        System.out.println();
    }

    private static void task6() {
        System.out.println("Задача 6");
        //Напишите программу, которая выводит в консоль последовательность чисел:
        //
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
        for (int f = 7; f <= 98; f = f + 7) {
            System.out.print(f + " ");
        }
        System.out.println();

    }

    private static void task7() {

        System.out.println("Задача 7");
        //
        //Напишите программу, которая выводит в консоль последовательность чисел:
        //
        //1 2 4 8 16 32 64 128 256 512
        for (int g = 1; g <= 512; g = g * 2) {
            System.out.print(g + " ");
        }
        System.out.println();
    }

    private static void task8() {
        System.out.println("Задача 8");
        //Задача 8
        //Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
        //
        //Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
        int contribution = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + contribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");

        }
        System.out.println();
    }

    public static void task9() {
        System.out.println("Задача 9");
        //Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку», а в банк под проценты — 12% годовых. Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
        int deposit = 29000;
        int total2 = 0;
        for (int i = 1; i <= 12; i++) {
            total2 = total2 + total2 / 100;
            total2 = total2 + deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total2 + " рублей");
        }
        System.out.println();
    }

    public static void task10() {
        System.out.println("Задача 10");
        //Напишите программу, которая выводит в консоль таблицу умножения на 2:
        //
        //2*1=2
        //
        //2*2=4
        //
        //2*3=6
        //
        //2*4=8
        //
        //2*5=10
        //
        //2*6=12
        //
        //2*7=14
        //
        //2*8=16
        //
        //2*9=18
        //
        //2*10=20
        int l = 0;
        for (int q = 1; q <= 10; q++) {
            l = 2 * q;
            System.out.println("2*" + q + "=" + l);
        }
        System.out.println();
    }


}



