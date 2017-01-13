import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private int grade;

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

@SuppressWarnings("ALL")
public class SortingStudents {
    static List<Student> makeStudentList() {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Jonathan", 40));
        students.add(new Student( "Mary", 15));
        students.add(new Student("Aaron", 80));

        return students;
    }

    public static void main(String[] args) {
        List<Student> students = makeStudentList();
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });
    }
}

