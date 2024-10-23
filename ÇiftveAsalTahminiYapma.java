package Abusivesnake;
import java.util.Random;
public class ÇiftveAsalTahminiYapma 
{
	public static void main(String[] args)
	{
		int sayi, sayac = 0;
		Random rast = new Random();
		for(int i = 0; i < 30; i++)
		{
			sayi = 1 + rast.nextInt(100);
			for(int j = 2; j < sayi; j++)
			{
				if(sayi %j == 0)
				{
					sayac++;
				}
			}
			if(sayac == 0)
			{
				System.out.println("Asal sayı: " + sayi);
			}
			if(sayi %2 == 0)
			{
				System.out.println("Çift Sayılar: " + sayi);
			}
		}
	}
}