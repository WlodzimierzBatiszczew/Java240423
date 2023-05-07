package Homework2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Students {

    private String name;
    private String surname;
    private double courseNumber;
    private double GradePointAverage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public double getCourseNumber() {
        return courseNumber;
    }
    public double getGradePointAverage() {
        return GradePointAverage;
    }



    public Students(String name, String surname, double courseNumber, double gradePointAverage) {
        this.name = name;
        this.surname = surname;
        this.courseNumber = courseNumber;
        this.GradePointAverage = gradePointAverage;
    }

    public static void main(String[] args) {
        Students student1 = new Students("Ivan", "Ivanov", 3, 4.5);
        Students student2 = new Students("Petr", "Petrov", 2, 3.9);
        Students student3 = new Students("Mark", "Markov", 4, 4.2);
        Students student4 = new Students("Zahar", "Zaharov", 5, 3.5);
        Students student5 = new Students("Sergey", "Sergeev", 1, 4.1);

        List<Students> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        for (Students s: students
             ) {
            System.out.println(s.getName()+ ", " + s.getSurname() + ", " + s.getCourseNumber() + ", " + s.GradePointAverage);

        }

        for (Iterator<Students> iterator = students.iterator(); iterator.hasNext();){
            Students tmp = iterator.next();
            System.out.println(tmp.courseNumber);
        }
        removeStudent(students);

        for (Students s: students
        ) {
            System.out.println(s.getName()+ ", " + s.getSurname() + ", " + s.getCourseNumber() + ", " + s.GradePointAverage);

        }

        System.out.println("--------------------------");
        removeStudent2(students);

        for (Students s: students
        ) {
            System.out.println(s.getName()+ ", " + s.getSurname() + ", " + s.getCourseNumber() + ", " + s.GradePointAverage);

        }




    }

    public static void removeStudent(List<Students> students){
        ;
        Iterator<Students> iterator = students.iterator();
        while (iterator.hasNext()) {
            Students currentStudents = iterator.next();
            if (currentStudents.getCourseNumber() < 3){
                iterator.remove();
            }
        }
    }

    public static void removeStudent2(List<Students> students){
        ;
        Iterator<Students> iterator = students.iterator();
        while (iterator.hasNext()) {
            Students currentStudents = iterator.next();
            if (currentStudents.getName().equals("Mark")){
                iterator.remove();
            }
        }
    }

}

