package hesapMakinesi;

public class kuvvetAlma {
public static double kuvvet(int sayi,int us) {
	double k=1.0;
	if(us<0) {
		for (int i = 0; i < (int)(-us); i++) {
		k*=sayi;
		k=1.0/k;
		}
	}
	else	if(us==0) {
		k=1.0;
	}
	else if (us>0) {
		for (int i = 1; i <=(int)us; i++) {
			k*=sayi;
		}
		
	}
	return k;
}
public static void main(String[] args) {
	kuvvetAlma kuvvet=new kuvvetAlma();
	System.out.println( kuvvet.kuvvet(22, 32));
}
}
