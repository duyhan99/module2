package com.student.control;

import com.student.dal.StudentDB;
import com.student.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
public class StudentControl {
    StudentDB sdb = new StudentDB();
    public void  add(Student student) throws Exception{
        sdb.add(student);
        sdb.saveFile();
    }
    public Student find(int id){
        return StudentDB.studentList.get(id);
    }
    public void updateFile() throws Exception{
        sdb.saveFile();
    }
    public boolean remove(int id) throws Exception{
        boolean result = sdb.remove(id);
        sdb.saveFile();
        return result;
    }
    public void print(){
        for (Map.Entry<Integer,Student> entry : StudentDB.studentList.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue().toString());
        }
    }
    public void loadData() throws Exception{
        sdb.readFile();
    }
    public int size(){
        return StudentDB.studentList.size();
    }
}
