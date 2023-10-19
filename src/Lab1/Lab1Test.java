package Lab1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// assertions verify the correctness of assumptions we have made in our program.
public class Lab1Test {
    @Test
    public void testProduct() {
        Lab1 lab1 = new Lab1();
        assertEquals(120, Lab1.product(1, 5));
    }

}
