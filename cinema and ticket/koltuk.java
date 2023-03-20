package vize;
import java.io.*;
import java.util.Scanner;


public class koltuk {
	//bilgilerin tutuldu�u alan
	private String salonNo;									
	private String siraNO;
	private String koltukNo;
	public int KoltukCheck=0;
	
	public void YerAyir(String istenenSalon,String istenenSira,String istenenKoltuk) {
		File dosya =new File("sinema.txt");					//dosyay� a�ma
		
		try {
			
			Scanner scan = new Scanner(dosya);
			while(scan.hasNext()) {							//dosya bitene kadar okuma
				String dogrulama = scan.next();
				String[] tokens = dogrulama.split(","); 	//dosyadan okudu�u sat�r� virg�le g�re ay�ran metod
				if(tokens[0].equals(istenenSalon)) {
					if(tokens[1].equals(istenenSira)) {
						if(tokens[2].equals(istenenKoltuk)){
							if(tokens[3].equals("dolu")) {
								System.out.println("yer ay�rma i�lemi ba�ar�s�z,istenen yer dolu");
							}
							else {
								System.out.println("yer ay�rma i�lemi ba�ar�l�");
								this.salonNo=istenenSalon;										//koltuk class �na value atama
								this.siraNO=istenenSira;
								this.koltukNo=istenenKoltuk;
								System.out.println("-----------�zet--------");
								System.out.println("se�ilen salon no:"+this.salonNo);
								System.out.println("se�ilen s�ra no:"+this.siraNO);
								System.out.println("se�ilen koltuk no:"+this.koltukNo);
								System.out.println("------------------------");
								this.KoltukCheck=1;
								
							}
						}
					}
				}
			}
			scan.close();
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	
		
	}
	public void koltukGonder() {
		bilet bilet1 = new bilet();
		bilet1.setKoltukBilgi(this.salonNo, this.siraNO, this.koltukNo);
	}
	
	public String getsalonNO() {								//bilgiler i�in getter metodlar� 
	    return salonNo;											//
	}															//
	public String getsiraNO() {									//
	    return siraNO;											//
	}															//
	public String getkoltukNO() {								//
	    return koltukNo;										//
	}

}
