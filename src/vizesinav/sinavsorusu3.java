package vizesinav;
import java.util.Scanner;
public class sinavsorusu3 {

    public static void main(String[] args) {
        //Dairenin alanını ve çevresini hesaplayan programı yapınız.
          Scanner k=new Scanner(System.in);
          double yaricap,pi=3.14,cevre,alan;
        System.out.println("Dairenin yaricapını giriniz =");
        yaricap=k.nextDouble();
        cevre = 2*pi*yaricap;
        alan=pi*(Math.pow(yaricap,2));
        System.out.println("Dairenin cevresi =" + cevre);
        System.out.println("Dairenin alanı = " + alan);
    }
}
