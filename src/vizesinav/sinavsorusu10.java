package vizesinav;
import java.util.Scanner;
public class sinavsorusu10 {

    public static void main(String[] args) {
        //Klavyeden girilen 3 basamaklı sayının basamak değerini hesaplayan programı yapınız.
        Scanner k=new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı giriniz =");
        int t=k.nextInt();
        System.out.println("Birler basamağı = " + (t%10));
        int m=t/10;
        System.out.println("onlar basamağı= " + (m%10));
        System.out.println("yüzler basamağı =" + (m/10));
    }
}
