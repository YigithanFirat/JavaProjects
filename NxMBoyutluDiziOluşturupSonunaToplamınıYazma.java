package Abusivesnake;
import java.util.Scanner;
public class NxMBoyutluDiziOluşturupSonunaToplamınıYazma 
{
	public static void main(String[] args)
	{
		int satir, sutun;
		Scanner scan = new Scanner(System.in);
		System.out.print("Dizinin satırını giriniz: ");
		satir = scan.nextInt();
		System.out.print("Dizinin sütununu giriniz: ");
		sutun = scan.nextInt();
		int [][] dizi = new int[satir][sutun];
		for(int i = 0; i < satir; i++)
		{
			for(int j = 0; j < sutun; j++)
			{
				System.out.print("Bir sayı giriniz: ");
				dizi[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < satir; i++)
		{
			int toplam = 0;
			for(int j = 0; j < sutun; j++)
			{
				toplam += dizi[i][j];
				System.out.print(dizi[i][j] + "\t");
			}
			System.out.println(toplam + "\n");
		}
		scan.close();
	}
}