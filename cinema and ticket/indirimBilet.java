package vize;

class indirimBilet extends bilet {								// bilet s�n�f�ndan kal�tmla �retilmi�
	
	private String indirimKodu="A5-1994-666";					
	private String indirimMiktari="20%";
	
	
	
	public String getindirimKodu(){								//indirm kodu �zellikleri
		return this.indirimKodu;
	}
	public String getindirimMiktari(){
		return this.indirimMiktari;
	}
	
	
	
	public void fiyatYazdir(){											//polymorphism
		int yeniFiyat=(this.fiyat - this.fiyat*2/10) ;
		System.out.println("indirim uygulanm�� fiyat:"+(yeniFiyat)+"TL" );
		System.out.println("--------bilet---------");
	}
	

}
