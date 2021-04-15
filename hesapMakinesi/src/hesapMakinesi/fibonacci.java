package hesapMakinesi;

public class fibonacci {
public static long fibonacciHesaplama(long sayi) {
	if(sayi<=0) {
		return 0;
	}
	else if (sayi==1) {
		return 1;
	}
	else {
		return fibonacciHesaplama(sayi-1)+fibonacciHesaplama(sayi-2);
	}
}
//ýn(x)=1+y^2/3+y^4/5.....
public static double log(double x) {
	double power=1;
	double In=1;
	double y=(x-1)/(x+1);
	double n=1;
	do {
		power*=y*y;
		In+=power/(2.0*n+1.0);
		n++;
	} while (n<=100000);
	In*=2*y;
	return In;
}
}
