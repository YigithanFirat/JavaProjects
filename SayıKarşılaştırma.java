package Abusivesnake;
import java.util.Scanner;
public class SayıKarşılaştırma 
{
	public static void main(String[] args)
	{
		int sayi1, sayi2;
		Scanner scan = new Scanner(System.in);
		System.out.print("1. sayıyı giriniz: ");
		sayi1 = scan.nextInt();
		System.out.print("2. sayıyı giriniz: ");
		sayi2 = scan.nextInt();
		if(sayi1 > sayi2)
		{
			System.out.print("1. sayı: " + sayi1 + " 2. sayıdan büyüktür!");
		}
		else if(sayi2 > sayi1)
		{
			System.out.print("2. sayı: " + sayi2 + " 1. sayıdan büyüktür!");
		}
		else
		{
			System.out.print("Sayılar birbirine eşittir! " + " 1. sayı: " + sayi1 + " 2. sayı: " + sayi2);
		}
		scan.close();
	}
}