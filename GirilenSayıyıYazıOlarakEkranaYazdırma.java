package Abusivesnake;
import java.util.Scanner;
public class GirilenSayıyıYazıOlarakEkranaYazdırma 
{
	public static void main(String[] args)
	{
		int onlar, birler, sayi;
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		sayi = scan.nextInt();
		onlar = sayi / 10;
		birler = sayi % 10;
		switch(onlar)
		{
			case 1:
			{
				System.out.print("On");
				break;
			}
			case 2:
			{
				System.out.print("Yirmi");
				break;
			}
			case 3:
			{
				System.out.print("Otuz");
				break;
			}
			case 4:
			{
				System.out.print("Kırk");
				break;
			}
			case 5:
			{
				System.out.print("Elli");
				break;
			}
			case 6:
			{
				System.out.print("Altmış");
				break;
			}
			case 7:
			{
				System.out.print("Yetmiş");
				break;
			}
			case 8:
			{
				System.out.print("Seksen");
				break;
			}
			case 9:
			{
				System.out.print("Doksan");
				break;
			}
		}
		switch(birler)
		{
			case 1:
			{
				System.out.print(" bir");
				break;
			}
			case 2:
			{
				System.out.print(" iki");
				break;
			}
			case 3:
			{
				System.out.print(" üç");
				break;
			}
			case 4:
			{
				System.out.print(" dört");
				break;
			}
			case 5:
			{
				System.out.print(" beş");
				break;
			}
			case 6:
			{
				System.out.print(" altı");
				break;
			}
			case 7:
			{
				System.out.print(" yedi");
				break;
			}
			case 8:
			{
				System.out.print(" sekiz");
				break;
			}
			case 9:
			{
				System.out.print(" dokuz");
				break;
			}
		}
		scan.close();
	}
}