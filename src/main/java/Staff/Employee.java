package Staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    protected Double salary;

    public Employee(String name, String niNumber, Double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name != null){
        this.name = name;}
    }

    public String getNiNumber() {
        return this.niNumber;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double increase) {
        if(increase > 0)
        this.salary += increase;
    }

    public double payBonus() {
        return this.salary * 0.01;
    }
}
