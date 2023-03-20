package vize;

class indirimBilet extends bilet {								// bilet sýnýfýndan kalýtmla üretilmiþ
	
	private String indirimKodu="A5-1994-666";					
	private String indirimMiktari="20%";
	
	
	
	public String getindirimKodu(){								//indirm kodu özellikleri
		return this.indirimKodu;
	}
	public String getindirimMiktari(){
		return this.indirimMiktari;
	}
	
	
	
	public void fiyatYazdir(){											//polymorphism
		int yeniFiyat=(this.fiyat - this.fiyat*2/10) ;
		System.out.println("indirim uygulanmýþ fiyat:"+(yeniFiyat)+"TL" );
		System.out.println("--------bilet---------");
	}
	

}
