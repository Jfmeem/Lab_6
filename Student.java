import java.util.Objects;
public class Student {
    private int studentID ;
    private String studentName;
    private String major;
    public Student(int studentID, String studentName, String major){
        this.studentID = studentID;
        this.studentName = studentName;
        this.major = major;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj)return true;
        if(obj==null||this.getClass()!=obj.getClass())return false;
        Student otherstudent=(Student) obj;
        return this.studentID==otherstudent.getStudentID();
    }
    @Override
    public int hashCode(){
        return Objects.hash(studentID);
    }

}
