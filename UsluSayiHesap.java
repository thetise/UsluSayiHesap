package Giris;

import java.util.Scanner;
public class UsluSayiHesap {
    public static void main(String[] args) {

        int number, ust, sum;
        int i;

        sum = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();

        System.out.print("Üst sayısıını giriniz: ");
        ust = input.nextInt();

        for(i=0; i < ust; i++){

            sum = sum * number;

        }
        System.out.print("Sonuç: ");
        System.out.println(sum);
    }
}
