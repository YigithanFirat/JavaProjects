package Abusivesnake;
import java.util.Scanner;
public class HarfTopluluğuKontrolü 
{
	public static void main(String[] args)
	{
		int sayac = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Cumle veya kelime giriniz: ");
		String cumle = scan.nextLine();
		for(int i = 0; i < cumle.length(); i++)
		{
			if(cumle.charAt(i) == 'a' || cumle.charAt(i) == 'A')
			{
				if(cumle.charAt(i+1) == 'B' || cumle.charAt(i+1) == 'b')
				{
					sayac++;
				}
			}
		}
		System.out.println("Bu cümlede/kelimede " + sayac + " kadar 'ab' topluluğu vardır!");
		scan.close();
	}
}