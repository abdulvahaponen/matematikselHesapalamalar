package hesapMakinesi;

public class PalindRomalSayilar {
public boolean palindromal(int sayi) {
	int tmp ,tersSayi=0,kalan;
	 tmp=sayi;
	while(tmp!=0) {
		kalan=tmp%10;
		tersSayi=tersSayi*10+kalan;
		tmp/= 10;
	}
	if (sayi==tersSayi) {
		return true;
	}
	else {
		return false;
	}
}
public static void main(String[] args) {
	PalindRomalSayilar palindrom=new PalindRomalSayilar();
	System.out.println("palindrom:"+ palindrom.palindromal(123));
	System.out.println("palindrom:"+ palindrom.palindromal(123321));

}
}
