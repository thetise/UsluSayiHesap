package Giris;

import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {

        int Year;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı giriniz: ");
        Year = input.nextInt();

        if(Year % 12 == 0){
            System.out.print("Çin Zodyağı Burcunu : ");
            System.out.print("Maymun");
        }
        if(Year % 12 == 1){
            System.out.print("Çin Zodyağı Burcunu : ");
            System.out.print("Horoz");
        }
        if(Year % 12 == 2){
            System.out.print("Çin Zodyağı Burcunu : ");
            System.out.print("Köpek");
        }
        if(Year % 12 == 3){
            System.out.print("Çin Zodyağı Burcunu : ");
            System.out.print("Domuz");
        }
        if(Year % 12 == 4){
            System.out.print("Çin Zodyağı Burcunu : ");
            System.out.print("Fare");
        }
        if(Year % 12 == 5){
            System.out.print("Çin Zodyağı Burcunu : ");
            System.out.print("Öküz");
        }
        if(Year % 12 == 6){
            System.out.print("Çin Zodyağı Burcunu : ");
            System.out.print("Kaplan");
        }
        if(Year % 12 == 7){
            System.out.print("Çin Zodyağı Burcunu : ");
            System.out.print("Tavşan");
        }
        if(Year % 12 == 8){
            System.out.print("Çin Zodyağı Burcunu : ");
            System.out.print("Ejderha");
        }
        if(Year % 12 == 9){
            System.out.print("Çin Zodyağı Burcunu : ");
            System.out.print("Yılan");
        }
        if(Year % 12 == 10){
            System.out.print("Çin Zodyağı Burcunu : ");
            System.out.print("At");
        }
        if(Year % 12 == 11){
            System.out.print("Çin Zodyağı Burcunu : ");
            System.out.print("Koyun");
        }
    }
}
