package Giris;

import java.util.Scanner;
public class ArtikYilHesap {
    public static void main(String[] args) {

        int Year;

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        Year = input.nextInt();

        if(Year % 4 == 0){
            System.out.print(Year);
            System.out.println(" bir artık yıldır !");
        }
        if(Year % 400 == 0){
            System.out.print(Year);
            System.out.println(" bir artık yıldır !");
        }
        if(Year % 4 != 0){
            System.out.print(Year);
            System.out.println(" bir artık yıl değildir !");
        }
    }
}
