import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;


public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Senior Management",
                300000,
                "Sally",
                "JR654321C",
                40000);
    }

    @Test
    public void getBudget(){
        assertEquals(300000, director.getBudget());
    }

    @Test
    public void calculatePayBonus(){
        assertEquals(800, director.payBonus());
    }
}
