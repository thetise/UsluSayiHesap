package Giris;

import java.util.Scanner;
public class KombinasyonHesap {
    public static void main(String[] args) {

        int n,r, Kombinasyon;
        int i;
        int nFaktoryel = 1;
        int rFaktoryel = 1;
        int k;
        int kFaktoryel = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("n sayısını giriniz: ");
        n = input.nextInt();
        System.out.print("r sayısını giriniz: ");
        r = input.nextInt();

        for(i = n; i > 0; i--){
            nFaktoryel = nFaktoryel * i;
        }

        for(i = r; i > 0; i--){
            rFaktoryel = rFaktoryel * i;
        }

        k = (n - r);

        for(i = k; i > 0; i--){
            kFaktoryel = kFaktoryel * i;
        }

        Kombinasyon = nFaktoryel / (rFaktoryel * kFaktoryel);

        System.out.print("C("+n+","+r+"): ");
        System.out.print(Kombinasyon);
    }
}
