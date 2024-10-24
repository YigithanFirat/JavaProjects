package Abusivesnake;
import java.util.Scanner;
public class NElemanlıDizininOrtalamasınıBulma
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int dizi_kac_elemanli, toplam = 0;
		System.out.print("Dizinin kaç elemanlı olmasını istersiniz? ");
		dizi_kac_elemanli = scan.nextInt();
		int [] dizi = new int[dizi_kac_elemanli];
		for(int i = 0; i < dizi.length; i++)
		{
			System.out.print("Dizinin " + (i+1) + " elemanını giriniz: ");
			dizi[i] = scan.nextInt();
			toplam += dizi[i];
		}
		System.out.println("Dizinin Ortalaması: " + (toplam / dizi.length));
		scan.close();
	}
}