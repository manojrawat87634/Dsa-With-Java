class Person {

    private String ssn;      // only this class
    String name;             // default, only package
    protected int age;        // package + subclass
    public String country;    // anywhere

    // constructor
    public Person(String ssn, String name, int age, String country) {
        this.ssn = ssn;
        this.name = name;
        this.age = age;
        this.country = country;
    }

    // method to access private field
    public void showSSN() {
        System.out.println("SSN: " + ssn);
    }
}

public class Main {
    public static void main(String[] args) {

        Person p = new Person("123-45-6789", "Manoj", 22, "India");

        // Access fields
        System.out.println(p.name);       // default → works in same package
        System.out.println(p.age);        // protected → works in same package
        System.out.println(p.country);    // public → works anywhere

        // System.out.println(p.ssn);     // ❌ private, won't work
        p.showSSN();                 
    }
}
