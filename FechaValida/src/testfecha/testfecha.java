package testfecha;

import junit.framework.TestCase;

public class testfecha extends TestCase {
	public boolean validadorFecha(int day, int month, int year) {
        if (month < 1 || month > 12) {
            return false;
        } else {
            if (month != 2 && month != 4 && month != 6 && month != 9 && month != 11) {
                return !(day < 1 || day > 31);
            } else if (month != 2) {
                return !(day < 1 || day > 30);
            } else {
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    return !(day < 1 || day > 29); // return 1
                } else {
                    return !(day < 1 || day > 28); //return 2
                }
                
                // FIN 1
            }
            
             // FIN 2
            
        }
        
        // FIN 3

    }
	public void testvalidadiorFecha() {
		assertTrue(validadorFecha(01,01,2012));
	}
	public void testvalidadiorFecha1() {		
		assertTrue(validadorFecha(21,02,2024));
	}
	public void testvalidadiorFecha2() {
		assertTrue(validadorFecha(28,02,2023));
	}
	public void testvalidadiorFecha3() {
		assertTrue(validadorFecha(31,01,2023));
	}
	public void testvalidadiorFecha4() {
		assertTrue(validadorFecha(30,03,2023));
	}
	public void testvalidadiorFecha5() {
		assertFalse(validadorFecha(0,02,2024));
	}
	public void testvalidadiorFecha6() {
		assertFalse(validadorFecha(32,03,2024));
	}
	public void testvalidadiorFecha7() {
		assertFalse(validadorFecha(29,02,2023));
	}
	public void testvalidadiorFecha8() {
		assertFalse(validadorFecha(12,13,2023));
	}
	public void testvalidadiorFecha9() {
		assertFalse(validadorFecha(12,0,2023));
	}
	public void testvalidadiorFecha10() {
		assertEquals(false,validadorFecha(31,11,2023));
	}
}
