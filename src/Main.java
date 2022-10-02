import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ClassRoom classRoom = new ClassRoom();
        StudentGrade studentGrade;
        System.out.println(String.format("First line: %s, %s, %d", classRoom.getStudentList().get(0).getName(),
                classRoom.getStudentList().get(0).getDiscipline(), classRoom.getStudentList().get(0).getGrade()));
        System.out.println(String.format("Grades from discipline %s %s", "Computer Science",
                classRoom.getGradesForDiscipline("Computer Science").toString()));
        System.out.println(String.format("Grades for student %s %s", "Branwen Evelina",
                classRoom.getGradesForStudent("Branwen Evelina").toString()));
        studentGrade = classRoom.getMaxGrade();
        System.out.println(String.format("Maximum grade: %s %s %d", studentGrade.getName(),
                studentGrade.getDiscipline(), studentGrade.getGrade()));
        System.out.println(String.format("Grades for discipline %s: maximum %d, average %d", "Mathematics",
                classRoom.getMaxGrade("Mathematics"), classRoom.getAverageGrade("Mathematics")));
    }
}
