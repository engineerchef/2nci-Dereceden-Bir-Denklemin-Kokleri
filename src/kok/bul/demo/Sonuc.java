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
	    System.out.println("a sabiti s�f�rdan farkl� olmal�d�r!!!");
	}

	if (disk<0) {
	    System.out.println("\nDenklemin Reel K�k� Bulunmamaktad�r!!!\n"+
		    "Karma��k Say� De�erleri Bulunmaktad�r...\n");
	    System.out.println("Diskriminant  : " + disk);
	    System.out.println("\nSonucun \"NaN\" ��kmas�, k�klerin her 2'sinin de karma��k say�"+
			" olmas�n� nitelemektedir!!!\n"+
			"----------------------------------------" + 
			"----------------------------------------"+
			"-------");
	    System.out.println("Birinci k�k   : " + s1);
	    System.out.println("�kinci k�k    : " + s2);
	} else if (disk == 0) {
	    System.out.println("\nTek bir ger�ek k�k vard�r. Dolay�s�yla k�kler birbirine e�ittir!!!\n"+
			"----------------------------------------" + 
			"--------------------------");
	    System.out.println("Diskriminant  : " + disk);
	    System.out.println("Birinci k�k, ikinci k�ke e�ittir!!!");
	    System.out.println("Birinci k�k   : " + s1);
	    System.out.println("�kinci k�k    : " + s2);
	} else if (disk>0) {
	    System.out.println("Denklemin 2 ger�ek k�k� vard�r!!!\n"+
		    "---------------------------------\n"+
		    "Diskriminant  : " + disk + 
		    "\nBirinci k�k   : " + s1 + "\n�kinci k�k    : " + s2);
	}
	return "\nBa�ka bir denklemin ��z�m�n� bulmak i�in program� yeniden �al��t�r�n�z!!!";
    }
}
