import java.util.*;

public class StudentManagementSystem {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();

        students.add(new Student(1001, "nyx", "CS201"));
        students.add(new Student(1002, "astra", "Math101"));
        students.add(new Student(1003, "nabi", "CS100"));
        students.add(new Student(1004, "nafi", "Bio111"));
        students.add(new Student(1005, "meem", "Math201"));

        System.out.println("Original List:");
        for(Student stu : students){
            System.out.println(stu.toString());
        }

        Student newStudent = new Student(1009, "Dva", "stat1001");
        students.add(3, newStudent);

        System.out.println("\n*****************");
        System.out.println("After adding a new student:");
        for(Student stud : students){
            System.out.println(stud.toString());
        }

        Student removedByIdx = students.remove(2);
        System.out.println("\n*****************");
        System.out.println("After removing a new student:");
        for(Student stude : students){
            System.out.println(stude.toString());
        }

        System.out.println("\n*****************");
        Set<Student> courseEnroll = new HashSet<>();
        courseEnroll.addAll(students);
        System.out.println("Initial enrollement: " + courseEnroll);

        System.out.println("\n*****************");
        System.out.println("\nattempting to add nyx again...");
        Student nyxDuplicate = new Student(1001, "nyx arah", "cs2001");
        boolean added = courseEnroll.add(nyxDuplicate);
        System.out.println("Was nyxDuplicate added? " + added);
        System.out.println("Current enrollment: " + courseEnroll);

        System.out.println("\n*****************");
        System.out.println("\nchecking enrollment status: ");
        System.out.println("Is nafi enrolled? " + courseEnroll.contains(new Student(1004, "", "")));
        System.out.println("Is meena enrolled? " + courseEnroll.contains(new Student(2009, "meena", "soci300")));

        System.out.println("\n*****************");
        System.out.println("Hashset iteration order:");
        for(Student studen : courseEnroll){
            System.out.println(studen);
        }


        Map<Integer, Student> Q_lookup = new HashMap<>();
        for(Student student : students){
            Q_lookup.put(student.getStudentID(), student);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student lookup system.");
        System.out.println("Available student id: 1001, 1002, 1009, 1004, 1005 ");
        System.out.print("enter student id to to search : ");
        int searchID = scanner.nextInt();
        Student foundStudent = Q_lookup.get(searchID);

        if(foundStudent != null){
            System.out.println("\n student found.");
            System.out.println(foundStudent);
        }
        else{
            System.out.println("\nno student found " + searchID);
        }

        System.out.println("\n quick lookup demonstration: ");
        int demoID = 1005;
        System.out.println("Looking up student ID "+ demoID+ ":");
        System.out.println(Q_lookup.get(demoID));

        scanner.close();
    }
}
