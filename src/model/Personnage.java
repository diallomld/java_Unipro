package model;

public class Personnage {
	
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
	
	public void attaque(Personnage cible) {
	  //this.vie -= this.atk;
		//System.out.println(cible.getNom());
		//cible.setVie(10);
		cible.vie -= this.atk;
	}
	
	public boolean isDie() {
		return this.vie <= 0 ;
	}
	public void regenerer(){
			this.vie = 5;
	}

}
