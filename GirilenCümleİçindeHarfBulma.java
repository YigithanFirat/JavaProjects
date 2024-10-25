package Abusivesnake;
import java.util.Scanner;
public class GirilenCümleİçindeHarfBulma 
{
	public static void main(String[] args)
	{
		int sayac = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir cümle veya kelime yazınız: ");
		String cumle = scan.nextLine();
		for(int i = 0; i < cumle.length(); i++)
		{
			if(cumle.charAt(i) == 'a' || cumle.charAt(i) == 'A')
			{
				sayac++;
			}
		}
		System.out.println("Bu cümlede/kelimede " + sayac + " kadar a harfi bulunmakta!");
		scan.close();
	}
}