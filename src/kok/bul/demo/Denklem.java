package kok.bul.demo;
import java.util.Scanner;

public class Denklem {
    protected Scanner s = new Scanner(System.in);
    protected int a,b,c;
    
    public Denklem() {
	System.out.println();
	System.out.println("Denklemde bulunan a, b ve c sabitlerini giriniz...");
	System.out.print("\na sabiti : ");
	a = s.nextInt();
	System.out.print("b sabiti : ");
	b = s.nextInt();
	System.out.print("c sabiti : ");
	c = s.nextInt();
	
    }
    
    public int getA() {
	return a;
    }
    
    public int getB() {
	return b;
    }
    
    public int getC() {
	return c;
    }
    
    public void setA(int a) {
	this.a = a;
    }
    
    public void setB(int b) {
	this.b = b;
    }
    
    public void setC(int c) {
	this.c = c;
    }

}
