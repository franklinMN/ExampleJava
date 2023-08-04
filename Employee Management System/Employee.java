public class Employee {
    String name;
    String designation;
    int yearsOfExperience;
    double basicSalary;
    double finalSalary;

    Employee( String name, String designation, int exp, double bs ) {
        this.name = name;
        this.designation = designation;
        this.yearsOfExperience = exp;
        this.basicSalary = bs;
        this.finalSalary = 0.0;
    }

    public double getSalary(  ) {
        return basicSalary;
    }
}