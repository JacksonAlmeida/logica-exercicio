package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xa, xb, xc, ya, yb, yc, areax, areay;
		
		System.out.println("Entre com os valores do triagulo x:");
		xa = sc.nextDouble();
		xb = sc.nextDouble();
		xc = sc.nextDouble();
		
		System.out.println("Entre com os valores do triagulo y:");
		ya = sc.nextDouble();
		yb = sc.nextDouble();
		yc = sc.nextDouble();
		
		double p = (xa+xb+xc)/2.0;
		areax = Math.sqrt(p * (p-xa)*(p-xb)*(p-xb));
		
		p = (ya+yb+yc)/2.0;
		areay = Math.sqrt(p * (p-ya)*(p-yb)*(p-yb));
		
		System.out.printf("Triagulo X area: %.4f%n", areax);
		System.out.printf("Triagulo y area: %.4f%n", areay);
		
		if(areax > areay) {
			System.out.println("Maior area é do triângulo x:");
		}
		else
			System.out.println("maior area é do triângulo Y:");
		
		sc.close();
	}
}
