import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;


    @Before
    public void setUp() {
        manager = new Manager("John", "Pa433433", 30000.00, "IT");
    }


    @Test
    public void hasNiNumber(){
        assertEquals("Pa433433", manager.getNiNumber());
    }

    @Test
    public void hasName(){
        assertEquals("John", manager.getName());
    }

    @Test
    public void canSetName() {
        manager.setName("Donald");
        assertEquals("Donald", manager.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void hasDeptName(){
        assertEquals("IT", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000.00);
        assertEquals(31000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalaryOnlyIfPositiveAmount(){
        manager.raiseSalary(-1000);
        assertEquals(30000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void viewBonus(){
        manager.payBonus();
        assertEquals(30300.00, manager.getSalary(), 0.0);
    }

















}
