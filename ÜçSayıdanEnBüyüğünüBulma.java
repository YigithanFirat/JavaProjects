package Abusivesnake;
import java.util.Scanner;
public class ÜçSayıdanEnBüyüğünüBulma 
{
	public static void main(String[] args)
	{
		int sayi1, sayi2, sayi3;
		Scanner scan = new Scanner(System.in);
		System.out.print("1. sayıyı giriniz: ");
		sayi1 = scan.nextInt();
		System.out.print("2. sayıyı giriniz: ");
		sayi2 = scan.nextInt();
		System.out.print("3. sayıyı giriniz: ");
		sayi3 = scan.nextInt();
		if(sayi1 > sayi2 && sayi1 > sayi3)
		{
			System.out.println("1. Sayı: " + sayi1 + " en büyük olandır!");
		}
		else if(sayi2 > sayi1 && sayi2 > sayi3)
		{
			System.out.println("2. Sayı: " + sayi2 + " en büyük olandır!");
		}
		else if(sayi3 > sayi1 && sayi3 > sayi2)
		{
			System.out.println("3. Sayı: " + sayi3 + " en büyük olandır!");
		}
		scan.close();
	}
}