package Abusivesnake;
import java.util.Scanner;
public class DiziElemanlarınıTerstenYazdırma
{
	public static void main(String[] args)
	{
		int dizi_kac_elemanli;
		Scanner scan = new Scanner(System.in);
		System.out.print("Dizinizin kaç elemanlı olmasını istersiniz? ");
		dizi_kac_elemanli = scan.nextInt();
		int [] dizi = new int[dizi_kac_elemanli];
		for(int i = 0; i < dizi.length; i++)
		{
			System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
			dizi[i] = scan.nextInt();
		}
		for(int i = dizi.length-1; i >= 0; i--)
		{
			System.out.println("Dizinin " + (dizi.length-i) + ". elemanı " + dizi[i]);
		}
		scan.close();
	}
}