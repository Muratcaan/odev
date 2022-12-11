package vizesinav;
import java.util.Scanner;
public class sinavsorusu7 {

    public static void main(String[] args) {
        //Faktöriyel hesaplayan programı yapınız.
        Scanner k=new Scanner(System.in);
        System.out.println("Lütfen faktöriyelını hesaplamak ıstedıgınız sayıyı gırınız=");
        int faktoriyel=k.nextInt();
        int toplam=1;
        for(int i=1;i<=faktoriyel;i++) {
            toplam*=i;

        }
        System.out.println(faktoriyel+"! =" + toplam);

    }
}
