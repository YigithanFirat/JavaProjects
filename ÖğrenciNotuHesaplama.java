package Abusivesnake;
import java.util.Scanner;
public class ÖğrenciNotuHesaplama 
{
	public static void main(String[] args)
	{
		double vize_not, final_not;
		Scanner scan = new Scanner(System.in);
		System.out.print("Vize notunuzu giriniz: ");
		vize_not = scan.nextDouble();
		System.out.print("Final notunuzu giriniz: ");
		final_not = scan.nextDouble();
		double yilsonu_notu = (vize_not * 0.4) + (final_not * 0.6);
		System.out.println("Yıl sonu notunuz: " + yilsonu_notu);
		if(yilsonu_notu > 90)
		{
			System.out.println("AA ile dersi geçtiniz!");
		}
		else if(yilsonu_notu > 85 && yilsonu_notu < 90)
		{
			System.out.println("BA ile dersi geçtiniz!");
		}
		else if(yilsonu_notu > 80 && yilsonu_notu < 85)
		{
			System.out.println("BB ile dersi geçtiniz!");
		}
		else if(yilsonu_notu > 75 && yilsonu_notu < 80)
		{
			System.out.println("CB ile dersi geçtiniz!");
		}
		else if(yilsonu_notu > 50 && yilsonu_notu < 75)
		{
			System.out.println("Koşullu şekilde dersi geçtiniz!");
		}
		else
		{
			System.out.println("Dersi geçemediniz!");
		}
		scan.close();
	}
}