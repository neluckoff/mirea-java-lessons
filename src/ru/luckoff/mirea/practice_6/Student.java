package ru.luckoff.mirea.practice_6;

public class Student implements Comparable<Student>{
    private String numGroup;
    private String nameStudent;
    private int averageScore;

    public Student(String numGroup, String nameStudent, int averageScore) {
        this.numGroup = numGroup;
        this.nameStudent = nameStudent;
        this.averageScore = averageScore;
    }

    public String getNumGroup() {
        return numGroup;
    }

    public void setNumGroup(String numGroup) {
        this.numGroup = numGroup;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return numGroup + " Name: " + nameStudent + " Score: " + averageScore + "\n";
    }

    @Override
    public int compareTo(Student o) {
        return this.averageScore - o.averageScore;
    }
}
