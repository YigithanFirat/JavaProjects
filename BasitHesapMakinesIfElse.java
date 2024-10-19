package Abusivesnake;
import java.util.Scanner;
public class BasitHesapMakinesIfElse 
{
	public static void main(String[] args)
	{
		int islem;
		double sayi1, sayi2;
		Scanner scan = new Scanner(System.in);
		System.out.println("1-) Toplama");
		System.out.println("2-) Çıkarma");
		System.out.println("3-) Çarpma");
		System.out.println("4-) Bölme");
		System.out.print("Yapmak istediğiniz işlemin ID'sini seçiniz: ");
		islem = scan.nextInt();
		if(islem == 1)
		{
			System.out.print("1. sayıyı giriniz: ");
			sayi1 = scan.nextDouble();
			System.out.print("2. sayıyı giriniz: ");
			sayi2 = scan.nextDouble();
			System.out.print("Toplam Sonucu: " + (sayi1 + sayi2));
		}
		else if(islem == 2)
		{
			System.out.print("1. sayıyı giriniz: ");
			sayi1 = scan.nextDouble();
			System.out.print("2. sayıyı giriniz: ");
			sayi2 = scan.nextDouble();
			System.out.print("Çıkarma Sonucu: " + (sayi1 - sayi2));
		}
		else if(islem == 3)
		{
			System.out.print("1. sayıyı giriniz: ");
			sayi1 = scan.nextDouble();
			System.out.print("2. sayıyı giriniz: ");
			sayi2 = scan.nextDouble();
			System.out.print("Çarpma Sonucu: " + (sayi1 * sayi2));
		}
		else
		{
			System.out.print("1. sayıyı giriniz: ");
			sayi1 = scan.nextDouble();
			System.out.print("2. sayıyı giriniz: ");
			sayi2 = scan.nextDouble();
			System.out.print("Bölme Sonucu: " + (sayi1 / sayi2));
		}
		scan.close();
	}
}