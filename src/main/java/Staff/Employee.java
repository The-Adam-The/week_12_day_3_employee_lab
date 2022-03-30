package Staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private Double salary;

    public Employee(String name, String niNumber, Double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNiNumber() {
        return this.niNumber;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double increase) {
        this.salary += increase;
    }

    public double payBonus() {
        return this.salary * 0.01;
    }
}
