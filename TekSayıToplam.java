package Giris;

import java.util.Scanner;
public class TekSayıToplam {
    public static void main(String[] args) {

        int number;
        int sum = 0;

        boolean isOdd = false;

        Scanner input = new Scanner(System.in);

        while(isOdd != true){
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if(number % 2 == 1){
                isOdd = true;
            }

            if(number % 2 == 0 && number % 4 == 0){
                sum = sum + number;
            }
        }
        System.out.print("Çift ve 4'ün katları olan sayıların toplamı: ");
        System.out.println(sum);
    }
}
