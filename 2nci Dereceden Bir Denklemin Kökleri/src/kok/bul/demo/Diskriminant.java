package kok.bul.demo;

public class Diskriminant extends Denklem {
   protected double dis;

    public Diskriminant() {
	super.a = a;
	super.b = b;
	super.c = c;
	
	dis = Math.pow(b, 2) -(4*a*c);
    }
    
    public double getDis() {
	return dis;
    }
    
    public void setDis(double dis) {
	this.dis = dis;
    }
}
