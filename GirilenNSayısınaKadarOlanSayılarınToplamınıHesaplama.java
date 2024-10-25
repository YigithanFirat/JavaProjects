package Abusivesnake;
import java.util.Scanner;
public class GirilenNSayısınaKadarOlanSayılarınToplamınıHesaplama 
{
	public static void main(String[] args)
	{
		int sayi = 0, toplam = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayısal değeri giriniz: ");
		sayi = scan.nextInt();
		for(int i = 0; i <= sayi; i++)
		{
			toplam = toplam + i;
		}
		System.out.println("Toplam Sonucu: " + toplam);
		scan.close();
	}
}