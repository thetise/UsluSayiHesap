package Giris;

import java.util.Scanner;
public class UcveDort {
    public static void main(String[] args) {

        int number;
        int sum = 0;
        int count = 0;
        double Ortalama;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();

        int i;

        for(i=1; i<=number; i++){
            if(i % 3 == 0 && i % 4 == 0){
                sum = sum + i;
                count++;
            }
        }

        Ortalama = sum / count;
        System.out.print("Ortalama: ");
        System.out.println(Ortalama);
    }
}
