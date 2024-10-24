package Abusivesnake;
import java.util.Scanner;
public class ArmstrongSayıKontrolü
{
	public static void main(String[] args)
	{
		int sayi, gecici1, gecici2, rakam, sayac = 0, toplam = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		sayi = scan.nextInt();
		gecici1 = sayi;
		gecici2 = sayi;
		while(sayi > 0)
		{
			sayi /= 10;
			sayac++;
		}
		while(gecici1 > 0)
		{
			rakam = gecici1 % 10;
			toplam += Math.pow(rakam, sayac);
			gecici1 /= 10;
		}
		if(toplam == gecici2)
		{
			System.out.println(gecici2 + " bir Armstrong Sayı'dır.");
		}
		else
		{
			System.out.println(gecici2 + " bi Armstrong Sayı değildir!");
		}
		scan.close();
	}
}