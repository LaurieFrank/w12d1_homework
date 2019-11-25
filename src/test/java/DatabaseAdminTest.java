import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;


public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Tony", "TY212121", 18000);
    }

    @Test
    public void getName(){
        assertEquals("Tony", databaseAdmin.getName());
    }

    @Test
    public void getNI(){
        assertEquals("TY212121", databaseAdmin.getNationalInsuranceNumber());
    }

    @Test
    public void getSalary(){
        assertEquals(18000, databaseAdmin.getSalary());
    }
}
