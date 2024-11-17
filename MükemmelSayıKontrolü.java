package Abusivesnake;
import java.util.Scanner;
public class MükemmelSayıKontrolü
{
	public static void main(String[] args)
	{
		int sayi, toplam = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		sayi = scan.nextInt();
		for(int i = 1; i < sayi; i++)
		{
			if(sayi %i == 0)
			{
				toplam += i;
			}
		}
		if(sayi == toplam)
		{
			System.out.println(sayi + " bir mükemmel sayıdır!");
		}
		else
		{
			System.out.println(sayi + " bir mükemmel sayı değildir!");
		}
		scan.close();
	}
}