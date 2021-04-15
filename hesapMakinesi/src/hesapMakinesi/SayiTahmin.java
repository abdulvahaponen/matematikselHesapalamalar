package hesapMakinesi;

import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {

public static void main(String[] args) {
	int   can=5,tahmin;
	Random rand=new Random();
	Scanner scan=new Scanner(System.in);
	int sayi=rand.nextInt(100);
	System.out.println(sayi);
	boolean oyunDurumu=false;
	while(can<=5) {
		System.out.println("tamininiz:??");
		tahmin=scan.nextInt();
		if (tahmin<0 || tahmin>100) {
			System.out.println("lütfen 0-100 arasý br sayi giriniz...");
		  continue;
		}
	if (tahmin==sayi) {
		oyunDurumu=true;
		break;
		
	}	
	else {
	 System.out.println("yanlýþ.tekrar deneyiniz.."+ --can);
	}
	} 
	if (oyunDurumu==true) {
		System.out.println("tabrikler doðru tahmin...");
		System.out.println("sayýmýz:"+sayi);
		System.out.println("kalan can"+can);
	}
	else {
		System.out.println("baþaramadýnýz..");
	}
}
}
