package vizesinav;
import java.sql.SQLOutput;
import java.util.Scanner;
public class sinavsorusu6 {

    public static void main(String[] args) {
        //Kullanıcı ad ve şifre kontrolü yapan java programını yapınız.
          Scanner k=new Scanner(System.in);
          String username,password;
        System.out.println("Kullanıcı adınızı giriniz = ");
        username=k.nextLine();
        System.out.println("Şifrenizi giriniz = ");
        password=k.nextLine();
        if (username.equals("Murat2323") && password.equals("2323")) {
            System.out.println("Giriş basarılı ");
        }
        else {
            System.out.println("Giriş basarısız ! ");
        }

    }
}
