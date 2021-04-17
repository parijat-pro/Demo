package pck.ChromosomeDesign;

public class ClassDetails {
    boolean isPracticalClass;
    TimeSlotDetails slotDetails;
    Teacher teacher;
    Subject subject;

    public ClassDetails() {
    }

    public ClassDetails(boolean isPracticalClass, TimeSlotDetails slotDetails, Teacher teacher, Subject subject) {
        this.isPracticalClass = isPracticalClass;
        this.slotDetails = slotDetails;
        this.teacher = teacher;
        this.subject = subject;
    }

    public boolean isPracticalClass() {
        return isPracticalClass;
    }

    public TimeSlotDetails getSlotDetails() {
        return slotDetails;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Subject getSubject() {
        return subject;
    }
}
