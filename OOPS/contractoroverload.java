class employee {
    private int salary;
    private String name;

    employee(String n) {
        name = n;
        System.out.println("Name: " + name);
    }

    employee(int s) {
        salary = s;
        System.out.println("Salary: " + salary);
    }

    employee(int s, String n) {
        salary = s;
        name = n;
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class testing {
    public static void main(String[] args) {
        employee e = new employee(2500, "Atharva");
    }
}
