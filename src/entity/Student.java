package entity;

public class Student {

    private String id;
    private String studentName;
    private String semester;
    private String courseName;

    /**
     * Default constructor for the Student class.
     */
    public Student() {
    }

    /**
     * Constructs a new Student with the specified details.
     *
     * @param id The ID of the student.
     * @param studentName The name of the student.
     * @param semester The semester the student is enrolled in.
     * @param courseName The name of the course the student is taking.
     */
    public Student(String id, String studentName, String semester, String courseName) {
        this.id = id;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    /**
     * ban đầu courseName nó chưa đc khai báo, khi mình nhập 1 courseName tên
     * java, mình gọi st.setCourseName(java);, như vậy this.courseName sẽ trỏ
     * đến variable ban đầu của mình và set nó course tên là java
     *
     * @param courseName
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Displays the student's information in a formatted way.
     */
    public void display() {
        System.out.format("|%-15s|%-15s|%-15s|\n", 
                studentName,
                semester,
                courseName);

    }

}
