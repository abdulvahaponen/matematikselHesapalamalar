package test;

import javax.swing.JOptionPane;

import hesapMakinesi.fibonacci;

public class JUnitFibo {
public static void main(String[] args) {
	fibonacci fibo=new fibonacci();
	int sayi=Integer.parseInt(JOptionPane.showInputDialog("n= "));
	
	JOptionPane.showMessageDialog(null,"fibonacci("+sayi+")="+ fibo.fibonacciHesaplama(sayi));
	System.out.println("log="+ fibo.log(sayi));
}
}
