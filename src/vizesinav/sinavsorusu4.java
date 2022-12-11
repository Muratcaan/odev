package vizesinav;
import java.util.Scanner;
public class sinavsorusu4 {

    public static void main(String[] args) {
        //Hesap makinesi yapınız.
        Scanner k=new Scanner(System.in);
        int sayi1,sayi2,islemler;
        System.out.println("1-Toplama");
        System.out.println("2-Çıkarma");
        System.out.println("3-Carpma");
        System.out.println("4-Bölme");
        System.out.println("1.sayıyı giriniz = ");
        sayi1=k.nextInt();
        System.out.println("2.sayıyı giriniz = ");
        sayi2=k.nextInt();
        System.out.println("Bir işlem Seçiniz = ");
        islemler=k.nextInt();

        if(islemler==1) {
            System.out.println("Toplama işleminin sonucu = " + (sayi1+sayi2));

        }
        if(islemler==2) {
            System.out.println("Çıkarma islemının sonucu = " + (sayi1-sayi2));
        }
        if(islemler==3) {
            System.out.println("Carpma islemının sonucu = "+ (sayi1*sayi2));
        }
        if(islemler==4) {
            System.out.println("Bölme ıslemının sonucu = " +(sayi1/sayi2));
        }

}}
