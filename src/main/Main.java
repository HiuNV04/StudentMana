package main;

import bo.StudentBO;
import entity.Student;
import util.Validate;
import java.util.*;
import constant.IConstant;

public class Main {

    public static void main(String[] args) {
        StudentBO stBo = new StudentBO();
        while (true) {
            int choice = StudentBO.menu();
            switch (choice) {
                case 1:
                    stBo.addStudent();
                    break;
                case 2:
                    stBo.sortByName2();
                    break;
                case 3:
                    String id = Validate.getString(
                            "Enter id to find: ",
                            IConstant.REGEX_ID);
                    ArrayList<Student> listById = stBo.getListByID(id);
                    Student student = stBo.getStudentByListID(listById);
                    String option = Validate.getChoice(
                            "Do you want to update(u) or delete(d): ",
                            "u", "d",
                            IConstant.REGEX_UPDATE_DELETE);
                    switch (option) {
                        case IConstant.UPDATE:
                            stBo.updateStudent(student,id);
                            break;
                        case IConstant.DELETE:
                            stBo.deleteStudent(student,id);
                            break;
                    }
                    break;
                case 4:
                    stBo.displayHashMap();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }

    }

//String a = "abcd12dj32fj";
//StringBuilder res = new StringBuilder();
////for(char c:a.toCharArray()){
//    for(int i=1; i<a.length(); i+=2){
//        res.append(a.charAt(i));
//    }
//        System.out.println(res);
//}
//        int num = 91;
//        String s = "abc991nffjd";
//        String nums = String.valueOf(num);
//        if (s.contains(nums)) {
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }
//    }'
}
