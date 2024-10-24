package Abusivesnake;
import java.util.Scanner;
public class GirilenSayınınRakamlarıToplamı 
{
	public static void main(String[] args)
	{
		int sayi, toplam = 0, temp;
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		sayi = scan.nextInt();
		temp = sayi;
		while(sayi > 0)
		{
			toplam += sayi % 10;
			sayi /= 10;
		}
		System.out.println(temp + " sayınını rakamları toplamı: " + toplam);
		scan.close();
	}
}