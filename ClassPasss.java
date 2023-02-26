package Giris;

import java.util.Scanner;
public class ClassPasss {
    public static void main(String[] args) {

        double Math, Fizik, Turkce, Kimya, Muzik, Ortalama;
        int DersSayisi = 0;
        double sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        Math = input.nextDouble();

        System.out.print("Fizik notunuzu giriniz: ");
        Fizik = input.nextDouble();

        System.out.print("Turkce notunuzu giriniz: ");
        Turkce = input.nextDouble();

        System.out.print("Kimya notunuzu giriniz: ");
        Kimya = input.nextDouble();

        System.out.print("Muzik notunuzu giriniz: ");
        Muzik = input.nextDouble();

        if(Math > 0 && Math  < 100){
            sum = sum + Math;
            DersSayisi++;
        }
        else if(Fizik > 0 && Fizik < 100){
            sum = sum + Fizik;
            DersSayisi++;
        }
        else if(Turkce > 0 && Turkce < 100){
            sum = sum + Turkce;
            DersSayisi++;
        }
        else if(Kimya > 0 && Kimya < 100){
            sum = sum + Kimya;
            DersSayisi++;
        }
        else if(Muzik > 0 && Muzik < 100){
            sum = sum + Muzik;
            DersSayisi++;
        }

        System.out.println("Not: Geçme notu 55'dir.");

        Ortalama = sum / DersSayisi;

        System.out.print("Ortalamanız: ");
        System.out.println(Ortalama);

        if (Ortalama >= 55){
            System.out.println("Sınıfı başarılı bir şekilde geçtiniz.");
        }
        else{
            System.out.println("Ne yazik ki sınıfı geçemediniz.");
        }
    }
}
