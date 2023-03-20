package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Problem {
    private static List<Students> students;
    private static List<Projects> projects;

    public static List<Students> getStudents() {
        return students;
    }

    public List<Projects> getProjects() {
        return projects;
    }

    public int sizeOfProjectsList() {
        return projects.size();
    }

    public static List<Integer> numberOfProjectsWithRepetition(List<Students> students) {
        return students
                .stream()
                .map(s -> s.sizeOfProjectsList())
                .toList();
    }

    public static int sumOfProjects(List<Integer> numberOfProjectsWithRepetition) {
        return numberOfProjectsWithRepetition
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static int howManyProjects(List<Projects> projects) {
        return projects.size();
    }
    public static int avgPreferences(int sumOfProjects,int howManyProjects){
       return sumOfProjects/howManyProjects;
    }
    public static List<Students> studentsLowerAveragePreferences (List<Students> students,int avgPreferences) {
        return students
                .stream()
                .filter(s -> s.sizeOfProjectsList() < avgPreferences)
                .collect(Collectors.toList());

    }
    public static void main(String[] args) {
        //Using streams for create students and projects
        List<Students> students = Stream.of(
                        new Students("s0", Arrays.asList(new Projects("p0"), new Projects("p1"), new Projects("p2"))),
                        new Students("s1", Arrays.asList(new Projects("p0"), new Projects("p1"))),
                        new Students("s2", List.of(new Projects("p0")))
                )
                .collect(Collectors.toList());

        List<Projects> projects = Stream.of("p0", "p1", "p2")
                .map(Projects::new)
                .collect(Collectors.toList());
        System.out.println("All students with projects:");
        students.forEach(System.out::println);


        int sumOfProjects=sumOfProjects(numberOfProjectsWithRepetition(students));
        int howManyProjects=howManyProjects(projects);
        int avgPreferences=avgPreferences(sumOfProjects,howManyProjects);
        List<Students> studentsLowerAveragePreferences=studentsLowerAveragePreferences(students,avgPreferences);

        System.out.println("Students with number of preferences lower than the average:");
        studentsLowerAveragePreferences.forEach(System.out::println);


    }
    }


