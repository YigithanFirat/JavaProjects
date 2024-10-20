package Abusivesnake;
import java.util.Scanner;
public class KDVliFiyatHesaplama 
{
	public static void main(String[] args)
	{
		double fiyat;
		Scanner scan = new Scanner(System.in);
		System.out.print("Ürün fiyatını giriniz: ");
		fiyat = scan.nextInt();
		fiyat = fiyat + (fiyat * 0.18);
		System.out.println("KDV'li Fiyat: " + fiyat);
		scan.close();
	}
}