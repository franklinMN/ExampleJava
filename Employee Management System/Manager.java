public class Manager extends Employee {

    double allowance;

    Manager(String name, String designation, int exp, double bs, double allowance) {
        super(name, designation, exp, bs);
        this.allowance = allowance;
    }

    public double getSalary(  ) {
        return super.getSalary()+allowance;
    }
    
}
