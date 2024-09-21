abstract class Course {
    protected String firstName;
    protected String lastName;
    protected int courseNumber;

    public Course(String firstName, String lastName, int courseNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseNumber = courseNumber;
    }

    public abstract void displayInfo();
}
