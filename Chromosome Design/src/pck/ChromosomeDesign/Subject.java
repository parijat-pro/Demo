package pck.ChromosomeDesign;

public class Subject{
    String subjectName,subjectCode;

    public Subject() {
    }

    public Subject(String subjectName, String subjectCode) {
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public Teacher getRespectiveTeacher() {
        
        switch (this.subjectCode){
            case "MCAC101":
            case "MCAD101D":
            case "MCAC191":
                return (new Teacher("Anindita Das Bhattacharya","ADB"));
            case "MCAC103":
            case "MCAC102":
            case "MCAC192":
                return (new Teacher("Gourav Mondal","GM"));
            case "MCAS101":
                return (new Teacher("Sushanta Kayal","SK"));
            default:
                return (new Teacher("",""));

        }
    }
}
