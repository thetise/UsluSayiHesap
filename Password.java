package Giris;
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {

        String userName, password, answer, newpassword;
        String KullaniciAdi, Sifre;
        KullaniciAdi = "patika";
        Sifre = "java123";

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();

        if(userName.equals(KullaniciAdi) && (password.equals(Sifre))){
            System.out.print("Başarılı bir şekilde giriş yaptınız.");
        }
        else if (userName.equals(KullaniciAdi) && (password != Sifre)){
            System.out.print("Şifre sıfırlamak ister misiniz: ");
            answer = input.nextLine();
            if(answer.equals("Yes") || answer.equals("yes") || answer.equals("YES")){
                System.out.println("Az önce girmek istediğiniz şifre hatalıydı.");
                System.out.println("NOT: Yeni şifre eski şifre ile aynı olmamalıdır.");
                System.out.print("Yeni şifrenizi giriniz: ");
                newpassword = input.nextLine();
                if (newpassword.equals(Sifre)){
                    System.out.print("Şifre oluşturulamadı değiştirmek istediğiniz şifre ile giriş yapmış olduğunuz şifre aynı, lütfen başka şifre giriniz: ");
                    newpassword = input.nextLine();
                }
                if (newpassword != Sifre){
                    System.out.println("Şifre oluşturuldu.");
                    System.out.print("Yeni şifreniz: ");
                    System.out.print(newpassword);
                }
            }
            else{
                System.out.println("Şifre sıfırlama isteğinizin olmadığını bildirdiniz.");
            }
        }
    }
}