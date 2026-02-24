public class Student {

    private String name;
    private int marks;
    private String city;

    public Student(String name, int marks, String city) {
        this.name = name;
        this.marks = marks;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return name + " - " + marks + " - " + city;
    }
}
