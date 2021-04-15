package test;

import javax.swing.JOptionPane;

import org.omg.PortableServer.ServantLocatorPackage.CookieHolder;

import hesapMakinesi.cosinusSinus;

public class jUnitMatematik {
public static void main(String[] args) {
	cosinusSinus cs=new cosinusSinus();
	double x1=Double.parseDouble(JOptionPane.showInputDialog("x="));
	System.out.println("exp("+x1+")="+cs.exponansiyel(x1));
	System.out.println("(In("+x1+")="+cs.In(x1));
	System.out.println("sin("+0+")="+cs.sin(Math.PI));
	System.out.println("cos("+0+")="+cs.cos(Math.PI));
	System.out.println("cosh("+0+")="+cs.cosh(Math.PI));

	System.out.println("(exp(+x+"+cs.cosh(x1));

}
}
