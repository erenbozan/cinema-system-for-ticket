package vize;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);  
		koltuk kyt = new koltuk();
		bilet blt = new bilet();
		gosterim gstrm = new gosterim();
		indirimBilet ind = new indirimBilet();
		
		String istenenSalon;
		String istenenSira;
		String istenenKoltuk;
	
		while(kyt.KoltukCheck == 0) {
			System.out.println("salon numarý girin 1-4:");
			istenenSalon = scan.next();
			System.out.println("sýra numarý girin 1-4:");
			istenenSira = scan.next();
			System.out.println("koltuk numarý girin 1-4:");
			istenenKoltuk = scan.next();
			kyt.YerAyir(istenenSalon,istenenSira,istenenKoltuk);
		}
		
		gstrm.gosterme();
			
		String SeyirciAd;
		String SeyirciSoyad;
		String SeyirciTC;
		
		String kod;
		int denetle=0;
		
		System.out.println("seyirci ismi girin;");
		SeyirciAd = scan.next();
		System.out.println("seyirci soyad girin:");
		SeyirciSoyad = scan.next();
		System.out.println("seyirci TC no girin:");
		SeyirciTC = scan.next();
		System.out.println("indirim kodu girin (3 deneme hakký var)");
	
		
		for(int i=3;i>0;i--) {
			kod=scan.next();
			if(kod.equals(ind.getindirimKodu())) {								//indirim kodu: A5-1994-666
				System.out.println("indirim uygulandý ");						//indirim kodu: A5-1994-666
				denetle =1;														//indirim kodu: A5-1994-666
				break;
			}
			else{
				System.out.println("kod hatalý tekrar deneyin,kalan deneme hakký:"+(i-1));
			}
		}
		
		blt.setSeyirciBilgileri(SeyirciAd, SeyirciSoyad, SeyirciTC);
		kyt.koltukGonder();
		gstrm.gosterimGonder();
		blt.yazdir();
		if(denetle==1) {									//polymorphism
			ind.fiyatYazdir();
		}
		else {
			blt.fiyatYazdir();
		}
	}
}
