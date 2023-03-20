package vize;

public class bilet {
	private String ad;					//seyircinin bilgileri
	private String soyad;
	private String tc;
	
	
	
	private static String filmAdi;				//gosterim class bilgiler
	private static String seans;
	private static String tarih;
	
	private static String salonNo;             //koltuk class bilgileri
	private static String siraNo;
	private static String koltukNo;

	public int fiyat = 60;						//fiyat özelliði 
	
	
	
	
	public void setGosterimBilgi(String filmAdi,String seans,String tarih) {
	    this.filmAdi = filmAdi;
	    this.seans = seans;
	    this.tarih = tarih;
	}
	public void setSeyirciBilgileri(String ad,String soyad,String tc) {
		this.ad=ad;
		this.soyad=soyad;
		this.tc=tc;
		
	}
	public void setKoltukBilgi(String salonNO,String siraNO,String koltukNO) {
		this.salonNo= salonNO;
	    this.siraNo = siraNO;
	    this.koltukNo = koltukNO;
	}
	
	public void yazdir() {
		System.out.println("-------bilet--------");									//yazdýrma metodu
		System.out.println("seyirci adý:"+this.ad);
		System.out.println("seyirci soyadý:"+this.soyad);
		System.out.println("seyirci tc no:"+this.tc);
		System.out.println("salon no:"+this.salonNo);
		System.out.println("sýra no:"+this.siraNo);
		System.out.println("koltuk no:"+this.koltukNo);
		System.out.println("film adý:"+this.filmAdi);
		System.out.println("seans bilgisi:"+this.seans);
		System.out.println("tarih:"+this.tarih);
	}
	public void fiyatYazdir(){
		System.out.println("fiyat:"+this.fiyat+"TL");
		System.out.println("--------bilet---------");
	}


	
}
