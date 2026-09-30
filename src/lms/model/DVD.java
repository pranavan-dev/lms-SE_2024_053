package lms.model;

public class DVD extends LibraryItem {
    private int durationMinutes;

    public DVD(String id, String title, int durationMinutes) {
        super(id, title);
        this.durationMinutes = durationMinutes;
    }

    // TODO: getDurationMinutes() 

    @Override
    public double calculateLateFee(int daysLate) {
        // TODO: DVDs cost 25.0 per day late
        return daysLate * 25.0;
    }
}
