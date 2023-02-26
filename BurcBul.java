package Giris;

import java.util.Scanner;
public class BurcBul {
    public static void main(String[] args) {

        int day,  month;
        int Ocak, Subat, Mart, Nisan, Mayis, Haziran;
        int Temmuz, Agustos, Eylul, Ekim, Kasim, Aralik;


        System.out.print("Doğdunuzu günü giriniz: ");
        Scanner input = new Scanner(System.in);
        day = input.nextInt();

        System.out.println("Ocak = 1");
        System.out.println("Subat = 2");
        System.out.println("Mart = 3");
        System.out.println("Nisan = 4");
        System.out.println("Mayis = 5");
        System.out.println("Haziran = 6");
        System.out.println("Temmuz = 7");
        System.out.println("Agustos = 8");
        System.out.println("Eylul = 9");
        System.out.println("Ekim = 10");
        System.out.println("Kasim = 11");
        System.out.println("Aralik = 12");

        System.out.print("Doğduğunuz ayı giriniz: ");
        month = input.nextInt();

        Ocak = 1;
        Subat = 2;
        Mart = 3;
        Nisan = 4;
        Mayis = 5;
        Haziran = 6;
        Temmuz = 7;
        Agustos = 8;
        Eylul = 9;
        Ekim = 10;
        Kasim = 11;
        Aralik = 12;

        if(month == Ocak){
            if(day >= 22 ){
                System.out.println("Burcunuz: Kova");
            }
            else{
                System.out.println("Burcunuz: Oğlak");
            }
        }
        if(month == Subat){
            if(day >= 20 ){
                System.out.println("Burcunuz: Balık");
            }
            else{
                System.out.println("Burcunuz: Kova");
            }
        }
        if(month == Mart){
            if(day >= 21 ){
                System.out.println("Burcunuz: Koç");
            }
            else{
                System.out.println("Burcunuz: Balık");
            }
        }
        if(month == Nisan){
            if(day >= 21 ){
                System.out.println("Burcunuz: Boğa");
            }
            else{
                System.out.println("Burcunuz: Koç");
            }
        }
        if(month == Mayis){
            if(day >= 22 ){
                System.out.println("Burcunuz: İkizler");
            }
            else{
                System.out.println("Burcunuz: Boğa");
            }
        }
        if(month == Haziran){
            if(day >= 23 ){
                System.out.println("Burcunuz: Yengeç");
            }
            else{
                System.out.println("Burcunuz: İkizler");
            }
        }
        if(month == Temmuz){
            if(day >= 23 ){
                System.out.println("Burcunuz: Aslan ");
            }
            else{
                System.out.println("Burcunuz: Yengeç");
            }
        }
        if(month == Agustos){
            if(day >= 23 ){
                System.out.println("Burcunuz: Başak ");
            }
            else{
                System.out.println("Burcunuz: Aslan ");
            }
        }
        if(month == Eylul){
            if(day >= 23 ){
                System.out.println("Burcunuz: Terazi ");
            }
            else{
                System.out.println("Burcunuz: Başak ");
            }
        }
        if(month == Ekim){
            if(day >= 23 ){
                System.out.println("Burcunuz: Akrep ");
            }
            else{
                System.out.println("Burcunuz: Terazi ");
            }
        }
        if(month == Kasim){
            if(day >= 22 ){
                System.out.println("Burcunuz: Yay ");
            }
            else{
                System.out.println("Burcunuz: Akrep ");
            }
        }
        if(month == Aralik){
            if(day >= 22 ){
                System.out.println("Burcunuz: Oğlak ");
            }
            else{
                System.out.println("Burcunuz: Yay ");
            }
        }
    }
}