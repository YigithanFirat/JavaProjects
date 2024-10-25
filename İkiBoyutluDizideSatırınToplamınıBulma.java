package Abusivesnake;
import java.util.Scanner;
public class İkiBoyutluDizideSatırınToplamınıBulma 
{
	public static void main(String[] args)
	{
		int matris1, matris2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci matrisi giriniz: ");
		matris1 = scan.nextInt();
		System.out.print("İkinci matrisi giriniz: ");
		matris2 = scan.nextInt();
		int [][] dizi = new int[matris1][matris2];
		for(int i = 0; i < matris1; i++)
		{
			for(int j = 0; j < matris2; j++)
			{
				System.out.print("Bir sayı giriniz: ");
				dizi[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < matris1; i++)
		{
			int toplam = 0;
			for(int j = 0; j < matris2; j++)
			{
				toplam += dizi[i][j];
				System.out.print(dizi[i][j] + "\t");
			}
			System.out.println(toplam + "\n");
		}
		scan.close();
	}
}