package Abusivesnake;
import java.util.Random;
public class RastgeleSayıÜretmeOrtalamaBulma 
{
	public static void main(String[] args)
	{
		Random rast = new Random();
		int sayi, toplam = 0;
		for(int i = 0; i < 10; i++)
		{
			sayi = 50 + rast.nextInt(50);
			System.out.println(sayi);
			toplam += sayi;
		}
		System.out.println("Ortalama: " + (toplam / 10));
	}
}