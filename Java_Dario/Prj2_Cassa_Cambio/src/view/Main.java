package view;

import java.util.Scanner;

import controller.CassaCtrl;

public class Main {
	private static CassaCtrl cassaCtrl;
	private static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		cassaCtrl = new CassaCtrl("Cassa Aeroporto", 8500);
		
		System.out.println("=======CASSA CAMBIO=====");
		
		boolean accesa = true;
		
		while(accesa) {
			accesa = mostraMenu();
		}
	}
	
	private static boolean mostraMenu() {
		
		System.out.println("----MENU Principale----");
		System.out.println("1. Esegui Cambio Euro/Dollari");
		System.out.println("0. Esci");
		
		int scelta = scan.nextInt();
		
		switch(scelta) {
		case 1:
			eseguiCambio();
			break;
		case 0:
			System.out.println("Arrivederci e grazie");
			return false;
		}
		
		return false;
	}
	
	private static void eseguiCambio() {
		System.out.println("Inserire importo per il cambio");
		double importoCambio = scan.nextDouble();
		scan.nextLine();
		
		String report = cassaCtrl.eseguiCambio(importoCambio);
		
		System.out.println(report);
	}
}
