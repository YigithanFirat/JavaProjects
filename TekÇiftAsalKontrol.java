package Abusivesnake;
import java.util.Random;
public class TekÇiftAsalKontrol 
{
	public static boolean AsalKontrol(int a)
	{
		int sayac = 0;
		for(int i = 2; i < a; i++)
		{
			if(a %i == 0)
			{
				sayac++;
			}
		}
		if(sayac == 0) return true;
		else return false;
	}
	public static void main(String[] args)
	{
		int sayi;
		Random rast = new Random();
		for(int i = 0; i < 20; i++)
		{
			sayi = 1 + rast.nextInt(49);
			if(sayi %2 == 0)
			{
				System.out.println("Çift sayı: " + sayi);
			}
			else if(AsalKontrol(sayi))
			{
				System.out.println("Asal Sayı: " + sayi);
			}
			else
			{
				System.out.println("Tek Sayı: " + sayi);
			}
		}
	}
}