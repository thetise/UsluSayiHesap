package Giris;

import java.util.Scanner;
public class UcakBiletFiyati {
    public static void main(String[] args) {

        int Mesafe, Yas, YolculukTipi;

        double YolculukTipiIndirim, YasIndirim, SonFiyat, NormalUcret, SonSonFiyat;


        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        Mesafe = input.nextInt();

        NormalUcret = (Mesafe * 10.0) / 100.0;

        System.out.print("Yaşınızı giriniz: ");
        Yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        YolculukTipi = input.nextInt();

        if(Yas < 12){
            YasIndirim = (NormalUcret * 50.0) / 100.0;
            if(YolculukTipi == 1){
                SonFiyat = NormalUcret - YasIndirim;
                System.out.print("Topalam Tutar = ");
                System.out.print(SonFiyat);
                System.out.println(" TL");
            }
            else if(YolculukTipi == 2){
                SonFiyat = NormalUcret - YasIndirim;
                YolculukTipiIndirim = (SonFiyat * 20.0) / 100.0;
                SonSonFiyat = SonFiyat - YolculukTipiIndirim;
                SonSonFiyat = SonSonFiyat * 2;
                System.out.print("Topalam Tutar = ");
                System.out.print(SonSonFiyat);
                System.out.println(" TL");
            }
            else{
                System.out.println("Hatalı Veri Girdiniz!");
            }
        }
        if(Yas < 24 && Yas >= 12){
            YasIndirim = (NormalUcret * 10.0) / 100.0;
            if(YolculukTipi == 1){
                SonFiyat = NormalUcret - YasIndirim;
                System.out.print("Topalam Tutar = ");
                System.out.print(SonFiyat);
                System.out.println(" TL");
            }
            else if( YolculukTipi == 2){
                SonFiyat = NormalUcret - YasIndirim;
                YolculukTipiIndirim = (SonFiyat * 20.0) / 100.0;
                SonSonFiyat = SonFiyat - YolculukTipiIndirim;
                SonSonFiyat = SonSonFiyat * 2;
                System.out.print("Topalam Tutar = ");
                System.out.print(SonSonFiyat);
                System.out.println(" TL");
            }
            else{
                System.out.println("Hatalı Veri Girdiniz!");
            }
        }
        if(Yas >= 65){
            YasIndirim = (NormalUcret * 30.0) / 100.0;
            if(YolculukTipi == 1){
                SonFiyat = NormalUcret - YasIndirim;
                System.out.print("Topalam Tutar = ");
                System.out.print(SonFiyat);
                System.out.println(" TL");
            }
            else if( YolculukTipi == 2){
                SonFiyat = NormalUcret - YasIndirim;
                YolculukTipiIndirim = (SonFiyat * 20.0) / 100.0;
                SonSonFiyat = SonFiyat - YolculukTipiIndirim;
                SonSonFiyat = SonSonFiyat * 2;
                System.out.print("Topalam Tutar = ");
                System.out.print(SonSonFiyat);
                System.out.println(" TL");
            }
            else{
                System.out.println("Hatalı Veri Girdiniz!");
            }
        }
        if(Yas >= 24 && Yas < 65){
            if(YolculukTipi == 1){
                System.out.print("Topalam Tutar = ");
                System.out.print(NormalUcret);
                System.out.println(" TL");
            }
            else if( YolculukTipi == 2){
                NormalUcret = NormalUcret * 2;
                System.out.print("Topalam Tutar = ");
                System.out.print(NormalUcret);
                System.out.println(" TL");
            }
            else{
                System.out.println("Hatalı Veri Girdiniz!");
            }
        }
    }
}