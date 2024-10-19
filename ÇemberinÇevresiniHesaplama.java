package Abusivesnake;
import java.util.Scanner;

public class ÇemberinÇevresiniHesaplama 
{
	public static void main(String[] args)
	{
		int yaricap;
		Scanner scan = new Scanner(System.in);
		System.out.print("Yarıçapı giriniz: ");
		yaricap = scan.nextInt();
		System.out.println("Çemberin çevresi: " + (2 * Math.PI * yaricap));
		System.out.println("Çemberin alanı: " + (Math.PI * yaricap * yaricap));
		scan.close();
	}
}