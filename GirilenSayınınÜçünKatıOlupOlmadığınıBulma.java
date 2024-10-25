package Abusivesnake;
import java.util.Scanner;
public class GirilenSayınınÜçünKatıOlupOlmadığınıBulma 
{
	public static void main(String[] args)
	{
		int sayi;
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		sayi = scan.nextInt();
		if(sayi %3 == 0)
		{
			System.out.println(sayi + ", 3'e tam bölünebilmektedir! ( Kalan: 0 )");
		}
		else if(sayi %3 == 1)
		{
			System.out.println(sayi + ", 3'e tam bölünememektedir! ( Kalan: 1 )");
		}
		else if(sayi %3 == 2)
		{
			System.out.println(sayi + ", 3'e tam bölünememektedir! ( Kalan: 2 )");
		}
		scan.close();
	}
}