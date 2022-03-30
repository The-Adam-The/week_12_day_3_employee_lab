import Staff.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Lawrence", "DB46784002q", 29000.50);
    }

    @Test
    public void canGetName() {
        assertEquals("Lawrence", databaseAdmin.getName());
    }

    @Test
    public void canSetName(){
        databaseAdmin.setName("Gavin");
        assertEquals("Gavin", databaseAdmin.getName());
    }

    @Test
    public void cannotSetName(){
        databaseAdmin.setName(null);
        assertEquals("Lawrence", databaseAdmin.getName());
    }

    @Test
    public void canGetniNumber() {
        assertEquals("DB46784002q", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(29000.50, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(4000);
        assertEquals(33000.50, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void cannotRaiseSalary(){
        databaseAdmin.raiseSalary(-1000);
        assertEquals(29000.50, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(290.0, databaseAdmin.payBonus(), 0.01);
    }
}
