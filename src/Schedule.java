public class Schedule {
    private Course course;
    private Group group;

    public Schedule(Course course, Group group) {
        this.course = course;
        this.group = group;
    }

    public void displaySchedule() {
        System.out.println("Расписание занятий:");
        course.displayInfo();
        group.displayGroupInfo();
    }
}

