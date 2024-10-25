package Abusivesnake;
import java.util.Scanner;
public class İkiBoyutluDiziDeğerleriniKullanıcıdanAlma 
{
	public static void main(String[] args)
	{
		int matris1, matris2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Dizinin birinci matrisini giriniz: ");
		matris1 = scan.nextInt();
		System.out.print("Dizinin ikinci matrisini giriniz: ");
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
			for(int j = 0; j < matris2; j++)
			{
				System.out.println(dizi[i][j] + " ");
			}
			System.out.println("\n");
		}
		scan.close();
	}
}