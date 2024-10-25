package Abusivesnake;
import java.util.Scanner;
public class DizidekiTekSayılarıBaşkaDiziyeAtma 
{
	public static void main(String[] args)
	{
		int dizi_kac_elemanli, sayac = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Dizinizin kaç elemanlı olmasını istersiniz? ");
		dizi_kac_elemanli = scan.nextInt();
		int [] dizi = new int[dizi_kac_elemanli];
		int [] tek_dizi = new int[dizi_kac_elemanli];
		for(int i = 0; i < dizi.length; i++)
		{
			System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
			dizi[i] = scan.nextInt();
			if(dizi[i] %2 == 1)
			{
				tek_dizi[sayac] = dizi[i];
				sayac++;
			}
		}
		System.out.println("Tek Sayılar\n");
		for(int i = 0; i < sayac; i++)
		{
			System.out.println("Tek Sayılar: " + tek_dizi[i]);
		}
		scan.close();
	}
}