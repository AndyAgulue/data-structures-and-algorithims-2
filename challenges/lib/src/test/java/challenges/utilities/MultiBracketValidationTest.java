package challenges.utilities;


import org.junit.Test;
import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    @Test
    public void MultiBracketValidationTest(){

        assertTrue(MultiBracketValidation.multiBracketValidation(("{}")));

        assertTrue(MultiBracketValidation.multiBracketValidation(("{}()")));

        assertTrue(MultiBracketValidation.multiBracketValidation(("()[[What's up]]")));

        assertTrue(MultiBracketValidation.multiBracketValidation(("{}(Hi There){Hi There}[]")));

        assertFalse(MultiBracketValidation.multiBracketValidation(("{{[]}")));

        assertFalse(MultiBracketValidation.multiBracketValidation(("{[")));




    }
}


