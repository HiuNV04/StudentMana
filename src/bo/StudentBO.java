/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Student;
import util.Validate;
import java.util.*;
import constant.IConstant;

/**
 * This class manages a list of students, providing functionality to add,
 * update, delete, and report on students in the list.
 */
public class StudentBO {

    private ArrayList<Student> listStudent;

    /*
 private means this variable can only be accessed directly within the StudentBO class.
final means that this variable can only be assigned once. 
Once assigned, the reference cannot be changed, but the contents of the object it points to (an ArrayList<Student> in this case) can be modified.
     */
//Khởi tạo biến list trong constructor của StudentBO nhằm mục đích cung cấp một danh sách các đối tượng Student từ bên ngoài khi tạo một đối tượng StudentBO.
//Đây là cách để inject dữ liệu vào đối tượng StudentBO khi nó được khởi tạo. 
    /**
     * Initializes a new instance of the ManageStudent class with some
     * predefined list of students.
     */
    public StudentBO() {
        listStudent = new ArrayList<>();
//        public StudentBO() {
//        listStudent = new ArrayList<>();
//    }
//        
        /**
         * This constructor initializes listStudent to a new, empty
         * ArrayList<Student>. When an instance of StudentBO is created using
         * this constructor, it will start with an empty list of students.
         */

        /*
        Khởi tạo listStudent trong constructor của StudentBO là cần thiết để đảm bảo rằng biến này được gán một giá trị ban đầu hợp lệ và sẵn sàng sử dụng.
        Nếu không khởi tạo listStudent, nó sẽ có giá trị mặc định là null,
        và việc truy cập hoặc thao tác với danh sách này sẽ dẫn đến lỗi NullPointerException.
        Dưới đây là các lý do cụ thể cho việc khởi tạo listStudent trong constructor:
        
        1. Tránh NullPointerException
        Nếu không khởi tạo listStudent, mọi thao tác với danh sách này sẽ gây ra lỗi:
        
        public StudentBO() {
        // listStudent không được khởi tạo
        }
        StudentBO studentBO = new StudentBO();
        studentBO.listStudent().add(new Student("John Doe", 123)); // Lỗi NullPointerException

        2. Đảm bảo rằng đối tượng có trạng thái hợp lệ
        Constructor đảm bảo rằng đối tượng StudentBO luôn ở trạng thái hợp lệ ngay sau khi được khởi tạo:
        public StudentBO() {
        listStudent = new ArrayList<>();
        }
        
        StudentBO studentBO = new StudentBO();
        studentBO.listStudent().add(new Student("John Doe", 123)); // Hoạt động bình thường

        3. Tạo điều kiện dễ dàng để quản lý danh sách sinh viên
        Khởi tạo listStudent trong constructor giúp bạn dễ dàng quản lý và thao tác với danh sách sinh viên ngay lập tức:
        Việc khởi tạo listStudent trong constructor đảm bảo rằng biến này không bao giờ là null và luôn ở trạng thái sẵn sàng để sử dụng. Điều này giúp tránh các lỗi tiềm tàng, đảm bảo tính nhất quán của đối tượng và làm cho mã dễ bảo trì hơn.
         */
        listStudent.add(new Student("he182260", "huynv", "summer24", "java"));
        listStudent.add(new Student("he182260", "huynv", "fall23", "java"));
        listStudent.add(new Student("he182260", "huynv", "spring24", "java"));
        listStudent.add(new Student("he182261", "bonnv64", "summer24", ".net"));
        listStudent.add(new Student("he182261", "bonnv64", "summer24", "c/c++"));
        listStudent.add(new Student("he182261", "bonnv64", "summer24", "c/c++"));
        listStudent.add(new Student("he182262", "binhnt69", "summer24", "java"));
        listStudent.add(new Student("he182262", "linhnh94", "summer24", "c/c++"));
        listStudent.add(new Student("he182262", "linhnh94", "summer24", ".net"));
        listStudent.add(new Student("he182263", "linhnh94", "summer24", "java"));
        listStudent.add(new Student("he182263", "linhnh94", "summer24", "c/c++"));
    }

    public void setList(ArrayList<Student> list) {
        this.listStudent = list;
    }

