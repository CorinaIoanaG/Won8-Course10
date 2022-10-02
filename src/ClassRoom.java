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
            for (StudentGrade item : studentList) {
                if (item.getDiscipline().equals(discipline)) {
                    result.add(item.getGrade());
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
            int index = studentList.indexOf(maxim);
            if (index == studentList.indexOf(discipline) && index >= 0) {
                return studentList.get(index);
            } else {
                for (StudentGrade element : studentList) {
                    if (element.getGrade() == maxim && element.getDiscipline() == discipline) {
                        return element;
                    }
                }
            }
        }
        return null;
    }

    public StudentGrade getMaxGrade() {
        if (studentList != null) {
            List<Integer> result = new ArrayList<>();
            for (StudentGrade item: studentList){
                result.add(item.getGrade());
            }
            Integer maxim = Collections.max(result);
            int index = result.indexOf(maxim);
            return studentList.get(index);
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
        if (studentList != null) {
            Integer minim = Integer.MAX_VALUE;
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getGrade() != null) {
                    if (studentList.get(i).getGrade() < minim) {
                        minim = studentList.get(i).getGrade();
                    }
                }
            }
            return studentList.get(studentList.indexOf(minim));
        } else {
            return null;
        }
    }

}
