package hesapMakinesi;

public class temelMatematikselIslemler {
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
    public boolean aranacaksayi(int sayi) {
    	int[] sayilar=new int[] {1,2,3,5,7,9};
          boolean varMi=false;
    	for(int i:sayilar) {
    		if(i==sayi) {
    		varMi=true;	
    		}
    		else {
			 varMi =false;
			}
    	}
    	return varMi;
    }
    }
