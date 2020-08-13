package main;

import java.util.Scanner;

import model.Personnage;

public class Main {

	public static void main(String[] args) {
		
		Personnage moussa = new Personnage("Moussa");
		Personnage fode = new Personnage("Fodé");
		
		
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				
				int nb;
				do {
					System.out.println("Que voulez-vous ? ");
					
					System.out.println("1. Moussa frappe Fodé");
					System.out.println("2. Fodé frappe Moussa");
					
					nb = sc.nextInt();
					
				} while (nb <1 || nb > 2);
				
				switch (nb) {
				case 1:
					moussa.attaque(fode);
					if (fode.isDie()) {
						System.out.println("Game over," + fode.getNom() + " est Mort :)");
						
						//DEBUT
						int resp;
						do {
							System.out.println("voulez-vous reesayez ? ");
							
							System.out.println("1. OUI");
							System.out.println("2. NON");
							
							resp = sc.nextInt();
							
						} while (resp <1 || resp > 2);
						
						switch (resp) {
						case 1:
							
							fode.regenerer();
							
							int nb1;
							do {
								System.out.println("Que voulez-vous ? ");
								
								System.out.println("1. Moussa frappe Fodé");
								System.out.println("2. Fodé frappe Moussa");
								
								nb1 = sc.nextInt();
								
							} while (nb1 <1 || nb1 > 2);
							
							switch (nb1) {
							case 1:
								moussa.attaque(fode);
								if (fode.isDie()) {
									System.out.println("Game over," + fode.getNom() + " est Mort :)");
								}else {

									System.out.println(fode.getNom() + " est Vivant avec " + fode.getVie() + " vie" );
								}
								break;

							case 2:
								fode.attaque(moussa);
								if (moussa.isDie()) {
									System.out.println("Game over," + moussa.getNom() + " est Mort :)");
								} else {
				
									System.out.println(moussa.getNom() + " est Vivant avec " + moussa.getVie() + " vie" );
								}
								break;
							}
							
							break;

						case 2:
							
							System.err.println("AU REVOIR");
							
							break;
						}
						
						//FIN
						
					} else {
	
						System.out.println(fode.getNom() + " est Vivant avec " + fode.getVie() + " vie" );							
					}
					break;
				case 2:
					fode.attaque(moussa);
					if (moussa.isDie()) {
						System.out.println("Game over," + moussa.getNom() + " est Mort :)");
						
						//********DEBUT**********
						int resp;
						do {
							System.out.println("voulez-vous reesayez ? ");
							
							System.out.println("1. OUI");
							System.out.println("2. NON");
							
							resp = sc.nextInt();
							
						} while (resp <1 || resp > 2);
						
						switch (resp) {
						case 1:
							
							moussa.regenerer();
							
							int nb1;
							do {
								System.out.println("Que voulez-vous ? ");
								
								System.out.println("1. Moussa frappe Fodé");
								System.out.println("2. Fodé frappe Moussa");
								
								nb1 = sc.nextInt();
								
							} while (nb1 <1 || nb1 > 2);
							
							switch (nb1) {
							case 1:
								moussa.attaque(fode);
								if (fode.isDie()) {
									System.out.println("Game over," + fode.getNom() + " est Mort :)");
								}else {

									System.out.println(fode.getNom() + " est Vivant avec " + fode.getVie() + " vie" );
								}
								break;

							case 2:
								fode.attaque(moussa);
								if (moussa.isDie()) {
									System.out.println("Game over," + moussa.getNom() + " est Mort :)");
								} else {
				
									System.out.println(moussa.getNom() + " est Vivant avec " + moussa.getVie() + " vie" );
								}
								break;
							}
							
							break;

						case 2:
							
							System.err.println("AU REVOIR");
							
							break;
						}
					} else {
	
						System.out.println(moussa.getNom() + " est Vivant avec " + moussa.getVie() + " vie" );
					}
					break;
				}
				
			} catch (Exception e) {
				
				System.err.println("Veuillez saisir un nombre :)");
				break;
				
			}
		}while(!moussa.isDie() && !fode.isDie());
		
		
		
	}
	

}
