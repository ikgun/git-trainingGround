package chapter12;

import java.util.Map;

public class Grades {

    public static void main(String[] args) {

        //Fetch the maps to store the grades
        Map<String, Integer> finalGrades = TestResults.getOriginalGrades();
        Map<String, Integer> makeupGrades = TestResults.getMakeUpGrades();

        //Reach the students inside one of the maps

        for (var entry : finalGrades.entrySet()) {

            //Store the student
            String student = entry.getKey();

            //Store first grade of the student to compare to the second one
            Integer firstGrade = finalGrades.get(student);

            //Store second grade of the student
            Integer secondGrade = makeupGrades.get(student);

            //If the second grade is larger than the first, update the final grades,
            // else nothing needs to be done.

            if (secondGrade > firstGrade) {
                finalGrades.put(student, secondGrade);
            }

            //print the updated map
            System.out.println("Student: " + student + " | Grade: " + finalGrades.get(student));

        }
    }
}
