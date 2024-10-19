package Abusivesnake;
import java.util.Scanner;
public class GirilenİkiSayınınDeğerleriniDeğiştirme 
{
	public static void main(String[] args)
	{
		int sayi1 = 0, sayi2 = 0, gecici = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("1. sayı değerini giriniz: ");
		sayi1 = scan.nextInt();
		System.out.print("2. sayı değerini giriniz: ");
		sayi2 = scan.nextInt();
		System.out.println("1. Sayı: " + sayi1 + " 2. Sayı: " + sayi2 + " Geçici Sayı: " + gecici);
		gecici = sayi1;
		sayi1 = sayi2;
		sayi2 = gecici;
		System.out.println("Geçici Sayı Değeri:" + gecici);
		gecici = 0;
		System.out.println("1. Sayı: " + sayi1 + " 2. Sayı: " + sayi2 + " Geçici Sayı: " + gecici);
		scan.close();
	}
}