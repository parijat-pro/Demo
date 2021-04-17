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

    public void getFitness(){
        /*softFitness=0;
        //generate fitness;
        i=0-5
        hardFitnessDayWise[i]=0;
        softFitnessDayWise[i]=0
               j= 0-6
                        check
                                hardFitnessDayWise++;



        softFitness+=softFitnessDayWise[i];*/
    }

}
