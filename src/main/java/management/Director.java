package management;

public class Director extends Manager{

    private double budget;

    public Director(String name, String niNumber, double salary, String deptName, double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus(){
        double bonus = this.salary / 100;
        double twoPercent = bonus * 2;

        return this.salary += twoPercent;
    }
}
