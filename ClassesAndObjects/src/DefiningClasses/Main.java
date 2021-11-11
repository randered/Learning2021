package DefiningClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Student> studentsList = new ArrayList<>();
        String input = scan.nextLine();

        // If Student Exists - > Only updating his age and homeTown
        // or Creating new student.
        while (!input.equals("end")) {
            List<String> split = Stream.of(input.split(" "))
                    .map(String::new).collect(Collectors.toList());
            String firstName = split.get(0);
            String lastName = split.get(1);
            int age = Integer.parseInt(split.get(2));
            String homeTown = split.get(3);
            //Check if Student exists by names
            Student existingStudent = getStudent(studentsList, firstName, lastName);

            if (existingStudent != null) {
                existingStudent.setAge(age);
                existingStudent.setHomeTown(homeTown);
                // Creating new Student
            } else {
                Student newStudent = new Student(firstName, lastName, age, homeTown);
                studentsList.add(newStudent);
            }
            input = scan.nextLine();
        }
        //Asking for hometown and printing all students from it.
        System.out.println("Enter a hometown:");
        input = scan.nextLine();
        for (Student student : studentsList) {
            if (student.getHomeTown().equals(input)) {
                System.out.printf("%s %s is %d years old\n\r",
                        student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
        scan.close();
    }

    private static Student getStudent(List<Student> list, String firstName, String lastName) {
        for (Student student : list) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return student;
            }
        }
        return null;
    }
}
