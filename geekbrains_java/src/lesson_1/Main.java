package lesson_1;

public class Main {

    public static void main(String[] args) {
        // примитивные типы данных
        byte b1 = 1;
        short s1 = 300;
        int i1 = 3000;
        long l1 = 20000;

        float f1 = 123.5f;
        double d1 = 123.5;

        boolean bol1 = true;
        char c1 = 's';

        //ссылочные типы данныых
        String str = "Hello!";

        System.out.println(mathFormula(10, 3, 20, 5));

        System.out.println(summTwoNumber(10, 3));

        numberSign(-7);

        System.out.println(signNumber(-5));

        nameUser("Анна");

        leapYear(2000);
    }

    static int mathFormula(int a, int b, int c, int d) {
        return a * (b + (c / d));
        }

    static boolean summTwoNumber(int a, int b) {
        if(a+b >= 10 && a+b <= 20)
             return true;
        else
            return false;
    }

    static void numberSign(int a) {
        System.out.println(a < 0 ? "Отрицательное число" : "Положительное число");
    }

    static boolean signNumber(int b) {
        if(b < 0)
            return true;
        else
            return false;
    }

    static void  nameUser(String c) {
        System.out.println("Привет, " + c + "!");
    }

    static void leapYear(int year) {
        System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? year + "- високосный год": year + " - невисокосный год");
    }
}


