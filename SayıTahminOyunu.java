package Abusivesnake;
import java.util.Scanner;
import java.util.Random;
public class SayıTahminOyunu 
{
	public static void main(String[] args)
	{
		int sayac = 0, tahmin, rastgele_sayi;
		Random rast = new Random();
		Scanner scan = new Scanner(System.in);
		rastgele_sayi = 1 + rast.nextInt(49);
		System.out.print("Sayıyı tahmin ediniz: ");
		tahmin = scan.nextInt();
		sayac++;
		while(tahmin != rastgele_sayi)
		{
			if(tahmin < rastgele_sayi)
			{
				System.out.println("Tahmininiz çok düşük, daha yüksek bir sayı tahmininde bulununuz!");
				System.out.print("Sayıyı tahmin ediniz: ");
				tahmin = scan.nextInt();
				sayac++;
			}
			else
			{
				System.out.println("Tahmininiz çok yüksek, daha yüksek bir sayı tahmininde bulununuz!");
				System.out.print("Sayıyı tahmin ediniz: ");
				tahmin = scan.nextInt();
				sayac++;
			}
		}
		System.out.println(sayac + " seferde sayıyı bildiniz!");
		scan.close();
	}
}