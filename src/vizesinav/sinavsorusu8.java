package vizesinav;
import java.util.Scanner;
public class sinavsorusu8 {

    public static void main(String[] args) {
        //Klavyeden girilen string içindeki sesli ve sessiz harflerin sayısını bulan programı yapınız.
          Scanner k=new Scanner(System.in);
          int sesli=0;
        System.out.println("Bir tane kelime giriniz = ");
        String isim=k.nextLine();
        for(int i=0;i<isim.length();i++) {
            char c=isim.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c =='ö' || c=='u'|| c=='ü') {
                sesli++;

            }
        }
        System.out.println("sesli harf sayısı =" + sesli);
        System.out.println("sessiz sayısı = " + (isim.length()-sesli));

    }
}
