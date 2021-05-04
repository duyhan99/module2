package com.student.presentation;

import com.student.control.StudentControl;
import com.student.dal.StudentDB;
import com.student.model.Student;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        StudentControl sdc = new StudentControl();
        try {
            sdc.loadData();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            creatMenu();
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    printStudentList();
                    break;
                case 2:
                    try {
                        addStudent();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        editStudent();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    try {
                        deleteStudent();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    System.out.println("---Vui lòng chọn---");
                    System.out.println("1. Nhập điểm hệ số 1 lần 1." + "\n" + "2. Nhập điểm hệ số 1 lần 2." +"\n" +
                            "3. Nhập điểm hệ số 2" + "\n" + "4. Nhập điểm hệ số 3");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice){
                        case 1:
                            try {
                                inputScore11();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        case 2:
                            try {
                                inputScore12();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        case 3:
                            try {
                                inputScore2();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        case 4:
                            try {
                                inputScore3();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            break;
                    }
                    break;
                case 6:
                    try {
                        editScore();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    System.out.println("Xếp loại");
                    break;
                case 0:
                    exit();
                    break;
                default:
                    System.out.println("Nhập lại:");
                    break;
            }
        }while (choose != 0);
    }
    public static void creatMenu(){
        System.out.println("1. Xem danh sách học viên");
        System.out.println("2. Thêm học viên");
        System.out.println("3. Sửa thông tin học viên");
        System.out.println("4. Xóa học viên");
        System.out.println("5. Nhập điểm học viên");
        System.out.println("6. Sửa nhập điểm học viên");
        System.out.println("7. Xếp loại học viên");
        System.out.println("0. Thoát");
    }
    public static void printStudentList(){
        StudentControl sdc = new StudentControl();
        sdc.print();
        System.out.println("Hiện có " + sdc.size() + " học viên trong danh sách");
    }
    public static void addStudent() throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String address = scanner.nextLine();
        System.out.println("Nhập số điện thoại:");
        String phoneNumber = scanner.nextLine();
        Student student = new Student(0,name,address,phoneNumber);
        StudentControl sc = new StudentControl();
        sc.add(student);
        System.out.println("Đã thêm học viên " + student.getName() + " thành công" );
    }
    public static void editStudent() throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id muốn sửa:");
        int id = scanner.nextInt();
        scanner.nextLine();
        StudentControl sdc = new StudentControl();
        Student s2 = sdc.find(id);
        if (s2 == null){
            System.out.println("Không tìm thấy");
        }else {
            System.out.println(s2.toString());
            System.out.println("Nhập tên:");
            String name = scanner.nextLine();
            System.out.println("Nhập địa chỉ:");
            String address = scanner.nextLine();
            System.out.println("Nhập số điện thoại:");
            String phoneNumber = scanner.nextLine();
            s2.setName(name);
            s2.setAddress(address);
            s2.setPhoneNumber(phoneNumber);
            sdc.updateFile();
            System.out.println("Sửa thông tin thành công!");
        }
    }
    public static void deleteStudent() throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id học viên muốn xóa");
        int id = scanner.nextInt();
        scanner.nextLine();
        StudentControl sdc = new StudentControl();
        sdc.remove(id);
        System.out.println("Đã xóa học viên");
    }
    public static void exit(){
        System.out.println("Đã thoát ứng dụng.");
        System.exit(0);
    }

    public static void inputScore11() throws Exception{
        StudentControl sdc = new StudentControl();
        Scanner scanner = new Scanner(System.in);
        for (Map.Entry<Integer,Student> entry : StudentDB.studentList.entrySet()){
            System.out.println("Nhập điểm hệ số 1 lần 1:" + sdc.find(entry.getKey()).getName());
            double score1 = scanner.nextDouble();
            entry.getValue().setDiem11(score1);
        }
        sdc.updateFile();
    }
    public static void editScore() throws Exception{
        Scanner scanner = new Scanner(System.in);
        StudentControl sdc = new StudentControl();
        System.out.println("Nhập ID học viên muốn sửa và nhập điểm");
        int id = scanner.nextInt();
        scanner.nextLine();
        Student student = sdc.find(id);
        if (student == null){
            System.out.println("Học viên không có trong danh sách");
        }else {
            System.out.println(student.toStringScore());
            System.out.println("Nhập điểm hệ số 1 lần 1:");
            double score1 = scanner.nextDouble();
            student.setDiem11(score1);
            System.out.println("Nhập điểm hệ số 1 lần 2:");
            double score2 = scanner.nextDouble();
            student.setDiem12(score2);
            System.out.println("Nhập điểm hệ số 2:");
            double score3 = scanner.nextDouble();
            student.setDiem2(score3);
            System.out.println("Nhập điểm hệ số 3:");
            double score4 = scanner.nextDouble();
            student.setDiem3(score4);
            double scoreTB = (score1+score2+score3*2+score4*3)/7;
            student.setDiemTB(scoreTB);
            System.out.println("Thành công !");
            System.out.println(student.toStringScore());
        }
        sdc.updateFile();
    }
    public static void inputScore12() throws Exception{
        StudentControl student2Service = new StudentControl();
        Scanner scanner = new Scanner(System.in);
        for (Map.Entry<Integer,Student> entry : StudentDB.studentList.entrySet()){
            System.out.println("Nhập điểm hệ số 1 lần 2:" + student2Service.find(entry.getKey()).getName());
            double score2 = scanner.nextDouble();
            entry.getValue().setDiem12(score2);
        }
        student2Service.updateFile();
    }
    public static void inputScore2() throws Exception{
        StudentControl sdc = new StudentControl();
        Scanner scanner = new Scanner(System.in);
        for (Map.Entry<Integer,Student> entry : StudentDB.studentList.entrySet()){
            System.out.println("Nhập điểm hệ số 2:" + sdc.find(entry.getKey()).getName());
            double score3 = scanner.nextDouble();
            entry.getValue().setDiem2(score3);
        }
        sdc.updateFile();
    }
    public static void inputScore3() throws Exception{
        StudentControl sdc = new StudentControl();
        Scanner scanner = new Scanner(System.in);
        for (Map.Entry<Integer,Student> entry : StudentDB.studentList.entrySet()){
            System.out.println("Nhập điểm hệ số 3 : " + sdc.find(entry.getKey()).getName());
            double score4 = scanner.nextDouble();
            entry.getValue().setDiem3(score4);
        }
        sdc.updateFile();
    }
}
