import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Bill", "HY43452001g", 28000.50);
    }

    @Test
    public void canGetName() {
        assertEquals("Bill", developer.getName());
    }

    @Test
    public void canGetniNumber() {
        assertEquals("HY43452001g", developer.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(28000.50, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(2000);
        assertEquals(30000.50, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(280.0, developer.payBonus(), 0.01);
    }
}
