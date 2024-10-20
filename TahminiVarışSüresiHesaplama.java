package Abusivesnake;
import java.util.Scanner;
public class TahminiVarışSüresiHesaplama 
{
	public static void main(String[] args)
	{
		int yol, hiz, zaman;
		Scanner scan = new Scanner(System.in);
		System.out.print("Yolunuzun uzunluğunu giriniz: ");
		yol = scan.nextInt();
		System.out.print("Aracınızın hızını giriniz: ");
		hiz = scan.nextInt();
		scan.close();
		zaman = yol / hiz;
		System.out.print("Varış süreniz: " + zaman);
	}
}