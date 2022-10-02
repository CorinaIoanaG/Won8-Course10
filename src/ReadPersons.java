import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ReadPersons {

    public static List<StudentGrade> readPersons(String s) throws IOException {
        List<StudentGrade> result = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(s));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            result.add(personFromLine(line));
        }
        return result;
    }

    public static StudentGrade personFromLine(String line) {
        String[] split = line.split(Pattern.quote("|"));
        return new StudentGrade(split[0], split[1], Integer.parseInt(split[2].replaceAll("\\^d", "")));
    }

}
