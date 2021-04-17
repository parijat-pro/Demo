package pck.ChromosomeDesign;

public class ChromosomeDesign {
    public static Chromosome[] chromosomes=new Chromosome[10];
    int row,col;
    private static int TOTAL_SUBJECTS=7;
    private TimeSlotDetails slotDetails;
    private Subject[] subjects=new Subject[TOTAL_SUBJECTS];

    public ChromosomeDesign() {
        subjects[0]=new Subject("Programming for problem solving","MCAC101");
        subjects[1]=new Subject("Discreet Structure","MCAC103");
        subjects[2]=new Subject("Soft skills","MCAS101");
        subjects[3]=new Subject("Computer Networks","MCAC102");
        subjects[4]=new Subject("Introduction to Artificial Intelligence"," MCAD101D");
        subjects[5]=new Subject("Computer Networks","MCAC192");
        subjects[6]=new Subject("Programming for problem solving","MCAC191");

    }

    private void setPopulation(){
        for(int chromosomeNumber=0;chromosomeNumber<10;chromosomeNumber++){
            chromosomes[chromosomeNumber]=new Chromosome();
            for(int classNumber=0;classNumber<7;classNumber++){
                while(true) {
                    row = (int) (Math.random() * (4 + 1));//(limit+1)
                    col = (int) (Math.random() * (5 + 1));
                    if(!chromosomes[chromosomeNumber].isAllotted(row,col)){
                        int subjectNumber=(int) (Math.random() * (6 + 1));
                        chromosomes[chromosomeNumber].setClass(row,col,new ClassDetails(subjectNumber>=5,
                                new TimeSlotDetails(getDayFullName(row), col+1),subjects[subjectNumber].getRespectiveTeacher(),subjects[subjectNumber]));
                        break;
                    }
                }
            }
            chromosomes[chromosomeNumber].getFitness();
        }
    }

    private String getDayFullName(int row) {
        switch (row){
            case 0:
                return "Monday";
            case 1:
                return "Tuesday";
            case 2:
                return "Wednesday";
            case 3:
                return "Thursday";
            case 4:
                return "Friday";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        ChromosomeDesign population=new ChromosomeDesign();
        population.setPopulation();
        population.displayPopulation();
    }

    private void displayPopulation() {
        for(int chromosomeCounter=0;chromosomeCounter<10;chromosomeCounter++){
            System.out.println("Chromosome "+chromosomeCounter+":");
            for (int row=0;row<5;row++){
                for(int col=0;col<6;col++){
                    ClassDetails details=chromosomes[chromosomeCounter].getClassDetails(row,col);
                    if(details!=null)
                        System.out.print("["+details.isPracticalClass()+","+details.getSubject().subjectCode+","+details.getTeacher().getTeacherAbbreviation()+"]   ");
                    else
                        System.out.print(" \t\t--\t\t ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
