import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;


    @Before
    public void setUp() {
        databaseAdmin = new DatabaseAdmin("Ian", "Pa4336733", 40000.00);
    }


    @Test
    public void hasNiNumber(){
        assertEquals("Pa4336733", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasName(){
        assertEquals("Ian", databaseAdmin.getName());
    }

    @Test
    public void canSetName() {
        databaseAdmin.setName("Richard");
        assertEquals("Richard", databaseAdmin.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(40000.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(2000.00);
        assertEquals(42000.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalaryOnlyIfPositiveAmount(){
        databaseAdmin.raiseSalary(-1000);
        assertEquals(40000.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void viewBonus(){
        databaseAdmin.payBonus();
        assertEquals(40400.00, databaseAdmin.getSalary(), 0.0);
    }

}
