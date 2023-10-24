package ru.gb.safronov;

import java.util.List;

public class EducationalGroupService {
    public static EducationalGroup createEducationalGroup(Teacher teacher, List<Student> students) {
        return new EducationalGroup(teacher, students);
    }
}
