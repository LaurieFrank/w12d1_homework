package staff.management;

public class Director extends Manager{

    private int budget;

    public Director(String deptName, int budget, String name, String nationalInsuranceNumber, int salary){
        super(deptName, name, nationalInsuranceNumber, salary);
        this.budget = budget;
    }


    public int getBudget() {
        return this.budget;
    }

    public int payBonus(){
        return super.payBonus() * 2;
    }
}
