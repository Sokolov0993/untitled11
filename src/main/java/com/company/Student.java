package com.company;

public class Student {
    private int id;
    private String faculty;
    private int group;
    private double MathMark;
    private double HistoryMark;
    private double EconomicsMark;
    private double averageMark = (MathMark+HistoryMark+EconomicsMark)/3;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public double getMathMark() {
        return MathMark;
    }

    public void setMathMark(double mathMark) {
        MathMark = mathMark;
    }

    public double getHistoryMark() {
        return HistoryMark;
    }

    public void setHistoryMark(double historyMark) {
        HistoryMark = historyMark;
    }

    public double getEconomicsMark() {
        return EconomicsMark;
    }

    public void setEconomicsMark(double economicsMark) {
        EconomicsMark = economicsMark;
    }

    public double getAverageMark() {
        averageMark = (MathMark+EconomicsMark+HistoryMark)/3;
        return averageMark;
    }

    public Student(int id, String faculty, int group, int mathMark, int historyMark, int economicsMark) {
        this.id = id;
        this.faculty = faculty;
        this.group = group;
        MathMark = mathMark;
        HistoryMark = historyMark;
        EconomicsMark = economicsMark;
        try {
            boolean a =group==1||group==2||group==3||group==4;
            if (!a)
            {
                throw new Exception1();
            }
        } catch (Exception1 e) {
            e.printStackTrace();
            System.err.println("There are only 4 groups: group1, group2, group3, group4");

        }
        try {
            boolean a = faculty.equalsIgnoreCase("faculty1")|| faculty.equalsIgnoreCase("faculty2");
            if (!a){
                throw new Exception1();
            }
        }catch (Exception1 e) {
            System.err.println("There are only 2 faculties: faculty1 and faculty2");

            e.printStackTrace();
        }


        try {
            if (mathMark<1|| mathMark>10||historyMark>10|| historyMark<1 ||economicsMark>10|| economicsMark<1){
                throw new  Exception1();

            }
        } catch (Exception1 e) {
            System.err.println("The mark can't be more then 10 or less then 0");
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Student "+ id +
                ", faculty:'" + faculty + '\'' +
                ", group:" + group +
                " (MathMark=" + MathMark +
                ", HistoryMark=" + HistoryMark +
                ", EconomicsMark=" + EconomicsMark +
                ", averageMark=" + averageMark+")";
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
}

