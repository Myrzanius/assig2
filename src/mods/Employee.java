package mods;

class Employee extends Person {
    private String possition;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(String names, String itsurnames, String possition, double salary) {
        super(names, itsurnames);
        this.possition = possition;
        this.salary = salary;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    public String stRing() {
        return "Employee: " + super.stRing();
    }

    public String possition() {
        return possition;
    }

    public double salary() {
        return salary;
    }

    public void salary(double salary) {
        this.salary = salary;
    }

    public double thisPays() {
        return salary;
    }
}
