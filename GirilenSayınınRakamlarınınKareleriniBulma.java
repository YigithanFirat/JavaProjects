package Abusivesnake;
import java.util.Scanner;
public class GirilenSayınınRakamlarınınKareleriniBulma 
{
	public static void main(String[] args)
	{
		int sayi, tek, temp;
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		sayi = scan.nextInt();
		temp = sayi;
		while(sayi > 0)
		{
			tek = sayi % 10;
			sayi /= 10;
			System.out.println(temp + " Rakamlarının Kareleri: " + (tek*tek));
		}
		scan.close();
	}
}