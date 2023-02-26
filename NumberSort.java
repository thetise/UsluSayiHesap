package Giris;

import java.util.Scanner;

public class NumberSort {
    public static void main(String[] args) {

        int number1, number2, number3;

        System.out.print("İlk sayıyı giriniz: ");
        Scanner input = new Scanner(System.in);
        number1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        number2 = input.nextInt();

        System.out.print("Üçüncü sayıyı giriniz: ");
        number3 = input.nextInt();

        if(number1 > number2 && number1 > number3){
            if(number2 > number3){
                System.out.println("Number1 > Number2 > Number3");
            }
            else if(number3 > number2){
                System.out.println("Number1 > Number3 > Number1");
            }
        }
        if(number2 > number1 && number2 > number3){
            if(number1 > number3){
                System.out.println("Number2 > Number1 > Number3");
            }
            else if(number3 > number1){
                System.out.println("Number2 > Number3 > Number1");
            }
        }
        if(number3 > number1 && number3 > number2){
            if(number1 > number2){
                System.out.println("Number3 > Number1 > Number3");
            }
            else if(number2 > number1){
                System.out.println("Number3 > Number2 > Number1");
            }
        }
    }
}