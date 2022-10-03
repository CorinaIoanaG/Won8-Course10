import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class ClassRoom {
    private List<StudentGrade> studentList = ReadPersons.readPersons("files/grades.txt");

    public ClassRoom() throws IOException {
    }

    public List<StudentGrade> getStudentList() {
        return studentList;
    }


    public List<Integer> getGradesForDiscipline(String discipline) {
        if (studentList != null) {
            List<Integer> result = new ArrayList<>();
            if (discipline == null) {
                for (StudentGrade item : studentList) {
                    result.add(item.getGrade());
                }
            } else {
                for (StudentGrade item : studentList) {
                    if (item.getDiscipline().equals(discipline)) {
                        result.add(item.getGrade());
                    }
                }
            }
            return result;
        }
        return null;
    }

    public List<Integer> getGradesForStudent(String student) {
        if (studentList != null) {
            List<Integer> result = new ArrayList<>();
            for (StudentGrade item : studentList) {
                if (item.getName().equals(student)) {
                    result.add(item.getGrade());
                }
            }
            return result;
        }
        return null;
    }

    public StudentGrade getMaxGrade(String discipline) {
        List<Integer> result = getGradesForDiscipline(discipline);
        if (result != null) {
            Integer maxim = Collections.max(result);
            if (discipline == null) {
                return studentList.get(result.indexOf(maxim));
            } else {
                for (StudentGrade element : studentList) {
                    if (element.getDiscipline().equals(discipline) && element.getGrade() == maxim) {
                        return element;
                    }
                }
            }
        }
        return null;
    }

    public Integer getAverageGrade(String discipline) {
        Integer sum = 0;
        List<Integer> result = getGradesForDiscipline(discipline);
        for (Integer element : result) {
            sum += element;
        }
        return sum / result.size();
    }

    public StudentGrade getWorstGrade(String discipline) {
        List<Integer> result = getGradesForDiscipline(discipline);
        if (result != null) {
            Integer minim = Collections.min(result);
            if (discipline == null) {
                return studentList.get(result.indexOf(minim));
            } else {
                for (StudentGrade element : studentList) {
                    if (element.getDiscipline().equals(discipline) && element.getGrade() == minim) {
                        return element;
                    }
                }
            }
        }
        return null;
    }

}
