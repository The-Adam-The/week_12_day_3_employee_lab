import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {


    Director director;

    @Before
    public void before() {
        director = new Director("Alexander", "BD792873401e", 130000.50, "Management", 13_000_000.00f);
    }

    @Test
    public void canGetName() {
        assertEquals("Alexander", director.getName());
    }

    @Test
    public void canGetniNumber() {
        assertEquals("BD792873401e", director.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(130000.50, director.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(20000);
        assertEquals(150000.50, director.getSalary(), 0.01);
    }


    @Test
    public void canPayBonus() {
        assertEquals(2600.01, director.payBonus(), 0.01);
    }

    @Test
    public void canGetDepartmentName() {
        assertEquals("Management", director.getDepartmentName());
    }

    @Test
    public void canGetBudget(){
        assertEquals(13_000_000.00f, director.getBudget(), 0.01);
    }
}
