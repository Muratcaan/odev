package vizesinav;
import java.util.Scanner;
public class sinavsorusu9 {

    public static void main(String[] args) {
        //Klavyeden girilen 5 sayının en büyüğünü bulan programı yapınız.
         Scanner k=new Scanner(System.in);
         int i=0,x,enb;
         x=k.nextInt();
         enb=x;
         while(i<=4) {
             x=k.nextInt();
             if(enb<=x)
                 enb=x;
                 i++;


         } System.out.println(enb);

    }
}
