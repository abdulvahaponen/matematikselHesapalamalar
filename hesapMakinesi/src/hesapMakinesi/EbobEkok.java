package hesapMakinesi;

public class EbobEkok {
public   int  ebob(int sayi1,int sayi2) {
	int min=(sayi1<sayi2)?sayi1:sayi2;
	int ebob = 1;
	for (int i = min; i >0; i--) {
		if (sayi1%i==0 && sayi2%i==0) {
			ebob=i;
			break;
		}
	}
	return  ebob;
}
public   int ekok(int sayi1,int sayi2) {
	int min=(sayi1<sayi2)?sayi1:sayi2;
	int ebob = 1,ekok;
	for (int i = min; i >0; i--) {
		if (sayi1%i==0 && sayi2%i==0) {
			ebob=i;
			break;
		}
	}
	ekok=(sayi1*sayi2)/ebob;
	return ekok;
}
}
