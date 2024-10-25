package Abusivesnake;
import java.util.Scanner;
public class SwitchCaseAtm 
{
	public static void main(String[] args)
	{
		int islemID, hNO;
		Scanner scan = new Scanner(System.in);
		System.out.print("[SİSTEM]: Hesap numaranızı giriniz: ");
		hNO = scan.nextInt();
		while(hNO < 10000 || hNO > 99999)
		{
			System.out.println("[SİSTEM - HATA]: Hatalı hesap numarası girdiniz!");
			System.out.println("[SİSTEM - BİLGİ]: İşlem ID'leri 10000-99999 arasındadır!");
			System.out.print("[SİSTEM]: Hesap numaranızı giriniz: ");
			hNO = scan.nextInt();
		}
		System.out.println("1-) Para Çekme");
		System.out.println("2-) Para Yatırma");
		System.out.println("3-) Para Transferi");
		System.out.println("4-) Sistemden Çıkış");
		System.out.print("[SİSTEM]: Yapmak istediğiniz işlemi seçiniz: ");
		islemID = scan.nextInt();
		while(islemID < 1 || islemID > 4)
		{
			System.out.println("[SİSTEM - HATA]: Hatalı ID girdiniz!");
			System.out.println("[SİSTEM - BİLGİ]: İşlem ID'leri 1-4 arasındadır!");
			System.out.println("1-) Para Çekme");
			System.out.println("2-) Para Yatırma");
			System.out.println("3-) Para Transferi");
			System.out.println("4-) Sistemden Çıkış");
			System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
			islemID = scan.nextInt();
		}
		Islemler(islemID, hNO);
		scan.close();
	}
	
	public static void Islemler(int pID, int aID)
	{
		int MAX_CEKILEBILIR_PARA = 10000, MAX_YATIRILABILIR_PARA = 250000, MAX_TRANSFER_EDILEBILIR_PARA = 50000, para, daID, transfer_miktar = 0;
		Scanner scan = new Scanner(System.in);
		switch(pID)
		{
			case 1:
			{
				System.out.print("[SİSTEM]: Çekmek istediğiniz miktarı giriniz: ");
				para = scan.nextInt();
				if(para > MAX_CEKILEBILIR_PARA)
				{
					System.out.println("[SİSTEM - HATA]: Çekmek istediğiniz miktar çekilebilir limitin üstünde!");
					System.out.println("[SİSTEM - BİLGİ]: Çekilebilir Limit: " + MAX_CEKILEBILIR_PARA);
					System.out.print("[SİSTEM]: Çekmek istediğiniz miktarı giriniz: ");
					para = scan.nextInt();
				}
				paracekme_log(aID, para);
				break;
			}
			case 2:
			{
				System.out.print("[SİSTEM]: Yatırmak istediğiniz miktarı giriniz: ");
				para = scan.nextInt();
				if(para > MAX_YATIRILABILIR_PARA)
				{
					System.out.println("[SİSTEM - HATA]: Yatırmak istediğiniz miktar yatırılabilir limitin üstünde!");
					System.out.println("[SİSTEM - BİLGİ]: Çekilebilir Limit: " + MAX_YATIRILABILIR_PARA);
					System.out.print("[SİSTEM]: Yatırmak istediğiniz miktarı giriniz: ");
					para = scan.nextInt();
				}
				parayatirma_log(aID, para);
				break;
			}
			case 3:
			{
				System.out.print("[SİSTEM]: Transfer yapmak istediğiniz hesap numarasını giriniz: ");
				daID = scan.nextInt();
				while(daID < 10000 || daID > 99999)
				{
					System.out.println("[SİSTEM - HATA]: Bu hesap numarası bankamıza ait değil!");
					System.out.println("[SİSTEM - BİLGİ]: Bankalar arası transferlere izin vermemekteyiz!");
					System.out.print("[SİSTEM]: Transfer yapmak istediğiniz hesap numarasını giriniz: ");
					daID = scan.nextInt();
				}
				System.out.print("[SİSTEM]: Transfer etmek istediğiniz miktarı giriniz: ");
				transfer_miktar = scan.nextInt();
				if(transfer_miktar > MAX_TRANSFER_EDILEBILIR_PARA)
				{
					System.out.println("[SİSTEM - HATA]: Transfer etmek istediğiniz miktar transfer edilebilir miktarın üstünde!");
					System.out.println("[SİSTEM - BİLGİ]: Transfer Edilebilir Miktar: " + MAX_TRANSFER_EDILEBILIR_PARA);
					System.out.print("[SİSTEM]: Transfer etmek istediğiniz miktarı giriniz: ");
					transfer_miktar = scan.nextInt();
				}
				paratransfer_log(aID, daID, transfer_miktar);
				break;
			}
			case 4:
			{
				System.out.println("[SİSTEM - UYARI]: Sistemden çıkış yapılıyor...");
				System.out.println("[SİSTEM - BİLGİ]: Kartınızı hazneden almayı unutmayınız!");
				break;
			}
		}
		scan.close();
	}
	
	public static void paracekme_log(int hesapID, int money)
	{
		System.out.println(hesapID + " hesap numarasından " + money + "TL miktarında para çekildi!");
	}
	
	public static void parayatirma_log(int hesapID, int money)
	{
		System.out.println(hesapID + " hesap numarasına " + money + "TL miktarında para yatırıldı!");
	}
	
	public static void paratransfer_log(int ana_ID, int transfer_ID, int transfer_money)
	{
		System.out.println(ana_ID + " hesap numarasından " + transfer_ID + " hesap numarasına " + transfer_money + "TL miktarında para transfer edildi!");
	}
}