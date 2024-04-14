public class Company {
    public static void main(String[] args) {
       
        Employee[] employees = new Employee[5];

        
        employees[0] = new Employee("Maciek Tromba", 2400);
        employees[1] = new Employee("Janek Tomaszewski", 2500);
        employees[2] = new Employee("Joanna Pasterz", 5500);
        employees[3] = new Employee("Wojciech Masełko", 4200);
        employees[4] = new Employee("Janusz Karny", 3300);

        System.out.println(employees[3]);
        
        employees[3].setSalary(6000);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}