package com.techelevator;

public class HomeworkAssignment {
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;

    public String getLetterGrade() {
        double percent = (double)earnedMarks/ (double)possibleMarks;
        if ((percent * 100) >= 90) {
            return "A";
        } else if ((percent * 100) >= 80) {
            return "B";
        } else if ((percent * 100) >= 70) {
            return "C";
        } else if ((percent * 100) >= 60) {
            return "D";
        } else {
            return "F";
        }
    }


    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }


    public String getSubmitterName() {
        return submitterName;
    }



}
