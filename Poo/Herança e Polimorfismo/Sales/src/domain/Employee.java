package domain;

public sealed abstract class Employee permits Manager, Salesman{

    protected String code;

    protected String name;

    protected String address;

    protected int age;

    protected double salary;

    public Employee() {
    }

    public Employee(String code, String name, String address, int age, double salary) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double getFullSalary(double extra){
        return this.getFullSalary() + extra;
    }

    public abstract double getFullSalary();

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
