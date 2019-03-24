package com.java.collection;


import java.util.*;
import java.util.function.Function;
import static java.util.stream.Collectors.*;

public class HashMapExercise {

    public static void main(String[] args) {

       /* Map<String, Integer> map = new HashMap<>();
        map.put("Key1", 12);
        map.put("Key2", 15);
        map.compute("Key3",(x,y) -> y+1);

        Integer value = map.get("Key1");
        value++;

        map.forEach((x,y) -> {
            System.out.println("key "+ x + " value "+ y);
        });*/

        List<Student> students = Arrays.asList(new Student("prakash", 28, "CS", 9.2f),
                new Student("Anil", 28, "CS", 8.2f),
                new Student("Anil", 28, "CS", 8.2f),
                new Student("Nikhil", 29, "ME", 8.2f),
                new Student("Deelip", 27, "CS", 8.2f),
                new Student("Deepak", 28, "ME", 8.2f),
                new Student("Pinky", 27, "EC", 8.2f),
                new Student("Lucky", 28, "CS", 8.2f),
                new Student("Vicky", 29, "ME", 8.2f));

        Map<String,List<Student>> studentByDepartment =new HashMap<>();


        //Set<Student> setOfStudent = new HashSet<>(students);

        Set<Student> setOfStudent = new LinkedHashSet<>(students);
        //setOfStudent.forEach(System.out::println);
        //traditional way of creating HashMap
        /*students.forEach(student ->{

            if(studentByDepartment.containsKey(student.getDepartment())){
                studentByDepartment.get(student.getDepartment()).add(student);

            }else{
                List<Student> temp = new ArrayList<>();
                temp.add(student);
                studentByDepartment.put(student.getDepartment(),temp);
            }
        });*/

        //Collections.sort(students);

        Map<String,List<Student>> sortedKeysMap =new TreeMap<>();
        sortedKeysMap = students.stream().collect(groupingBy(Student::getDepartment,TreeMap::new,mapping(e -> e,toList())));

        sortedKeysMap.forEach((x,y) -> {
            System.out.println("key "+ x + " value "+ y);
        });

       /* studentByDepartment = students.stream().collect(groupingBy(Student::getDepartment));

        Map<String,List<String>> studentNamesByDepartment =  students.stream().collect(groupingBy(Student::getDepartment,mapping(Student::getName,toList())));

        Map<String,Set<String>> studentUniqueNamesByDepartment =  students.stream().collect(groupingBy(Student::getDepartment,mapping(Student::getName,toSet())));

        Map<String,Long> countOfStudentsByDepartment =  students.stream().collect(groupingBy(Student::getDepartment,counting()));


        studentNamesByDepartment.forEach((x,y) -> {
            System.out.println("key "+ x + " value "+ y);
        });



        studentByDepartment.forEach((x,y) -> {
            System.out.println("key "+ x + " value "+ y);
        });*/



/*

        Map<String, List<Student>> studentsByDepartHashMap = students.stream().collect(Collectors.groupingBy(Student::getDepartment));
        Map<String, List<String>> studentsByDepartTreeMap = students.stream().collect(Collectors.groupingBy(Student::getDepartment,TreeMap::new,Collectors.mapping(Student::getName,Collectors.toList())));

        Map<String, Long> studentsCountByDepart = students.stream().collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()));

        studentsCountByDepart.forEach((x,y) -> {
            System.out.println("key "+ x + " value "+ y);
        });
        Map<Student, Long> duplicateStudentCOunt = students.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
*/

    }
}
