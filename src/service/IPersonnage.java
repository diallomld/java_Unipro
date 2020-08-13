package service;

import model.Personnage;

public interface IPersonnage {

	void attaque(Personnage cible);

	boolean isDie();

	void regenerer();

}