    /**
     *
     * public StudentBO(ArrayList<Student> list) { this.listStudent = list; }
     * Key Differences: 1. Initialization Content: -Default Constructor: Always
     * initializes listStudent to be an empty list. -Parameterized Constructor:
     * Initializes listStudent with the provided list, which could be non-empty
     * and already contain students.
     *
     * 2. Flexibility: - Default Constructor: Less flexible as it doesn't allow
     * any initial content in the list; it starts empty every time. -
     * Parameterized Constructor: More flexible as it allows the StudentBO
     * instance to start with a pre-defined list of students.
     *
     * =>> the default constructor is used when you want to create an empty
     * StudentBO, while the parameterized constructor is used when you want to
     * initialize StudentBO with an existing list of students.
     */
    /*
-Constructor này có một parameter tên list kiểu ArrayList<Student>.
Khi một đối tượng StudentBO được tạo, constructor này được gọi và một ArrayList<Student> được truyền vào.
Trong constructor, từ khóa this được sử dụng để tham chiếu đến biến thành viên listStudent của đối tượng hiện tại(object Student) của lớp StudentBO.
Phép gán this.listStudent = list; gán giá trị của tham số list (là một ArrayList<Student>) cho biến thành viên listStudent.
Sau phép gán này, biến thành viên listStudent sẽ trỏ tới cùng một đối tượng ArrayList<Student> mà tham số list trỏ tới.
     */
//this là từ khóa dùng để tham chiếu đến đối tượng hiện tại. Nó giúp phân biệt giữa biến thành viên và biến cục bộ hoặc tham số phương thức có cùng tên.
    /**
     * Adds a student to the list.
     *
     * @param student the student to add
     */
//I. vd: Student có id là he1, name là Huynv,thì mọi lần nhập tiếp theo, Student có id he1 phải name là Huynv, ko đc tên khác
    /**
     * Checks if a student ID already exists with a different name.
     *
     * @param id the student ID to check
     * @param name the student name to check
     * @return true if the ID exists with a different name, false otherwise
     */
    private boolean checkIdExist(String id, String name) {
        for (Student student : this.listStudent) {
            if (id.equalsIgnoreCase(student.getId())
                    && !name.equalsIgnoreCase(student.getStudentName())) {
                return true;
            }
        }
        return false;
    }
//I. check STudent existed or not

    /**
     * Checks if a student already exists based on ID, name, semester, and
     * course name.
     *
     * @param id the student ID to check
     * @param studentName the student name to check
     * @param semester the semester to check
     * @param courseName the course name to check
     * @return true if the student exists, false otherwise
     */
    private boolean checkStudentExist(String id, String studentName, String semester, String courseName) {
        for (Student student : this.listStudent) {
            if (id.equalsIgnoreCase(student.getId())
                    && studentName.equalsIgnoreCase(student.getStudentName())
                    && semester.equalsIgnoreCase(student.getSemester())
                    && courseName.equalsIgnoreCase(student.getCourseName())) {
                return true;
            }
        }
        return false;
    }

    

    private ArrayList<Student> getListByName(String key) {
        ArrayList<Student> listFound = new ArrayList<>();
        for (Student student : this.listStudent) {
            if (student.getStudentName().contains(key)) {
                listFound.add(student);
            }
        }
        return listFound;
    }

    /**
     * Gets a student from a list of found students based on user input.
     *
     * @param listByID the list of students found by ID
     * @return the selected student
     */
 

    /**
     * Method to create student
     *
     * @param ls the list of student
     */
    public void addStudent() {
        /**
         * Creates a new student record.
         *
         */
        if (this.listStudent.size() > 2) {
            if (!Validate.isContinue("Do you want to continue (Y/y) or (N/n): ",
                    IConstant.YES, IConstant.NO,
                    IConstant.REGEX_YES_NO)) {
                return;
            }
        }
        /**
         * Cách Khởi tạo Biến Tham chiếu: MyClass obj = new MyClass(); Trong
         * đoạn mã trên, MyClass là một lớp (class), obj là một biến tham chiếu,
         * và "new MyClass()" : tạo ra một đối tượng mới của lớp MyClass trong
         * bộ nhớ heap. Biến obj lưu trữ địa chỉ của đối tượng mới này.
         *
         *
         *
         */
        while (true) {
            String id = Validate.getString("Enter id:",
                    IConstant.REGEX_ID);
            String name = Validate.getString("Enter name:",
                    IConstant.REGEX_NAME);
            if (checkIdExist(id, name)) {
                System.err.println("Each ID has its Name, Existed ID with "
                        + "changed Name not accepted.Please re-input.");
                continue;
            }

            String semester = Validate.getString("Enter semester:",
                    IConstant.REGEX_SEMESTER);

            String course = Validate.getString("Enter course: ",
                    IConstant.REGEX_COURSE);

            // kiểm tra sinh viên đã tồn tại trong list hay không
            if (checkStudentExist(id, name, semester, course)) {
                System.err.println("Student Existed.");
                return;
            }
            Student student = new Student(id, name, semester, course);
            this.listStudent.add(student);
            return;
        }

    }

