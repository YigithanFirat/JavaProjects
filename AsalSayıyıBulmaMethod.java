package Abusivesnake;
import java.util.Scanner;
public class AsalSayıyıBulmaMethod 
{
	public static void AsalKontrol(int a)
	{
		int sayac = 0;
		for(int i = 2; i < a; i++)
		{
			if(a %i == 0)
			{
				sayac++;
			}
			else continue;
		}
		if(sayac == 0) System.out.println(a + " sayısı asal sayıdır!");
		else System.out.println(a + " saysı asal sayı değildir!");
	}
	public static void main(String[] args) 
	{
		int sayi;
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayıyı giriniz: ");
		sayi = scan.nextInt();
		scan.close();
		AsalKontrol(sayi);
	}
}