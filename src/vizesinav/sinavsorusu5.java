package vizesinav;
import java.util.Scanner;
public class sinavsorusu5 {

    public static void main(String[] args) {
        //Girilen stringi ters çevirip ekrana yazan programı yapınız.
          Scanner k=new Scanner(System.in);
          String str= k.nextLine();
          for(int i=str.length()-1;i>=0;i--) {
              System.out.print(str.charAt(i));
          }
    }
}
