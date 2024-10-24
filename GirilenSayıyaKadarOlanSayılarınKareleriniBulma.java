package Abusivesnake;
import java.util.Scanner;
public class GirilenSayıyaKadarOlanSayılarınKareleriniBulma 
{
	public static void main(String[] args)
	{
		int sayi;
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		sayi = scan.nextInt();
		for(int i = 0; i <= sayi; i++)
		{
			System.out.println((i) + ". sayının karesi: " + "" + (i*i));
		}
		scan.close();
	}
}