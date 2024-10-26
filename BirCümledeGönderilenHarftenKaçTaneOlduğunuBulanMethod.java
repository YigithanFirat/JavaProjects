package Abusivesnake;
import java.util.Scanner;
public class BirCümledeGönderilenHarftenKaçTaneOlduğunuBulanMethod 
{
	public static void KacharfVar(String cumle, char harf)
	{
		int sayac = 0;
		for(int i = 0; i < cumle.length(); i++)
		{
			if(cumle.charAt(i) == Character.toLowerCase(harf) || cumle.charAt(i) == Character.toUpperCase(harf))
			{
				sayac++;
			}
		}
		System.out.println("'" + cumle + "'" + " cümlesinde " + sayac + " adet " + harf + " harfi bulunmaktadır!");
	}
	public static void main(String[] args)
	{
		String cumle;
		char harf;
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir cümle/kelime giriniz: ");
		cumle = scan.nextLine();
		System.out.print("Aramak istediğiniz harfi giriniz: ");
		harf = scan.next().charAt(0);
		scan.close();
		KacharfVar(cumle, harf);
	}
}