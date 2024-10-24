package Abusivesnake;
import java.util.Scanner;
public class DizidekiEnBüyükveEnKüçükSayıArasındakiFarkıBulma 
{
	public static void main(String[] args)
	{
		int dizi_kac_elemanli, en_buyuk_kim = 0, en_kucuk_kim = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Dizinizin kaç elemanlı olmasını istersiniz? ");
		dizi_kac_elemanli = scan.nextInt();
		int [] dizi = new int[dizi_kac_elemanli];
		for(int i = 0; i < dizi.length; i++)
		{
			System.out.print("Dizinin " + (i+1) + " elemanın giriniz: ");
			dizi[i] = scan.nextInt();
		}
		for(int i = 0; i < dizi.length; i++)
		{
			en_buyuk_kim = dizi[i];
			en_kucuk_kim =  dizi[i];
			for(int j = 0; j < dizi.length; j++)
			{
				if(dizi[i] < dizi[j])
				{
					en_buyuk_kim = dizi[j];
				}
				else if(dizi[i] > dizi[j])
				{
					en_buyuk_kim = dizi[i];
				}
				else if(dizi[i] < dizi[j])
				{
					en_kucuk_kim = dizi[i];
				}
				else
				{
					en_kucuk_kim = dizi[j];
				}
			}
		}
		System.out.println("En Büyük ve En Küçük Değerin Farkı: " + (en_buyuk_kim - en_kucuk_kim));
	}
}