    /**
     * Finds students by name and sorts them.
     *
     * @param ls
     */
//    public void sortByName(String key) {
//        key = Validate.getString("Enter name to search: ", IConstant.REGEX_NAME);
//        ArrayList<Student> list = getListByName(key);
//
//        if (list.isEmpty()) {
//            System.err.println("List empty.");
//        }
//        /* 
//        C1
//         */
//        Student[] students = list.toArray(new Student[list.size()]);
//        int n = students.length;
//        for (int i = 0; i < n - 1; i++) {
//            boolean swapped = false;
//            for (int j = 0; j < n - i - 1; j++) {
//                if (compareStudentAttributes(students[j], students[j + 1]) > 0) {
//                    Student temp = students[j];
//                    students[j] = students[j + 1];
//                    students[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//            if (swapped == true) {
//                break;
//            }
//        }
//        System.out.format("|%-15s|%-15s|%-15s|\n", "Student name", "Semester", "Course Name");
//        // lặp từ phần tử đầu tiên đến phần tử cuối cùng của list student
//        for (Student student : list) {
//            student.display();
//        }
//    }
//
//    private int compareStudentAttributes(Student st1, Student st2) {
//        int hieuName = st1.getStudentName().compareToIgnoreCase(st2.getStudentName());
//        if (hieuName != 0) {
//            return hieuName;
//        }
//
//        int hieuSemester = st1.getSemester().compareToIgnoreCase(st2.getSemester());
//        if (hieuSemester != 0) {
//            return hieuSemester;
//        }
//        return st1.getCourseName().compareToIgnoreCase(st2.getCourseName());
//
//    }
//
//    /*
//When comparing two strings using the compareTo method, if the strings are equal, the result is 0.
//If the first string comes lexicographically before the second string, the result is a negative integer.
//If the first string comes lexicographically after the second string, the result is a positive integer.
//     */
//
// /*
//    C2
//     */
    public void sortByName2() {
        String name = Validate.getString(
                "Enter name to search: ",
                IConstant.REGEX_NAME);

        ArrayList<Student> list = getListByName(name);
        
        Comparator<Student> sorttt = Comparator.comparing(Student::getStudentName);
         list.sort(sorttt);

        System.out.printf("|%-15s|%-15s|%-15s|\n",
                "Student name",
                "Semester",
                "Course Name");
        // lặp từ phần tử đầu tiên đến phần tử cuối cùng của list student
        for (Student student : list) {
           
            student.display();
        }
    }

    //Collections là 1 class có method sort, truyền danh sách list vào và triển khai 1 đối tượng Comparator<Student>, cụ thể là một interface được sử dụng để so sánh các đối tượng của lớp Student.
//interface là chứa đựng các method mà ko có thân(gồm cả method thường và abstract method), muốn viết thân thì phải tạo 1 class khác và "implements" method ra
//public interface ComparatorStudent> {
// int compare(Student o1, Student o2);
// Phương thức compare là một phương thức trừu tượng (abstract method), nghĩa là nó không có thân và cần được các lớp triển khai cung cấp phần thân cụ thể.
//Triển khai giao diện Comparator:
//Khi bạn muốn sắp xếp các đối tượng Student theo một tiêu chí tùy chỉnh, bạn triển khai giao diện Comparator<Student> và cung cấp cách so sánh cụ thể giữa hai đối tượng Student thông qua phương thức compare.
//Ghi đè phương thức compare:
//sử dụng từ khóa @Override để chỉ ra rằng phương thức bạn đang viết sẽ ghi đè phương thức compare của giao diện Comparator.
//@Override là một chú thích (annotation) trong Java. Nó giúp xác nhận rằng phương thức được ghi đè là một phương thức từ lớp cha hoặc giao diện cha.
//Nếu bạn viết sai tên phương thức hoặc chữ ký phương thức không khớp với phương thức của lớp cha hoặc giao diện cha, trình biên dịch sẽ báo lỗi. Điều này giúp ngăn chặn các lỗi tiềm ẩn.
//phương thức compare mà bạn triển khai chính là để ghi đè phương thức compare của giao diện Comparator, và từ khóa @Override giúp bạn xác nhận điều này.
//Đoạn mã bạn cung cấp là cách sử dụng phương thức sort() của lớp Collections để sắp xếp một danh sách list chứa các đối tượng Student.
//Trong hàm compare(), bạn đang triển khai một đối tượng Comparator<Student>, cụ thể là một interface được sử dụng để so sánh các đối tượng của lớp Student.
//Trong phương thức compare(), bạn cung cấp logic để so sánh hai đối tượng Student, o1 và o2, dựa trên tên của họ (sử dụng phương thức getStudentName()).
//Nếu o1 có tên nhỏ hơn o2, bạn trả về một số âm.
//Nếu o1 có tên lớn hơn o2, bạn trả về một số dương.
//Nếu hai tên bằng nhau, bạn trả về 0.
    public void updateStudent(Student student,String id) {
        String newSemester = Validate.getString("Enter new semester: ",
                IConstant.REGEX_SEMESTER);
        String newCourse = Validate.getString("Enter new course",
                IConstant.REGEX_COURSE);
        student.setCourseName(newCourse);
        student.setSemester(newSemester);
    }

