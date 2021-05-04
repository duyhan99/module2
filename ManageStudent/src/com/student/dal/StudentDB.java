package com.student.dal;
import com.student.control.StudentControl;
import com.student.model.Student;

import java.io.*;
import java.util.*;


public class StudentDB {
    public static Map<Integer,Student> studentList;
    public static int count;
    static {
        studentList = new HashMap<>();
        count = 0;
    }
    public void saveFile() throws Exception{
        File file = new File("student.csv");
        if (!file.exists()){
            file.createNewFile();
        }
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("student.csv"));
        for (Map.Entry<Integer,Student> entry : studentList.entrySet()){
            bos.write(entry.getValue().toStringCSV().getBytes());
        }
        bos.flush();
        bos.close();
    }
    public void add(Student student){
        count++;
        student.setId(count);
        studentList.put(count,student);
    }
    public void readFile() throws Exception{
        File file = new File("student.csv");
        if (!file.exists()){
            return;
        }else {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("student.csv"));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] str = line.split(",");
                Student student2 = new Student(Integer.parseInt(str[0]),str[1],str[2],str[3],Double.parseDouble(str[4]),Double.parseDouble(str[5]),Double.parseDouble(str[6]),Double.parseDouble(str[7]),Double.parseDouble(str[8]));
                add(student2);
            }
        }
    }
    public boolean remove(int id){
        boolean result = studentList.remove(id) == null;
        return result;
    }
}


