package Abusivesnake;
import java.util.Scanner;
public class GirilenİkiSayıArasındakiÜçveBeşinKatıOlanSayılarıBulma 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int sayi1, sayi2;
		System.out.print("1. sayıyı giriniz: ");
		sayi1 = scan.nextInt();
		System.out.print("2. sayıyı giriniz: ");
		sayi2 = scan.nextInt();
		scan.close();
		if(sayi1 > sayi2)
		{
			for(; sayi2 <= sayi1; sayi2++)
			{
				if(sayi2 %3 == 0 && sayi2 %5 == 0)
				{
					System.out.println("" + sayi2 + " 3'e ve 5'e tam bölünebilmektedir!");
				}
				else continue;
			}
		}
		else
		{
			for(; sayi1 <= sayi2; sayi1++)
			{
				if(sayi1 %3 == 0 && sayi1 %5 == 0)
				{
					System.out.println("" + sayi1 + " 3'e ve 5'e tam bölünebilmektedir!");
				}
				else continue;
			}
		}
	}
}