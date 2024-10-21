package Abusivesnake;
import java.util.Random;
public class RastgeleÜretilenBelirliAralıktakiÇiftSayılarınToplamı 
{
	public static void main(String[] args)
	{
		int sayi, toplam = 0;
		Random rast = new Random();
		for(int i = 0; i < 10; i++)
		{
			sayi = 5 + rast.nextInt(145);
			if(sayi %2 == 0)
			{
				System.out.println(sayi);
				toplam += sayi;
			}
			else continue;
		}
		System.out.println("Toplam Sonucu: " + toplam);
	}
}