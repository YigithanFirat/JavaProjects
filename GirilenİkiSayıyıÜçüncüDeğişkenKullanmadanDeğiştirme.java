package Abusivesnake;
import java.util.Scanner;
public class GirilenİkiSayıyıÜçüncüDeğişkenKullanmadanDeğiştirme 
{
	public static void main(String[] args)
	{
		int sayi1, sayi2;
		Scanner scan = new Scanner(System.in);
		System.out.print("1. sayı değerini giriniz: ");
		sayi1 = scan.nextInt();
		System.out.print("2. sayı değerini giriniz: ");
		sayi2 = scan.nextInt();
		System.out.println("1. Sayı: " + sayi1 + " 2. Sayı: " + sayi2);
		sayi1 = sayi1 + sayi2;
		sayi2 = sayi1 - sayi2;
		sayi1 = sayi1 - sayi2;
		System.out.println("Değişkenler değiştirildi...");
		System.out.println("1. Sayı: " + sayi1 + " 2. Sayı: " + sayi2);
		scan.close();
	}
}