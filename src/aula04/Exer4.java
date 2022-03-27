package aula04;

import java.util.Scanner;

public class Exer4 {

    public static void main(String[] args) {
        /*
            Escreva um programa que lê do teclado uma data composta pelo mês, pelo ano,
            e ainda pelo dia da semana em que começa esse mês (1 = Segunda, 2 = Terça,
            3 = Quarta, 4 = Quinta, 5 = Sexta, 6 = Sábado, 7 = Domingo) e que desenha
            no monitor o calendário desse mês com o formato que a seguir se apresenta.

                February 2019
            Su Mo Tu We Th Fr Sa
                            1  2
             3  4  5  6  7  8  9
            10 11 12 13 14 15 16
            17 18 19 20 21 22 23
            24 25 26 27 28 
        */
        
        int[] values = readValues();
        drawCalendar(values[0], values[1], values[2]);
    }

    public static int[] readValues() {
        Scanner sc = new Scanner(System.in);
        int month = Util.getInt("Introduz o mês: ", sc);
        int year = Util.getInt("Introduz o ano: ", sc);
        int weekDay = Util.getInt("Introduz o dia da semana: ", sc);
        sc.close();
        return new int[] { month, year, weekDay };
    }

    public static int numberOfDaysInMonth(int month, int year) {
        if (month == 2) {
            if (isLeapYear(year)) return 29;
            return 28;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) return 30;
        return 31;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static void drawCalendar(int month, int year, int weekDay) {

    }
    
}
