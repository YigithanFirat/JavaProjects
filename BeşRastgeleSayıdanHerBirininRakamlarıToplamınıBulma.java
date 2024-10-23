package Abusivesnake;
import java.util.Random;
public class BeşRastgeleSayıdanHerBirininRakamlarıToplamınıBulma 
{
    public static void main(String[] args) 
    {
    	int sayi , toplam = 0;
        Random rastgele = new Random();
        for(int i = 0; i < 5; i++)
        {
            sayi = 100 + rastgele.nextInt(100);
            System.out.print(sayi);
            while(sayi > 0) 
            {
                toplam += sayi % 10;
                sayi = sayi / 10;
            }
            System.out.println(" Rakamları toplamı = " + toplam);
        }
    }
 
}