package com.company;

public class Test {

        public static void main(String[] args) {
            Student.change();

            Student s1 = new Student(111, "Duong");
            Student s2 = new Student(222, "Phong");
            Student s3 = new Student(333, "Huy");

            s1.display();
            s2.display();
            s3.display();
        }
    }


