import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;


    @Before
    public void setUp() {
        developer = new Developer("Ian", "Pa4336733", 40000.00);
    }


    @Test
    public void hasNiNumber(){
        assertEquals("Pa4336733", developer.getNiNumber());
    }

    @Test
    public void hasName(){
        assertEquals("Ian", developer.getName());
    }

    @Test
    public void canSetName() {
        developer.setName("Jack");
        assertEquals("Jack", developer.getName());
    }



    @Test
    public void hasSalary(){
        assertEquals(40000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(2000.00);
        assertEquals(42000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalaryOnlyIfPositiveAmount(){
        developer.raiseSalary(-1000);
        assertEquals(40000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void viewBonus(){
        developer.payBonus();
        assertEquals(40400.00, developer.getSalary(), 0.0);
    }


}
