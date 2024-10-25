package Abusivesnake;
import java.util.Scanner;
public class DizininElemanlarınıKüçüktenBüyüğeSıralama 
{
	public static void main(String[] args)
	{
		int dizi_kac_elemanli, gecici;
		Scanner scan = new Scanner(System.in);
		System.out.print("Dizinizin kaç elemanlı olmasını istersiniz? ");
		dizi_kac_elemanli = scan.nextInt();
		int [] dizi = new int[dizi_kac_elemanli];
		for(int i = 0; i < dizi.length; i++)
		{
			System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
			dizi[i] = scan.nextInt();
		}
		for(int i = 0; i < dizi.length; i++)
		{
			for(int j = 0; j < dizi.length; j++)
			{
				if(dizi[i] < dizi[j])
				{
					gecici = dizi[i];
					dizi[i] = dizi[j];
					dizi[j] = gecici;
				}
			}
		}
		for(int i = 0; i < dizi.length; i++)
		{
			System.out.println("Dizinin " + (i+1) + ". elemanını : " + dizi[i]);
		}
		scan.close();
	}
}