package Abusivesnake;
import java.util.Scanner;
public class GirilenSayıyaKadarFaktoriyelHesaplama 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int faktoriyel = 1;
		System.out.print("Bir sayı giriniz: ");
		int sayi = scan.nextInt();
		for(int i = 1; i <= sayi; i++)
		{
			faktoriyel = faktoriyel * i;
			System.out.println(i + "!= " + faktoriyel);
		}
		scan.close();
	}
}