package Abusivesnake;
import java.util.Scanner;
public class HelloWorld 
{
	public static void main(String[] args)
	{
		int kenar1, kenar2;
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Kenarı giriniz: ");
		kenar1 = scan.nextInt();
		System.out.println("2. Kenarı giriniz: ");
		kenar2 = scan.nextInt();	
		System.out.println("Dikdörtgen alanı: " + (kenar1 * kenar2));
		System.out.println("Dikdörtgen çevresi: " + (2 * (kenar1 + kenar2)));
		scan.close();
	}
}