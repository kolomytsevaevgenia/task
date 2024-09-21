import java.util.Scanner;

// Основной класс для работы с расписанием
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных о студенте
        System.out.print("Введите имя студента: ");
        String firstName = scanner.nextLine();
        System.out.print("Введите фамилию студента: ");
        String lastName = scanner.nextLine();
        System.out.print("Введите номер курса: ");
        int courseNumber = scanner.nextInt();
        scanner.nextLine();

        StudentCourse studentCourse = new StudentCourse(firstName, lastName, courseNumber);

        // Ввод данных о группе
        System.out.print("Введите номер группы: ");
        String groupNumber = scanner.nextLine();
        System.out.print("Введите день недели: ");
        String dayOfWeek = scanner.nextLine();
        System.out.print("Введите тип (числитель/знаменталь): ");
        String type = scanner.nextLine();

        StudyGroup studyGroup = new StudyGroup(groupNumber, dayOfWeek, type);

        // Ввод предметов
        System.out.print("Введите количество предметов: ");
        int subjectCount = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < subjectCount; i++) {
            System.out.print("Введите название предмета: ");
            String subject = scanner.nextLine();
            studyGroup.addSubject(subject);
        }

        // Создание расписания и вывод его на экран
        Schedule schedule = new Schedule(studentCourse, studyGroup);
        schedule.displaySchedule();

        scanner.close();
    }
}
