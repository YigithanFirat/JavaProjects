package Abusivesnake;
import java.util.Scanner;
public class ÜsAlmaMethod 
{
	public static void UsAl(int a, int b)
	{
		System.out.print("Üs: " + Math.pow(a, b));
	}
	public static void main(String[] args)
	{
		int x, y;
		Scanner scan = new Scanner(System.in);
		System.out.print("İlk sayıyı giriniz: ");
		x = scan.nextInt();
		System.out.print("İkinci sayıyı giriniz: ");
		y = scan.nextInt();
		scan.close();
		UsAl(x, y);
	}
}