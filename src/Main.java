import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ClassRoom classRoom = new ClassRoom();
        StudentGrade studentGrade;
        ReportGenerator reportGenerator = new ReportGenerator();
        studentGrade = classRoom.getStudentList().get(0);
        System.out.println(String.format("First line: %s, %s, %d", studentGrade.getName(), studentGrade.getDiscipline(),
                studentGrade.getGrade()));
        System.out.println(String.format("Grades for student %s %s", "Branwen Evelina",
                classRoom.getGradesForStudent("Branwen Evelina").toString()));
        studentGrade = classRoom.getMaxGrade(null);
        System.out.println(String.format("Maximum grade: %s %s %d", studentGrade.getName(),
                studentGrade.getDiscipline(), studentGrade.getGrade()));
        System.out.println(String.format("Grades from discipline %s %s", "Mathematics",
                classRoom.getGradesForDiscipline("Mathematics").toString()));
        System.out.println(String.format("Grades for discipline %s: maximum %d, average %d, mimimum %d", "Mathematics",
                classRoom.getMaxGrade("Mathematics").getGrade(), classRoom.getAverageGrade("Mathematics"),
                classRoom.getWorstGrade("Mathematics").getGrade()));
        reportGenerator.generateReport();
    }
}
