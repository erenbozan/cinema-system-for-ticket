package vize;
import java.io.*;
import java.util.Scanner;


public class koltuk {
	//bilgilerin tutulduðu alan
	private String salonNo;									
	private String siraNO;
	private String koltukNo;
	public int KoltukCheck=0;
	
	public void YerAyir(String istenenSalon,String istenenSira,String istenenKoltuk) {
		File dosya =new File("sinema.txt");					//dosyayý açma
		
		try {
			
			Scanner scan = new Scanner(dosya);
			while(scan.hasNext()) {							//dosya bitene kadar okuma
				String dogrulama = scan.next();
				String[] tokens = dogrulama.split(","); 	//dosyadan okuduðu satýrý virgüle göre ayýran metod
				if(tokens[0].equals(istenenSalon)) {
					if(tokens[1].equals(istenenSira)) {
						if(tokens[2].equals(istenenKoltuk)){
							if(tokens[3].equals("dolu")) {
								System.out.println("yer ayýrma iþlemi baþarýsýz,istenen yer dolu");
							}
							else {
								System.out.println("yer ayýrma iþlemi baþarýlý");
								this.salonNo=istenenSalon;										//koltuk class ýna value atama
								this.siraNO=istenenSira;
								this.koltukNo=istenenKoltuk;
								System.out.println("-----------özet--------");
								System.out.println("seçilen salon no:"+this.salonNo);
								System.out.println("seçilen sýra no:"+this.siraNO);
								System.out.println("seçilen koltuk no:"+this.koltukNo);
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
	
	public String getsalonNO() {								//bilgiler için getter metodlarý 
	    return salonNo;											//
	}															//
	public String getsiraNO() {									//
	    return siraNO;											//
	}															//
	public String getkoltukNO() {								//
	    return koltukNo;										//
	}

}
