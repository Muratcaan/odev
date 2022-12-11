package vizesinav;
import java.util.Scanner;
public class sinavsorusu2 {

    public static void main(String[] args) {
        //Kenar uzunlukları klavyeden girilen dik üçgenin hipotenüsünü hesaplayan programı yapınız.
           Scanner k=new Scanner(System.in);
           double dikKenar,altKenar;

        System.out.println("Dik kenarı giriniz = ");
        dikKenar=k.nextDouble();
        System.out.println("Alt Kenarı giriniz = ");
        altKenar=k.nextDouble();
        double hipotenus;
        hipotenus=(dikKenar=Math.pow(dikKenar,2))+ (altKenar=Math.pow(altKenar,2));
        double hipotenusSonucu=Math.sqrt(hipotenus);
        System.out.println("Hipotenüs sonucu = " + hipotenusSonucu + "dir.");


    }
}
