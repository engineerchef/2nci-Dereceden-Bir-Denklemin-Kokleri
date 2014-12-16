package kok.bul.demo;

public class Sonuc extends Diskriminant {
    protected double s1,s2;
    protected double disk = super.dis;

    public Sonuc() {	
	s1 = (-super.b-Math.sqrt(disk))/(2*a);
	s2 = (-super.b+Math.sqrt(disk))/(2*a);
    }

    public double getS1() {
	return s1;
    }

    public double getS2() {
	return s2;
    }

    public void setS1(double s1) {
	this.s1 = s1;
    }

    public void setS2(double s2){
	this.s2 = s2;
    }

    public String toString() {
	if(super.a==0) {
	    System.out.println("a sabiti sýfýrdan farklý olmalýdýr!!!");
	}

	if (disk<0) {
	    System.out.println("\nDenklemin Reel Kökü Bulunmamaktadýr!!!\n"+
		    "Karmaþýk Sayý Deðerleri Bulunmaktadýr...\n");
	    System.out.println("Diskriminant  : " + disk);
	    System.out.println("\nSonucun \"NaN\" çýkmasý, köklerin her 2'sinin de karmaþýk sayý"+
			" olmasýný nitelemektedir!!!\n"+
			"----------------------------------------" + 
			"----------------------------------------"+
			"-------");
	    System.out.println("Birinci kök   : " + s1);
	    System.out.println("Ýkinci kök    : " + s2);
	} else if (disk == 0) {
	    System.out.println("\nTek bir gerçek kök vardýr. Dolayýsýyla kökler birbirine eþittir!!!\n"+
			"----------------------------------------" + 
			"--------------------------");
	    System.out.println("Diskriminant  : " + disk);
	    System.out.println("Birinci kök, ikinci köke eþittir!!!");
	    System.out.println("Birinci kök   : " + s1);
	    System.out.println("Ýkinci kök    : " + s2);
	} else if (disk>0) {
	    System.out.println("Denklemin 2 gerçek kökü vardýr!!!\n"+
		    "---------------------------------\n"+
		    "Diskriminant  : " + disk + 
		    "\nBirinci kök   : " + s1 + "\nÝkinci kök    : " + s2);
	}
	return "\nBaþka bir denklemin çözümünü bulmak için programý yeniden çalýþtýrýnýz!!!";
    }
}
