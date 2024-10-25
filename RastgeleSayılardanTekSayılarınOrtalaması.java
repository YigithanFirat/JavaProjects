package Abusivesnake;
import java.util.Random;
public class RastgeleSayılardanTekSayılarınOrtalaması 
{
	public static void main(String[] args)
	{
		int sayi, toplam = 0;
		Random rast = new Random();
		for(int i = 0; i < 10; i++)
		{
			sayi = 1 + rast.nextInt(99);
			if(sayi %2 != 0)
			{
				System.out.println(sayi);
				toplam += sayi;
			}
		}
		System.out.println("Ortalama Sonucu: " + (toplam / 10));
	}
}