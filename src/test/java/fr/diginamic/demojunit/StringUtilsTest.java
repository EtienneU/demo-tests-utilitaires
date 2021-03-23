package fr.diginamic.demojunit;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.diginamic.stringutils.StringUtils;


/**Classe de test unitaire sur la méthode levenshteinDistance()
 * 
 * @author EtienneUrbano
 *
 */
public class StringUtilsTest {

	/**
	 * 
	 */
	@Test
	public void testLevenshteinDistance0() {
		assertEquals(0, StringUtils.levenshteinDistance("Luciole", "Luciole"));
	}
	
	@Test
	public void testLevenshteinDistance1() {
		assertTrue("la méthode retourne 1, c'est ok", StringUtils.levenshteinDistance("chat", "chats") == 1);
	}
	
	@Test
	public void testLevenshteinDistance2() {
		assertEquals(2, StringUtils.levenshteinDistance("chien", "chine"));
	}
	
	@Test
	public void testLevenshteinDistance3() {
		assertEquals(3, StringUtils.levenshteinDistance("hien", "chine"));
	}
	
	@Test
	public void testLevenshteinDistanceVide() {
		assertEquals(6, StringUtils.levenshteinDistance("", "Egypte"));
	}
	
	@Test
	public void testLevenshteinDistanceVide2() {
		assertEquals(0, StringUtils.levenshteinDistance("", ""));
	}
	
	@Test
	public void testLevenshteinDistanceNull() {
		assertEquals(-1, StringUtils.levenshteinDistance(null, "Vaccin"));
	}
	

}
