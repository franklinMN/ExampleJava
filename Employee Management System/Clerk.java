public class Clerk extends Employee{
    
    int overtimeHours;

    Clerk(String name, String designation, int exp, double bs, int otHours) {
        super(name, designation, exp, bs);
        this.overtimeHours = otHours;
    }

}
