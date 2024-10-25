package Abusivesnake;
 
import java.util.Scanner;
 
public class GirilenSayıyaKadarOlanAsalSayılarıYazdırma
{
    public static void main(String[] args) 
    {
    	int sayi, sayac = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        sayi = scan.nextInt();
        while(sayi > 2) 
        {
            for(int i = 2; i < sayi; i++)
            {
                if(sayi % i == 0) 
                {
                    sayac++;
                }
            }
            if(sayac == 0) 
            {
                System.out.println(sayi + " asal bir sayidir.");
            }
            sayi--;
        }
        scan.close();
    }
}