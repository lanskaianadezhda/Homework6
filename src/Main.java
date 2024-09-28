public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //task 2
        System.out.println("Задача 2");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //task 3
        System.out.println("Задача 3");

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        //task 4
        System.out.println("Задача 4");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //task 5
        System.out.println("Задача 5");

        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        //task 6
        System.out.println("Задача 6");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        //task 7
        System.out.println("Задача 7");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        //task 8
        System.out.println("Задача 8");

        int income = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + income;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }

        //task 9
        System.out.println("Задача 9");

        income = 29000;
        total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + income;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

        //task 10
        System.out.println("Задача 10");

        int number = 0;
        int number2 = 2;
        for (int i = 1; i <= 10; i++) {
            number = number + number2;
            System.out.println(number2 + "*" + i + "=" + number);
        }
    }
}