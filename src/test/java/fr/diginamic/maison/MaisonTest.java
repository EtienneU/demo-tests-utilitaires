package fr.diginamic.maison;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaisonTest {

	@Test
	public void testAjouterPieceNull() {
		Piece[] tabPieces = { 
				new Chambre(12f, (short) 1),
				new Chambre(13f, (short) 1),
				new Salon(19f, (short) 0),
				new Wc(2f, (short) 1),
				new Wc(4f, (short) 0),
				new SalleDeBain(5f, (short) 1),
				new Cuisine(9f, (short) 0) };

		Maison maison = new Maison(tabPieces);
		float superficieAvantAjout = maison.getSuperficieTot();
		maison.ajouterPiece(null);
		float superficieApresAjout = maison.getSuperficieTot();
		
		// Je vérifie si l'ajout d'une piece null m'ajoute une chambre de 9m² par défaut
		assertTrue(superficieApresAjout == superficieAvantAjout + 9f);
	}

}
