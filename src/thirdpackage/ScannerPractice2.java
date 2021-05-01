package thirdpackage;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert your name: ");
        String name = scanner.next();

        System.out.println("please insert number 1: ");
        int number1 = scanner.nextInt();

        System.out.println("please insert number 2: ");
        int number2 = scanner.nextInt();

        System.out.println("if you want to add, insert 1");
        System.out.println("if you want to subtract, insert 2");

        int condition = scanner.nextInt();
        int total=0;
        if (condition==1) {
            total = number1 + number2;
        }else if(condition==2) {
            total = number1 - number2;
        }
        System.out.println(name+"'s result is "+total+".");



    }
}
