package Abusivesnake;
import java.util.Scanner;
public class GirilenSayılarınOrtalamasınıBulma 
{
	public static void main(String[] args)
	{
		int sayi, toplam = 0, adet;
		Scanner scan = new Scanner(System.in);
		System.out.print("Girmek istediğiniz sayı adedini giriniz: ");
		adet = scan.nextInt();
		for(int i = 0; i < adet; i++)
		{
			System.out.print((i+1) + ". sayıyı giriniz: ");
			sayi = scan.nextInt();
			toplam += sayi;
		}
		System.out.println("Girilen sayıların ortalaması: " + (toplam / adet));
		scan.close();
	}
}