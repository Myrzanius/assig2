package mods;

import mods.Person;

class Student extends Person {
    private double gpa;
    private static final double STIPEND = 36660.00;

    public Student() {
        super();
    }

    public Student(String names, String itsurnames, double gpa) {
        super(names, itsurnames);
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    public String stRing() {
        return "Student: " + super.stRing();
    }

    public double gpa() {
        return gpa;
    }

    public void gpa(double gpa) {
        this.gpa = gpa;
    }

    public double thisPays() {
        return gpa > 2.67 ? STIPEND : 0.00;
    }
}
