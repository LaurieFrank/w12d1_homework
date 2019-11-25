package staff;

public abstract class Employee {

    private String name;
    private String nationalInsuranceNumber;
    private int salary;

    public Employee(String name, String nationalInsuranceNumber, int salary){
        this.name = name;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNationalInsuranceNumber(){
        return this.nationalInsuranceNumber;
    }

    public int getSalary(){
        return this.salary;
    }

    public int raiseSalary(int newSalaryIncrease) {
        if (newSalaryIncrease >= 0)
            this.salary += newSalaryIncrease;
        return newSalaryIncrease;
    }

    public int payBonus(){
       return this.salary / 100;
    }

}
