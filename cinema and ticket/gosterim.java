package vize;

public class gosterim {
	
	private String filmAdi = "Hýzlý Ve Öfkeli" ;						//bilet sahibinin özellikleri
	private String seans = "20:00-22:30";
	private String tarih = "5.4.2021";
	private String salonNo;
	
	public void gosterme() {
		
		koltuk ktk = new koltuk();										//gösterim nesnesi
		this.salonNo = ktk.getsalonNO();
	}
	
	public void gosterimGonder() {
		bilet bilet3 = new bilet();
		bilet3.setGosterimBilgi(filmAdi, seans, tarih);
	}

}
