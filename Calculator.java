package Giris;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        double number1, number2, sum;
        int operator;

        System.out.print("Enter a first number: ");
        Scanner input = new Scanner(System.in);
        number1 = input.nextDouble();

        System.out.print("Enter a second number: ");
        number2= input.nextDouble();

        System.out.println("Toplama işlemi için case kısmına 1 yazınız.");
        System.out.println("Çıkarma işlemi için case kısmına 2 yazınız.");
        System.out.println("Çarpma işlemi için case kısmına 3 yazınız.");
        System.out.println("Bölme işlemi için case kısmına 4 yazınız.");

        System.out.print("Enter a case: ");
        operator = input.nextInt();

        switch (operator){
            case 1:
                sum = number1 + number2;
                System.out.print("Toplam: ");
                System.out.print(sum);
                break;
            case 2:
                sum = number1 - number2;
                System.out.print("Cıkarma: ");
                System.out.print(sum);
                break;
            case 3:
                sum = number1 * number2;
                System.out.print("Carpım: ");
                System.out.print(sum);
                break;
            case 4:
                sum = number1 / number2;
                System.out.print("Bölüm: ");
                System.out.print(sum);
                break;
        }
    }
}