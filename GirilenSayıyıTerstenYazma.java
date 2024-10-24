package Abusivesnake;
import java.util.Scanner;
public class GirilenSayıyıTerstenYazma 
{
	public static void main(String[] args)
	{
		int sayi, tek;
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayıyı giriniz: ");
		sayi = scan.nextInt();
		while(sayi > 0)
		{
			tek = sayi % 10;
			System.out.print(tek);
			sayi /= 10;
		}
		scan.close();
	}
}