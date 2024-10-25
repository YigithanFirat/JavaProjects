package Abusivesnake;
import java.util.Scanner;
public class NxMBoyutluDiziOluşturma 
{
	public static void main(String[] args)
	{
		int N, M;
		Scanner scan = new Scanner(System.in);
		System.out.print("Dizinin satır sayısını giriniz: ");
		N = scan.nextInt();
		System.out.print("Dizinin sütun sayısını giriniz: ");
		M = scan.nextInt();
		int [][] dizi = new int[N][M];
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < M; j++)
			{
				System.out.print("Bir sayı giriniz: ");
				dizi[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < M; j++)
			{
				System.out.print(dizi[i][j] + "\t");
			}
			System.out.println("\n");
		}
		scan.close();
	}
}