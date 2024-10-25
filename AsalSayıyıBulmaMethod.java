package Abusivesnake;
import java.util.Scanner;
public class AsalSayıyıBulmaMethod 
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
			else continue;
		}
		if(sayac == 0) return true;
		else return false;
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