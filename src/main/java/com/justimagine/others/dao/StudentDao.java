package com.justimagine.others.dao;

import java.util.List;

/**
 * @Description TODO
 * @Date 2022/7/25 9:54
 * @Created by zhushuxian
 */
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}