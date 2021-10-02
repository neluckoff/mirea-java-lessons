package ru.luckoff.mirea.practice_9;

import java.util.Scanner;

public class LabClassUI {
    LabClass labClass;

    public LabClassUI() {
        labClass = new LabClass();
        LabClassDriver labDriver = new LabClassDriver(labClass);
        labDriver.input();
    }

    public void searchStudent() {
        String nameStudent = null;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name of search Student: ");
        try {
            nameStudent = in.next();
            if (nameStudent.isEmpty())
                throw new EmptyStringExeption("String is Empty!");
        } catch (EmptyStringExeption elem) {
            System.out.println(elem.getMessage());
            searchStudent();
        }
        try {
            System.out.println(labClass.search(nameStudent).toString());
        } catch (StudentNotFoundExeption elem) {
            System.out.println(elem.getMessage());
        }
    }

    public static void main(String[] args) {
        LabClassUI start = new LabClassUI();
        start.searchStudent();
        start.searchStudent();
        start.searchStudent();
    }
}
