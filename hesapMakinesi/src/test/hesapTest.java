package test;
import hesapMakinesi.*;
public class hesapTest {
 public static void main(String args[]) {
	hesappMakinesi hesap=new hesappMakinesi();
	double sonuc=hesap.toplama(2.0, 3.8);
System.out.println("sonuc:"+sonuc);

 
boolean asalMi= hesap.asalSayi(73);
if (asalMi==true) {
	System.out.println("sayiasald�r");
}
else {
	System.out.println("sayi asla de�ildir");
}

boolean mukemmelMi=hesap.mukemmelSayi(28);
if (mukemmelMi==true) {
	System.out.println("say� m�kemmel say�");
}
else {
	System.out.println("say� m�kemmel de�ildir");
}

boolean arkadasMi=hesap.arkadasSayilar(220,284);
if (arkadasMi==true) {
	System.out.println("girilen say�lar arkada�");
}
else {
	System.out.println("girilen say�lar arkada� de�ildir");
}
}
}