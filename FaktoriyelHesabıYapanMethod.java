package Abusivesnake;
import java.util.Scanner;
public class FaktoriyelHesabıYapanMethod 
{
	public static void FaktoriyelHesapla(int a)
	{
		int faktoriyel = 1;
		for(int i = a; i > 0 ; i--)
		{
			faktoriyel *= i;
		}
		System.out.println(a + " sayısının faktoriyeli: " + faktoriyel);
	}
	public static void main(String[] args)
	{
		int sayi;
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayıyı giriniz: ");
		sayi = scan.nextInt();
		scan.close();
		FaktoriyelHesapla(sayi);
	}
}