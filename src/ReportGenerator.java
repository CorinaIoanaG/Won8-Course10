import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReportGenerator {
    public ReportGenerator() throws IOException {
    }

    public void generateReport() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("files/grade-reports.out"));
        ClassRoom classRoom = new ClassRoom();
        StudentGrade studentGrade;
        studentGrade = classRoom.getMaxGrade(null);
        writer.write(String.format("Cea mai mare nota: %s %d", studentGrade.getName(), studentGrade.getGrade()));
        writer.newLine();
        writer.write(String.format("Nota medie: %d", classRoom.getAverageGrade(null)));
        writer.newLine();
        studentGrade = classRoom.getWorstGrade(null);
        writer.write(String.format("Cea mai mica nota: %s %d", studentGrade.getName(), studentGrade.getGrade()));
        writer.close();
    }

}
