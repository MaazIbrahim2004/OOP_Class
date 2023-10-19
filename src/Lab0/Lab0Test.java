package Lab0;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// assertions verify the correctness of assumptions we have made in our program.
public class Lab0Test {
    @Test
    public void testGetMyID() {
        Lab0 lab0 = new Lab0();
        assertEquals("219400795", Lab0.getMyID());
    }

    @Test
    public void testGetLetterGrade() {
        // assertEquals(expected, actual)
        assertEquals("A+", Lab0.getLetterGrade(95)); // if the actual value is not equal to the expected value,  test fails and throws AssertionError

        assertEquals("A", Lab0.getLetterGrade(85));

        assertEquals("B+", Lab0.getLetterGrade(77));

        assertEquals("B", Lab0.getLetterGrade(73));

        assertEquals("C+", Lab0.getLetterGrade(69));

        assertEquals("C", Lab0.getLetterGrade(62));

        assertEquals("D+", Lab0.getLetterGrade(58));

        assertEquals("D", Lab0.getLetterGrade(51));

        assertEquals("E", Lab0.getLetterGrade(47));

        assertEquals("F", Lab0.getLetterGrade(30));


        assertEquals("A+", Lab0.getLetterGrade(100));

        assertEquals("A+", Lab0.getLetterGrade(90));

        assertEquals("A", Lab0.getLetterGrade(80));

        assertEquals("B+", Lab0.getLetterGrade(75));

        assertEquals("B", Lab0.getLetterGrade(70));

        assertEquals("C+", Lab0.getLetterGrade(65));

        assertEquals("C", Lab0.getLetterGrade(60));

        assertEquals("D+", Lab0.getLetterGrade(55));

        assertEquals("D", Lab0.getLetterGrade(50));

        assertEquals("E", Lab0.getLetterGrade(45));
    }
}
