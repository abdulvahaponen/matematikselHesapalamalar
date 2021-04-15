package test;
import hesapMakinesi.*;
public class hesapTest {
 public static void main(String args[]) {
	hesappMakinesi hesap=new hesappMakinesi();
	double sonuc=hesap.toplama(2.0, 3.8);
System.out.println("sonuc:"+sonuc);

 
boolean asalMi= hesap.asalSayi(73);
if (asalMi==true) {
	System.out.println("sayiasaldýr");
}
else {
	System.out.println("sayi asla deðildir");
}

boolean mukemmelMi=hesap.mukemmelSayi(28);
if (mukemmelMi==true) {
	System.out.println("sayý mükemmel sayý");
}
else {
	System.out.println("sayý mükemmel deðildir");
}

boolean arkadasMi=hesap.arkadasSayilar(220,284);
if (arkadasMi==true) {
	System.out.println("girilen sayýlar arkadaþ");
}
else {
	System.out.println("girilen sayýlar arkadaþ deðildir");
}
}
}