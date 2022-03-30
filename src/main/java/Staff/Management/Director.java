package Staff.Management;

public class Director extends Manager{

    private Float budget;

    public Director(String name, String niNumber, Double salary, String departmentName, Float budget) {
        super(name, niNumber, salary, departmentName);
        this.budget = budget;
    }

    public Float getBudget() {
        return this.budget;
    }
}
