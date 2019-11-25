package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String deptName, String name, String nationalInsuranceNumber, int salary){
        super(name, nationalInsuranceNumber, salary);
        this.deptName = deptName;
    }

    public String getDept() {
        return this.deptName;
    }
}
