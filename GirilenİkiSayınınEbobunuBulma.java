package Abusivesnake;
import java.util.Scanner;
public class GirilenİkiSayınınEbobunuBulma 
{
	public static void main(String[] args)
	{
		int sayi1, sayi2, ebob = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("1. sayıyı giriniz: ");
		sayi1 = scan.nextInt();
		System.out.print("2. sayıyı giriniz: ");
		sayi2 = scan.nextInt();
		if(sayi1 > sayi2)
		{
			for(int i = 1; i < sayi1; i++)
			{
				if(sayi1 %i == 0 && sayi2 %i == 0)
				{
					ebob = i;
				}
			}
		}
		else
		{
			for(int i = 1; i < sayi2; i++)
			{
				if(sayi1 %i == 0 && sayi2 %i == 0)
				{
					ebob = i;
				}
			}
		}
		System.out.println("Ebob: " + ebob);
		scan.close();
	}
}