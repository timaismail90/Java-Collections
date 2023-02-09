package day4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeNumberTest {

	@Test
	public void testIspalindrome() {
		assertTrue(PalindromeMain.isPalindrome(1001), "Not a palindrome");
	}
	
	@Test
	public void testIspalindromeTwo() {
		assertTrue(PalindromeMain.isPalindrome(101), "Not a palindrome");
		
	}
	
	@Test
	public void testNotpalindrome() {
		assertTrue(PalindromeMain.isPalindrome(123), "Not a palindrome");
		
	}
	@Test
	public void testNotpalindromeTwo() {
		assertTrue(PalindromeMain.isPalindrome(143), "Not a palindrome");
		
	}
	

}
