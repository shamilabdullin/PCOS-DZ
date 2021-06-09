public class Subject {
    private String name;

    private int amountDuringWeek;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountDuringWeek() {
        return amountDuringWeek;
    }

    public void setAmountDuringWeek(int amountDuringWeek) {
        this.amountDuringWeek = amountDuringWeek;
    }

    public Subject(String name, int amountDuringWeek) {
        this.name = name;
        this.amountDuringWeek = amountDuringWeek;
    }

    @Override
    public String toString() {
        return name + " ";
    }
}
