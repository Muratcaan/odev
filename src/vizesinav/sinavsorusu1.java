package vizesinav;
import java.util.Scanner;
public class sinavsorusu1 {

    public static void main(String[] args) {
        //Klavyeden girilen sayıya kadar 3 ve 4 e tam bölünebilen sayıları bulan programı yapınız.

        Scanner k=new Scanner(System.in);

        int girilenSayi;
        System.out.println("Bir sayı giriniz = ");
        girilenSayi=k.nextInt();
        System.out.println("--Girdiğiniz sayıya kadar olan 3 ve 4 e tam bölünebılen sayılar--");

        for(int i=1;i<girilenSayi;i++) {

            if(i%3==0 && i%4==0) {

                System.out.println(i);
            }
        }


    }
}
