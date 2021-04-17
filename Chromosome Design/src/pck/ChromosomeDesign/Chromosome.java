package pck.ChromosomeDesign;

public class Chromosome{
    int[] softFitnessDayWise=new int[5];
    int[] hardFitnessDayWise=new int[5];
    int softFitness,hardFitnessDay;
    ClassDetails[][] classes=new ClassDetails[5][6];

    public Chromosome() {
    }

    public void setClass(int row,int col,ClassDetails classDetails) {
        classes[row][col]=classDetails;
    }

    public boolean isAllotted(int row, int col) {
        return classes[row][col]!=null;
    }

    public void getFitness(){
        softFitness=0;
        int classNext=6;
        for(int day=0;day<5;day++){
            hardFitnessDayWise[i]=0;
            softFitnessDayWise[i]=0;
            for(int timeSlot=0;timeSlot<6;timeSlot++){
                int result = getNumberTheoryClass(classNext);
                if(result>classNext)
                    hardFitnessDayWise[timeSlot]++;
            }
        }
    }
    private int getNumberTheoryClass(int classNext){
        int result=0;
        for(int col=0;col<6;col++){
            if(classes[classNext][col].isPracticalClass){
                result++;
            }
        }
        return(result);
    }

}
