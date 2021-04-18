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

    public void getFitness() {
        softFitness = 0;
        int classNext = 6;
        for (int day = 0; day < 5; day++) {
            hardFitnessDayWise[day] = 0;
            softFitnessDayWise[day] = 0;
            for (int timeSlot = 0; timeSlot < 6; timeSlot++) {
                int result = getNumberTheoryClass(classNext);
                if (result > classNext)
                    hardFitnessDayWise[timeSlot]++;
                else if (result < classNext)
                    softFitnessDayWise[timeSlot]++;
                else if (result == timeSlot)
                    break;
                else if (isAllotted(day, timeSlot) == true)
                    continue;
                else if (isAllotted(day, timeSlot) == false)
                    break;
            }
            hardFitnessDay += hardFitnessDayWise[day];
            softFitness += softFitnessDayWise[day];
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
