package Giris;

import java.util.Scanner;

public class FourandFiveFindPower {
    public static void main(String[] args) {

        double number;
        double i;
        double DortKuvvet;
        double BesKuvvet;


        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        System.out.println("Girilen sayıya kadar 4'ün kuvvetleri: ");
        for(i = 0; i < number; i++){
            DortKuvvet = Math.pow(4, i);
            if(DortKuvvet < number){
                System.out.println(DortKuvvet);
            }
        }

        System.out.println("Girilen sayıya kadar 5'in kuvvetleri: ");
        for(i = 0; i < number; i++){
            BesKuvvet = Math.pow(5, i);
            if(BesKuvvet < number){
                System.out.println(BesKuvvet);
            }
        }
    }
}
