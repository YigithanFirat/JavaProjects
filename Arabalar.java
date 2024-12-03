package Abusivesnake;
import java.util.Scanner;
public class Arabalar
{
    public int fiyat, kdv;
    public double km,
    public String marka, model;
    Arabalar(int fiyat, int kdv, double km, String marka, String model)
    {
        this.fiyat = fiyat;
        this.kdv = kdv;
        this.km = km;
        this.marka = marka;
        this.model = model;
    }

    public void arabaListele()
    {
        System.out.prinln("Araba Fiyatı: " + this.fiyat);
    }
    public static void main(String[] args)
    {

    }
}