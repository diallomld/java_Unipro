package model;

import service.IPersonnage;

public class Personnage implements IPersonnage {
	
	private int vie = 5;

	private int atk = 1;
	
	private String nom;		
	
	/**
	 * @param nom
	 */
	public Personnage(String nom) {
		super();
		this.nom = nom;
	}
	
	
	public int getVie() {
		return vie;
	}
	public void setVie(int vie) {
		this.vie = vie;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/* (non-Javadoc)
	 * @see service.IPersonnage#attaque(service.Personnage)
	 */
	@Override
	public void attaque(Personnage cible) {
		//this.vie -= this.atk;
		//System.out.println(cible.getNom());
		//cible.setVie(10);
		
		cible.vie -= this.atk;
	}
	
	/* (non-Javadoc)
	 * @see service.IPersonnage#isDie()
	 */
	@Override
	public boolean isDie() {
		return this.vie <= 0 ;
	}
	/* (non-Javadoc)
	 * @see service.IPersonnage#regenerer()
	 */
	@Override
	public void regenerer(){
			this.vie = 5;
	}

}
