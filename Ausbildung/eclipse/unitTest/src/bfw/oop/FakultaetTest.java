package bfw.oop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class FakultaetTest {
    @Test
    void testFakultaet6() {
	//given
	Fakultaet f = new Fakultaet();
	
	//when
	long result = f.fakultaet(6);
	
	//then
	assertEquals(720, result, "6! should be 720.");
    }
    
    @Test
    void testFakultaetSmallerThan1() {
        // given
        Fakultaet f = new Fakultaet();

        // when
       Exception exception = assertThrows(IllegalArgumentException.class, () -> f.fakultaet(0));

      // then
        assertEquals("Zahl muss groesser gleich 1 sein!", exception.getMessage());
    }
    
    @Test
    void testFakultaetOverflow() 
    {
        // given
        Fakultaet f = new Fakultaet();

        // when
        Exception exception = assertThrows(IllegalArgumentException.class, () -> f.fakultaet(22));

        // then
        assertEquals("Overflow!", exception.getMessage());
    }

}//End of class
