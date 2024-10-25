package Abusivesnake;
import java.util.Random;
public class RastgeleSayıÜretme 
{
	public static void main(String[] args)
	{
		int sayi;
		Random rastgele = new Random();
		for(int i = 0; i < 10; i++)
		{
			sayi = 200 + rastgele.nextInt(800);
			System.out.println(sayi);
		}
	}
}