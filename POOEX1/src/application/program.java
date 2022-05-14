package application;

import java.util.Locale;
import java.util.Scanner;

import entities.retangulo;

public class program {

	public static void main(String[] args) {
		
	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		retangulo Retangulo = new retangulo();
		
		System.out.println("Digite a altura do retangulo: ");
		Retangulo.heigth = sc.nextDouble();
		
		System.out.println("Digite a largura do retagulo: ");
		Retangulo.width = sc.nextDouble();
		
		System.out.println(Retangulo);
		
		sc.close();
	}

}
