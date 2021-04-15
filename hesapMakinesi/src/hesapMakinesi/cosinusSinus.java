package hesapMakinesi;

import javax.swing.JOptionPane;

public class cosinusSinus {
	public static double exponansiyel(double x){
		double faktoriyel=1;
		double power=1;
		double exp=0;
	for (int i = 0; i < 200; i++) {
		exp+=power/faktoriyel;
		power*=x;
		faktoriyel*=i;
		
	}
	return exp;
	}
	public static double In(double x) {
		double X=(x-1.0)/(x+1.0);
		double In=x;
		double power=X;
		double K=1;
		for(int k=2;k<100;k++) {
			power*=X*X;
			K=2.0*k-1.0;
			In+=power/K;
			
		}
		In*=2.0;
		return In;
	}
	public static double sin(double x) {
		int isaret=1;
		double pow=x;
		double fact=1;
		int n=1;
		double sin=0;
		for (int i = 1; i <100; i++) {
			sin+=pow/fact*isaret;
			pow*=x*x;
			n=2*i+1;
			fact*=n*(n-1);
			isaret*=-1;
		}
		return sin;
	}
	public static double sinh(double x) {
		double pow=x;
		double fact=1;
		int n=1;
		double sinh=0;
		for (int i = 0; i < 100; i++) {
			sinh+=pow/fact;
			pow*=x*x;
			n=2*i+1;
			fact*=n*(n-1);
			
		}
		return sinh;
	}
	public static double cos(double x) {
		int isaret=1;
		double pow=1;
		double fact=1;
		int n=1;
		double cos=1;
		for (int i = 0; i <100; i++) {
			pow*=x*x;
			n=2*i;
			fact*=n*(n-1);
			isaret*=-1;
			cos+=pow/fact*isaret;
			
		}
		return cos;
	}
	public static double cosh(double x)
	{
	double pow=1;
	double fact=1;
	int n=1;
	double cosh=1;
	for(int k=1;k<100;k++)
	{
	pow*=x*x;
	n=2*k;
	fact*=n*(n-1);
	cosh+=pow/fact;
	}
	return cosh;
	}
}
