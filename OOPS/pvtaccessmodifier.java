class employee {
    private int salary;
    private String name;    

    public int getsalary() {
        return salary;
    }

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;
    }
}

public class testing {
    public static void main(String[] args) {
        employee e = new employee();
        e.setname("Atharva");
        System.out.println(e.getname());
    }
}
