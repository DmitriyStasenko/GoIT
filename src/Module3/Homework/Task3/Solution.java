package Module3.Homework.Task3;

import java.util.Date;

/**
 * Created by Дима on 20.11.2016.
 */
public class Solution {

    public static void main(String[] args) {


        Course course = new Course(5, "Teacher");
        Course course1 = new Course(6, "Teacher1");
        Course course2 = new Course(7, "Teacher2");
        Course course3 = new Course(8, "Teacher3");
        Date date = new Date(20);
        Course course4 = new Course(date, "name");

        Student student = new Student("firstName", "lastName", 5 );
        Course[] cor = {course,course1};
        Student student1 = new Student(cor, 10);

        CollegeStudent collegeStudent = new CollegeStudent("firstName", "lastName", 23);
        CollegeStudent collegeStudent1 = new CollegeStudent(cor, 5);
        CollegeStudent collegeStudent2 = new CollegeStudent(cor, 63, "collegeName", 26, 56);

        SpecialStudent specialStudent = new SpecialStudent("firstName", "lastName", 23);
        SpecialStudent specialStudent1 = new SpecialStudent(cor, 46);
        SpecialStudent specialStudent2 = new SpecialStudent(cor, 10,"collegeName", 12, 23, 46);















    }







}
