import java.util.ArrayList;

public class EmployeeManagementSystem {

    ArrayList<Employee> al = new ArrayList<>();
    double totalAmount = 0.0;

    //This method should add an employee to the system.
    public void addEmployee(Employee employee) {
        //employee = new Employee(null, null, 0, 0);
        al.add(employee);
    }

    //This method should remove an employee from the system.
    public void removeEmployee(Employee employee) {
       // for (  int i=0 ; i < al.size() ; i++ ) {
            al.remove( al.indexOf(employee) );
        //}
    }

    //This method should display the details of all employees in the system.
    public void displayAllEmployees() {
        for ( int i=0 ; i < al.size() ; i++ ) {
            System.out.println(al.get(i).name + "\t" 
                                + al.get(i).designation + "\t"
                                + al.get(i).yearsOfExperience + "\t"
                                + al.get(i).basicSalary + "\t");
        }
    }

    //This method should calculate the salary of an employee based on their designation and years of experience.
    public void calculateSalary(Employee employee) {
        //display salary on the screen...
        //double finalSalary;
            if ( employee.yearsOfExperience == 0 )
                employee.finalSalary = employee.getSalary();
            else
                employee.finalSalary = employee.getSalary() + ((double)1000) * (double)employee.yearsOfExperience;

            System.out.println( employee.name + " Salary : " + employee.finalSalary );
    }

    //This method should calculate the total salary paid to all employees in the system.
    public void calculateTotalSalary() {
        
        for (int j=0;j<al.size();j++) {
            totalAmount = totalAmount + this.al.get(j).finalSalary;
        }
        System.out.println( "Total Amount given to all employees: " + totalAmount );
    }

    public static void main ( String [] args ) {
        Employee m1 = new Manager("Franklin", "Manager", 3, 100000, 50000);
        Employee c1 = new Clerk("Marian", "Clerk", 1, 25000, 2);

        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        ems.calculateSalary(m1);
        ems.calculateSalary(c1);
        ems.addEmployee(m1);
        ems.addEmployee(c1);
        ems.calculateTotalSalary(); 
        ems.removeEmployee(c1);
        ems.displayAllEmployees();
    }
}
