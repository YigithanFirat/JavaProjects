package Abusivesnake;
import java.util.Scanner;
public class DizidekiEnBüyükSayıyıBulma 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int dizi_kac_elemanli, en_buyuk_kim = 0;
		System.out.print("Dizinizin kaç elemanlı olmasını istersiniz? ");
		dizi_kac_elemanli = scan.nextInt();
		int [] dizi = new int[dizi_kac_elemanli];
		for(int i = 0; i < dizi.length; i++)
		{
			System.out.print("Dizinin " + (i+1) + " elemanını giriniz: ");
			dizi[i] = scan.nextInt();
		}
		for(int i = 0; i < dizi.length; i++)
		{
			en_buyuk_kim = dizi[i];
			for(int j = 0; j < dizi.length; j++)
			{
				if(dizi[i] < dizi[j])
				{
					en_buyuk_kim = dizi[j];
				}
			}
		}
		System.out.println("En büyük değer: " + en_buyuk_kim);
		scan.close();
	}
}