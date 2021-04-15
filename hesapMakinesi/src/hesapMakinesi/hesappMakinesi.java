package hesapMakinesi;

public class hesappMakinesi implements IhesapRepository {
      
	public int basamakSayisi;
	boolean hesaplanamayanDeger;
	@Override
	public double toplama(Double ilkSayi, double ÝkinciSayi) {
		// TODO Auto-generated method stub
		double sonuc=ilkSayi+ÝkinciSayi;		
		return sonuc;
	}

	@Override
	public double cikarma(Double ilkSayi, double ÝkinciSayi) {
		// TODO Auto-generated method stub
		double sonuc;
		if(ilkSayi>ÝkinciSayi) {
		 sonuc=ilkSayi-ÝkinciSayi;
		}
		else {
			sonuc=-(ilkSayi-ilkSayi);
		}
		return sonuc;
		
	}

	@Override
	public double carpma(Double ilkSayi, double ÝkinciSayi) {
		// TODO Auto-generated method stub
		double sonuc=ilkSayi*ÝkinciSayi;
		return sonuc;
	}

	@Override
	public double bolme(Double ilkSayi, double ÝkinciSayi) {
		// TODO Auto-generated method stub
		double sonuc=ilkSayi/ÝkinciSayi;
		return sonuc;
	}
public boolean asalSayi(int sayi) {

	boolean isPrime=true;
	for(int i=2;i<sayi;i++) {
		if(sayi%i==0) {
				isPrime=false;
	     }
		else {
			isPrime=true;
		}
	
}
	return isPrime;
}


//6=1+2+3 gibi veya 28=1+2+4+7+14
     public boolean mukemmelSayi(int sayi) {

    	 int toplam=0;
    	 for(int i=1;i<sayi;i++) {
    		 if(sayi%i==0) {
    			 toplam=toplam+i;
    		 }
    	 }
    	 if (toplam==sayi) {
			return true;
		}
    	 else {
			return  false;
		}
     }
 //pozitif tamsayý bölenleri toplamlarý birbirine eþit olan sayýlar..220-284 gibi
     public boolean arkadasSayilar(int sayi1,int sayi2) {
    	 int toplam1=0;
    	 int toplam2=0;
    	 for (int i = 1; i < sayi1; i++) {
			if (sayi1%i==0) {
				toplam1=toplam1+i;
			}
		}
    	 for (int i = 1; i < sayi2; i++) {
 			if (sayi2%i==0) {
 				toplam2=toplam2+i;
 			}
 		}
    	 if (sayi1==toplam2 && sayi2==toplam1) {
			return true;
		}
    	 else {
			return false;
		}
     }
 }