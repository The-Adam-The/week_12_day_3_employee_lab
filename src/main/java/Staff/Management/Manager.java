package Staff.Management;

import Staff.Employee;

public class Manager extends Employee {

    private String departmentName;

    public Manager(String name, String niNumber, Double salary, String departmentName) {
        super(name, niNumber, salary);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

}
