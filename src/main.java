import java.util.Scanner;

/*
 * Java ile Matematik, Fizik, Kimya, T�rk�e, Tarih, M�zik derslerinin s�nav puanlar�n� kullan�c�dan alan 
 * ve ortalamalar�n� hesaplay�p ekrana bast�r�lan program� yaz�n. Ayn� program i�erisinde ko�ullu ifadeler 
 * kullan�larak, e�er kullan�c�n�n ortalamas� 60'dan b�y�k ise ekrana "S�n�f� Ge�ti" , k���k ise "S�n�fta Kald�" yazs�n. 
 * 					Not : If ve Else kullan�lmayacak...
 * */
public class main {

	public static void main(String[] args) {
		
		int mat,fiz,kim,t�r,tar,m�z;
		
		Scanner girdi=new Scanner(System.in);
		
		System.out.println("Matematik notunuz: ");
		mat = girdi.nextInt();
		
		System.out.println("Fizik notunuz: ");
		fiz = girdi.nextInt();
		
		System.out.println("Kimya notunuz: ");
		kim = girdi.nextInt();
		
		System.out.println("T�rk�e notunuz: ");
		t�r = girdi.nextInt();
		
		System.out.println("Tarih notunuz: ");
		tar = girdi.nextInt();
		
		System.out.println("M�zik notunuz: ");
		m�z = girdi.nextInt();
		
		int toplam = (mat+fiz+kim+t�r+tar+m�z);
		double sonuc = toplam / 6.0;
		
		while(sonuc>=60) {
			System.out.println("S�n�f� ge�tin");
			return;
		}
		while(sonuc<60) {
			System.out.println("S�n�fta kald�n");
			return;
		}
		
		

	}

}
