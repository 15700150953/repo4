package org.btf.test;

import org.btf.pojo.Clazz;
import org.btf.pojo.Student;
import org.btf.utils.CloneUtils;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("123", "毕腾飞", "男", new Clazz("456", "1612A", 45));
//        Student student_clone = null;
//        try {
//            student_clone = (Student) student.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//
//        student_clone.getClazz().setClazzId("btf");
//        System.out.println(student.getClazz().getClazzId());
        Student student_clone = CloneUtils.clone(student);
        System.out.println(student == student_clone);
        System.out.println(student.equals(student_clone));
        System.out.println(student_clone.getClazz() == student.getClazz());
    }
    public void test(){
        int i = 0;
        i += 10;
    }
}
