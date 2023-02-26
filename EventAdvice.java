package Giris;

import java.util.Scanner;
public class EventAdvice {
    public static void main(String[] args) {

        double Sicaklik;

        System.out.print("Sıcaklık değerini giriniz: ");
        Scanner input = new Scanner(System.in);
        Sicaklik = input.nextDouble();

        if(Sicaklik < 5){
            System.out.print("Kayak yapabilirsiniz.");
        }
        if(Sicaklik >= 5 && Sicaklik < 15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if(Sicaklik >= 15 && Sicaklik < 25){
            System.out.println("Piknik yapabilirsiniz.");
        }
        if(Sicaklik >= 25){
            System.out.println("Yüzmeye gibebilirsiniz.");
        }
    }
}
