package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Using streams for create students and projects
        List<Students> students = Stream.of(
                        new Students("s0", Arrays.asList(new Projects("p0"), new Projects("p1"), new Projects("p2"))),
                        new Students("s1", Arrays.asList(new Projects("p0"), new Projects("p1"))),
                        new Students("s2", List.of(new Projects("p0")))
                )
                .collect(Collectors.toList());

        System.out.println("All students with projects:");
        students.forEach(System.out::println);

        //List of projects
        List<Projects> projects = Stream.of("p0", "p1", "p2")
                .map(Projects::new)
                .collect(Collectors.toList());
//       for (Students s : students) {
//sort students by name
//
//}
//        LinkedList<String> studentsList = new LinkedList<String>();
//        studentsList.add("s0");
//        studentsList.add("s1");
//        studentsList.add("s2");

//
//        Set TreeSet = new TreeSet<>();
//        TreeSet.add("p0");
//        TreeSet.add("p1");
//        TreeSet.add("p2");

        List<Integer> numberOfProjectsWithRepetition = students
                .stream()
                .map(s -> s.sizeOfProjectsList())
                .toList();

        int sumOfProjects=numberOfProjectsWithRepetition
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
        int howManyProjects=projects.size();


        //Students with number of preferences lower than the average number of preferences.
        int avgPreferences=sumOfProjects/howManyProjects;
        System.out.println("Students with number of preferences lower than the average:");
        List<Students> studentsLowerAveragePreferences = students
                .stream()
                .filter(s -> s.sizeOfProjectsList() < avgPreferences)
                .collect(Collectors.toList());
        studentsLowerAveragePreferences.forEach(System.out::println);

    }
}