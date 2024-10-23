package Abusivesnake;
import java.util.Scanner;
public class BasamakSayısıBulma 
{
	public static void main(String[] args)
	{
		int sayi, sayac = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		sayi = scan.nextInt();
		while(sayi > 0)
		{
			sayi /= 10;
			sayac++;
		}
		System.out.println("Girdiğiniz sayının basamak sayısı: " + sayac);
		scan.close();
	}
}