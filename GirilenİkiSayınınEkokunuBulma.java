package Abusivesnake;
import java.util.Scanner;
public class GirilenİkiSayınınEkokunuBulma 
{
    
    public static void main(String[] args) 
    {
        int sayi1, sayi2, ekok = 0, max;
        Scanner scan = new Scanner(System.in);
        System.out.print("1. Sayiyi giriniz: ");
        sayi1 = scan.nextInt();
        System.out.print("2. Sayiyi giriniz: ");
        sayi2 = scan.nextInt();
        max = sayi1 * sayi2;
        for(int i = max; i > 0; i--)
        {
            if(i % sayi1 == 0 && i % sayi2 == 0) 
            {
                ekok = i;
            }
        }
        System.out.println("Ekok = " + ekok);
        scan.close();
    }
}