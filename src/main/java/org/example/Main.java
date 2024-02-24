package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String firstName = "Georgi";
        String secondName = "Mariyanov";
        String lastName = "Nikolov";
        String fullName = "Georgi" + " " + "Mariyanov" + " " + "Nikolov";
        int a = 30;
        String email = "gosho93@gmail.com";
        String adress = "Raiko" + " " + "Daskalov 3" + " " + "Devnya";
        String phonenumber = "+359896851557";
        String postcode = "9415";
        String additionalinfo = "mnogo dobar";
        printMyName();
        System.out.println(fullName);
        System.out.println(30);
        System.out.println(email);
        System.out.println(adress);
        System.out.println(phonenumber);
        System.out.println(postcode);
        System.out.println(additionalinfo);
    }

    public static void printMyName() {
        String fullName = "Georgi" + " " + "Mariyanov" + " " + "Nikolov";
        System.out.println(fullName);
    }
    }
