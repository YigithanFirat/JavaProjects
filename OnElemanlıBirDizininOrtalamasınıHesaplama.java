package Abusivesnake;
import java.util.Scanner;
public class OnElemanlıBirDizininOrtalamasınıHesaplama 
{
	public static void main(String[] args)
	{
		int toplam = 0;
		int [] dizi = new int[10];
		Scanner scan = new Scanner(System.in);
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