    public void deleteStudent(Student student,String id) {
        this.listStudent.remove(student);
    }

    public ArrayList<Student> getListByID(String id) {
        ArrayList<Student> listFound = new ArrayList<>();
        for (Student student : this.listStudent) {
            if (student.getId().equalsIgnoreCase(id)) {
                listFound.add(student);
            }
        }
        return listFound;
    }

    public Student getStudentByListID(ArrayList<Student> listFound) {
        System.out.println("List student found: ");
        for (int i = 0; i < listFound.size(); i++) {
            Student st = listFound.get(i);
            System.out.printf("|%-6s|%-15s|%-15s|%-15s|\n", (i + 1), st.getStudentName(), st.getSemester(), st.getCourseName());
        }
        int choice = Validate.getInt("Emter number", "out of range", "must be digit", 1, listFound.size());

        return listFound.get(choice - 1);
    }

    /**
     * Generates a report of the total courses taken by each student.
     *
     * @return a HashMap with keys in the format "id#name|course" and values as
     * the total number of courses
     */
    private HashMap<String, Integer> reportHashMap() {
        HashMap<String, Integer> reports = new HashMap<>();
        //(key, value) : String key:name+course , key Integer: total of course
        for (Student st : this.listStudent) {
            //biến KEY thành form: id#name|course
            String key = st.getId() + "#" + st.getStudentName() + "|" + st.getCourseName();
            //duyệt mảng mà gồm các key theo form: id#name|course
            if (reports.containsKey(key)) {
                //totalCourse là VALUE
                int totalCourse = reports.get(key);
                reports.put(key, totalCourse + 1);
            } else {
                reports.put(key, 1);
            }

//c2:
/*
reports.getOrDefault(key, 0): Phương thức getOrDefault(key, defaultValue) của HashMap trả về giá trị tương ứng với key nếu key tồn tại trong HashMap. Nếu key không tồn tại, nó trả về defaultValue, trong trường hợp này là 0.

+ 1: Sau đó, 1 được thêm vào giá trị được trả về từ getOrDefault(key, 0), đảm bảo rằng số lượng các mục được đếm tăng lên 1.
mỗi khi một key mới xuất hiện, nó sẽ được thêm vào HashMap với value bắt đầu từ 1.
Nếu key đã tồn tại, value tương ứng sẽ được tăng thêm 1.
             */
//            reports.put(key, reports.getOrDefault(key, 0) + 1);
        }
        return reports;
    }

    public void displayHashMap() {
        for (String key : reportHashMap().keySet()) {
            String[] parts = key.split("#");
            String displayString = parts[1] + "|" + reportHashMap().get(key);
            System.out.println(displayString);
        }
    }

    /**
     * Generates a report of students and their courses.
     */
//    public void reportTotalCourse() {
//        for (String key : report().keySet()) {
////The key format is id#name|courseName.
////splitting by # results in an array: ["id", "name|courseName"].
////split để tách chuỗi id#name|course, nó sẽ tạo ra một mảng chuỗi với hai phần tử. Cụ thể:
////Phần tử đầu tiên sẽ là id.
////Phần tử thứ hai sẽ là name|course.
////key.split("#")[1]: This accesses the second part of the split array, which is name|courseName.
//            String[] parts = key.split("@");
//            System.out.println(parts[1] + "|" + report().get(key));
//        }
//    }
    /**
     * Displays the main menu options.
     *
     * @return
     */
    public static int menu() {
        System.out.println("WELLCOME TO STUDENT MANAGEMENT");
        System.out.println("1.Create");
        System.out.println("2.Find and Sort");
        System.out.println("3.Update/Delete");
        System.out.println("4.Report");
        System.out.println("5.Exit");
        int choice = Validate.getInt("Enter ur choice: ", "out of range min-max", "Must be digit", 1, 5);
        return choice;
    }
}
