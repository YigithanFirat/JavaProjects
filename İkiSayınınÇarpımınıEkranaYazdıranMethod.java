package Abusivesnake;
import java.util.Scanner;
public class İkiSayınınÇarpımınıEkranaYazdıranMethod 
{
	public static void Carpim_Yazdir(double a, double b)
	{
		System.out.println(a*b);
	}
	public static void main(String[] args)
	{
		double sayi1, sayi2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz: ");
		sayi1 = scan.nextDouble();
		System.out.print("İkinci sayıyı giriniz: ");
		sayi2 = scan.nextDouble();
		scan.close();
		Carpim_Yazdir(sayi1, sayi2);
	}
}