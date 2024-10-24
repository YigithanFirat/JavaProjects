package Abusivesnake;
import java.util.Scanner;
public class ÇarpmaİşleminiToplamaİşlemiyleYapmak 
{
	public static void main(String[] args) 
	{
		int toplam = 0, sayi1, sayi2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz: ");
		sayi1 = scan.nextInt();
		System.out.print("İkinci sayıyı giriniz: ");
		sayi2  = scan.nextInt();
		for(int i = 0; i < sayi2; i++)
		{
			toplam += sayi1;
		}
		System.out.println(sayi1 + "X" + sayi2 + "= " + toplam);
		scan.close();
	}
}