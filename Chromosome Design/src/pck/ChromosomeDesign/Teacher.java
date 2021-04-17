package pck.ChromosomeDesign;

public class Teacher {
    String teacherName,teacherAbbreviation;

    public Teacher() {
    }

    public Teacher(String teacherName, String teacherAbbreviation) {
        this.teacherName = teacherName;
        this.teacherAbbreviation = teacherAbbreviation;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getTeacherAbbreviation() {
        return teacherAbbreviation;
    }
}