package Abusivesnake;
import java.util.Scanner;
public class MethodOverloading 
{
	public static void topla(int a, int b, int c)
	{
		if(a == 0)
		{
			System.out.println("Toplam Sonucu:  " + (b+c));
		}
		else if(b == 0)
		{
			System.out.println("Toplam Sonucu:  " + (a+c));
		}
		else if(c == 0)
		{
			System.out.println("Toplam Sonucu:  " + (a+b));
		}
		else if((a == 0 && b == 0) || (a == 0 && c == 0) || (b == 0 && c == 0))
		{
			if(a != 0)
			{
				System.out.println("Diğer iki sayı 0 olduğu için ilk sayı ekrana yazdırılır: " + a);
			}
			else if(b != 0)
			{
				System.out.println("Diğer iki sayı 0 olduğu için ikinci sayı ekrana yazdırılır: " + b);
			}
			else
			{
				System.out.println("Diğer iki sayı 0 olduğu için üçüncü sayı ekrana yazdırılır: " + c);
			}
		}
		else
		{
			System.out.println("Toplam Sonucu:  " + (a+b+c));
		}
	}
	public static void main(String[] args)
	{
		int s1, s2, s3;
		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz: (Geçmek için 0 giriniz) ");
		s1 = scan.nextInt();
		System.out.print("İkinci sayıyı giriniz: (Geçmek için 0 giriniz) ");
		s2 = scan.nextInt();
		System.out.print("Üçüncü sayıyı giriniz: (Geçmek için 0 giriniz) ");
		s3 = scan.nextInt();
		topla(s1, s2, s3);
		scan.close();
	}
}