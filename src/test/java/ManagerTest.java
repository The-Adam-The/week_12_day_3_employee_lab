import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Gladis", "JR4902001c", 30000.11, "Head of Biscuits");
    }

    @Test
    public void canGetName() {
        assertEquals("Gladis", manager.getName());
    }

    @Test
    public void canGetniNumber() {
        assertEquals("JR4902001c", manager.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000.11, manager.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1000);
        assertEquals(31000.11, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(300.0, manager.payBonus(), 0.01);
    }

    @Test
    public void canGetDepartmentName() {
        assertEquals("Head of Biscuits", manager.getDepartmentName());
    }



}
