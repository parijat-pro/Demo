package pck.ChromosomeDesign;

public class TimeSlotDetails {
    String dayName;
    int slotNo;

    public TimeSlotDetails() {
    }

    public TimeSlotDetails(String dayName, int slotNo) {
        this.dayName = dayName;
        this.slotNo = slotNo;
    }

    public String getDayName() {
        return dayName;
    }

    public int getSlotNo() {
        return slotNo;
    }
}
