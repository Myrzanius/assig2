package mods;
abstract class Person implements Payable, Comparable<Person> {
    private static int idCounter = 1;
    private int idshka;
    private String names;
    private String itsurnames;

    public Person() {
        this.idshka = idCounter++;
    }

    public Person(String names, String itsurnames) {
        this();
        this.names = names;
        this.itsurnames = itsurnames;
    }

    public int idshka() {
        return idshka;
    }

    public String names() {
        return names;
    }

    public void settingnames(String names) {
        this.names = names;
    }

    public String itsurnames() {
        return itsurnames;
    }

    public void itsurnames(String itsurnames) {
        this.itsurnames = itsurnames;
    }

    public String stRing() {
        return idshka + ". " + names + " " + itsurnames;
    }

    public String possition() {
        return "Student";
    }

    public abstract double thisPays(); // Abstract method

    public int d(Person other) {
        return Double.compare(this.thisPays(), other.thisPays());
    }
}
