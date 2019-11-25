import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Letitia", "TY322332", 20000);
    }

        @Test
    public void getName(){
        assertEquals("Letitia", developer.getName());
    }

    @Test
    public void getNI(){
        assertEquals("TY322332", developer.getNationalInsuranceNumber());
    }

    @Test
    public void getSalary(){
        assertEquals(20000, developer.getSalary());
    }
}
