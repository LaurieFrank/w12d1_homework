import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("HR", "Gordon", "JR123456C", 30000);
    }

    @Test
    public void getDept(){
        assertEquals("HR", manager.getDept());
    }

    @Test
    public void raiseSalary(){
        manager.raiseSalary(2000);
        assertEquals(32000, manager.getSalary());
    }

    @Test
    public void calculatePayBonus(){
        assertEquals(300, manager.payBonus());
    }
}
