package Abusivesnake;
import java.util.Scanner;
public class BasitHesapMakinesiSwitchCase 
{
	public static void main(String[] args)
	{
		int islem, sayi1, sayi2;
		Scanner scan = new Scanner(System.in);
		System.out.print("1. sayıyı giriniz: ");
		sayi1 = scan.nextInt();
		System.out.print("2. sayıyı giriniz: ");
		sayi2 = scan.nextInt();
		System.out.println("1-) Toplama");
		System.out.println("2-) Çıkarma");
		System.out.println("3-) Çarpma");
		System.out.println("4-) Bölme");
		System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
		islem = scan.nextInt();
		switch(islem)
		{
			case 1:
			{
				System.out.println("Toplam Sonucu: " + (sayi1 + sayi2));
				break;
			}
			case 2:
			{
				System.out.println("Çıkarma Sonucu: " + (sayi1 - sayi2));
				break;
			}
			case 3:
			{
				System.out.println("Çarpma Sonucu: " + (sayi1 * sayi2));
				break;
			}
			case 4:
			{
				System.out.println("Bölme Sonucu: " + (sayi1 / sayi2));
				break;
			}
		}
		scan.close();
	}
}