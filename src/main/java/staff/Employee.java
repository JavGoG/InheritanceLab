package staff;

public abstract class Employee {

    protected String name;

    protected String niNumber;

    protected double salary;


    public Employee(String name, String niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise){
        if(raise >= 0){
            this.salary += raise;
        }else{
            System.out.println("Cannot raise salary");
        }

    }

    public double payBonus(){
        double bonus = this.salary / 100;
        return this.salary += bonus;
    }
}
