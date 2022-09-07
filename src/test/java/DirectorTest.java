import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() {
        director = new Director("John", "Pa433433", 50000.00, "IT", 10000);
    }

    @Test
    public void canGetBudget() {
        assertEquals(10000, director.getBudget(), 0.0);
    }

    @Test
    public void canPayBonus() {
        director.payBonus();
        assertEquals(51000, director.getSalary(), 0.0);
    }



}
