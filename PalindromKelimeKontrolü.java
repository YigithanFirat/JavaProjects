package Abusivesnake;
import java.util.Scanner;
public class PalindromKelimeKontrolü 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Kelime giriniz: ");
		String kelime = scan.nextLine();
		String yeni_kelime = "";
		for(int i = (kelime.length()-1); i >= 0; i--)
		{
			yeni_kelime += kelime.charAt(i);
		}
		if(yeni_kelime.equals(kelime))
		{
			System.out.println("Bu kelime Palindrom Kelime'dir");
		}
		else
		{
			System.out.println("Bu kelime Palindrom Kelime değildir!");
		}
		scan.close();
	}
}