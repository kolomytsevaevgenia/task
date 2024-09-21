import java.util.ArrayList;
import java.util.List;
abstract class Group {
    protected String groupNumber; // номер группы
    protected String dayOfWeek; // день недели
    protected String type; // числитель или знаменатель
    protected List<String> subjects; // предметы

    public Group(String groupNumber, String dayOfWeek, String type) {
        this.groupNumber = groupNumber;
        this.dayOfWeek = dayOfWeek;
        this.type = type;
        this.subjects = new ArrayList<>();
    }

    public abstract void displayGroupInfo();

    public void addSubject(String subject) {
        subjects.add(subject);
    }
}

