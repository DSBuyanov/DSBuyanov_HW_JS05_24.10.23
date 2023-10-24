package ru.gb.safronov;

import java.util.Arrays;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        // Получение списка студентов и преподавателя (здесь для упрощения просто создаем объекты)
        Teacher teacher = new Teacher(1, "Professor");
        List<Student> students = Arrays.asList(new Student(1, "Alina"), new Student(2, "Denis"), new Student(3, "Roman"));

        // Формирование учебной группы
        EducationalGroup educationalGroup = EducationalGroupService.createEducationalGroup(teacher, students);

        // Вывод информации о группе (для демонстрации)
        System.out.println("Educational Group:");
        System.out.println("Teacher: " + educationalGroup.getTeacher().getName());
        System.out.println("Students:");
        for (Student student : educationalGroup.getStudents()) {
            System.out.println("- " + student.getName());
        }
    }
}
