package hesapMakinesi;

import javax.swing.JOptionPane;

public class matmatikselIslemler {
public int  faktoriyel(int sayi) {
	int faktoriye=1;
	for(int i=0;i<sayi;i++) {
		faktoriye*=i;
	}
	return faktoriye;
	
}
public double exponent(double x) {
	double faktoriyel=1;
	double us=1;
	double exponent=1;
	for(double i=1;i<=300;i++)
	{
	faktoriyel*=i;
	us*=x;
	exponent+=us/faktoriyel;
	}
	 
    return exponent;
}
public static  String yunanAlfabesiYazdir(char x1,char x2)
{ 
	String s="";
	int i=0;
	if(x2>x1) {
		for(char b=x1;b<=x2;b++) {
			s+=b+" ";
			i++;
			//20 harfte alt satýra geç
			if(i%20==0) {
				s+="\n";
			}
		}
	}
	else {
		for(char b=x1;b>=x2;b--) {
			s+=b+" ";
			i++;
			if(i%20==0) {
				s+="\n";
			}
		}
	}
	return s;
}
public static void print(String s,String baslik)
{ JOptionPane.showMessageDialog(null,s,baslik,JOptionPane.PLAIN_MESSAGE); }
public static void print(String s)
{ JOptionPane.showMessageDialog(null,s," ",JOptionPane.PLAIN_MESSAGE); }
public static void main(String[] args) {
	matmatikselIslemler islemler=new matmatikselIslemler();
	System.out.println("faktöriyel sonucu:"+  islemler.faktoriyel(7));
      System.out.println("exponent sonucu:"+islemler.exponent(2));
      
      
      print(yunanAlfabesiYazdir('\u0390','\u03FF'),"char (harf) dizini");
 }
}
