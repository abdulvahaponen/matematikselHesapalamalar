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
			System.out.println("l�tfen 0-100 aras� br sayi giriniz...");
		  continue;
		}
	if (tahmin==sayi) {
		oyunDurumu=true;
		break;
		
	}	
	else {
	 System.out.println("yanl��.tekrar deneyiniz.."+ --can);
	}
	} 
	if (oyunDurumu==true) {
		System.out.println("tabrikler do�ru tahmin...");
		System.out.println("say�m�z:"+sayi);
		System.out.println("kalan can"+can);
	}
	else {
		System.out.println("ba�aramad�n�z..");
	}
}
}
