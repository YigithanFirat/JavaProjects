package Abusivesnake;
import java.util.Scanner;
public class BedenKitleEndeksiHesaplama 
{
	public static void main(String[] args)
	{
		float boy, kilo, bki;
        Scanner scan = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz (1,75) : ");
        boy = scan.nextFloat();
        System.out.print("Kilonuzu giriniz: ");
        kilo = scan.nextFloat();
        bki = kilo / (boy*boy);
        System.out.println("Beden Kitle İndeksiniz = " + bki);
        
        if(bki < 18) 
        {
            System.out.println("Zayıf");
        }
        else if(bki < 25 && bki > 18) 
        {
            System.out.println("Normal");
        }
        else if(bki < 30 && bki > 25) 
        {
            System.out.println("Hafif şişman");
        }
        else if(bki < 35 && bki > 30) 
        {
            System.out.println("Şişman");
        }
        else 
        {
            System.out.println("Obez");
        }
		scan.close();
	}
}