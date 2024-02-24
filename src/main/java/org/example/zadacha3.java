package org.example;

public class zadacha3 {
    public static void main(String[] args) {
        int a = 30;
        int b = 30;
        int c = 7;
        String month = "12";
        String monthly  = ("Колко" + " " + "е" + " " + "месечната" + " " + "вноска" + " " + "за" + " " + "дадения" + " " + "период?");
        printMyName("Колко" + " " + "e" + " " + "месечната" + " " + "вноска" + " " + "за" + " " + "дадения" + " " + "период?");
        int sum1 = a * c / 12;
        int sum2 = b * c / 12;
        int sum3 = a * c / 12 + b * c / 12 + a * c + b * c;

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
        public static void printMyName (String monthly ) {
            System.out.println(monthly);
        }



            }
