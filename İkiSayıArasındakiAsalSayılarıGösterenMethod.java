package Abusivesnake;
import java.util.Scanner;
public class İkiSayıArasındakiAsalSayılarıGösterenMethod 
{
	public static void AsalKontrol(int sayi1, int sayi2) 
	{
		int sayac;
		for(int i = sayi1; i < sayi2; i++)
		{
			sayac = 0;
			for(int j = 2; j < i; j++)
			{
				if(i % j == 0) 
				{
					sayac++;
				}
			}
			if(sayac == 0) 
			{
				System.out.println("Asal sayi = " + i);
			}
		}
	}
	public static void main(String[] args)
	{
		int s1, s2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz: ");
		s1 = scan.nextInt();
		System.out.print("İkinci sayıyı giriniz: ");
		s2 = scan.nextInt();
		scan.close();
		AsalKontrol(s1, s2);
	}
}