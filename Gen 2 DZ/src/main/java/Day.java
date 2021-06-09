public class Day {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Day(String name, Lessons firstLessons, Lessons secondLessons, Lessons thirdLessons, Lessons fourthLessons, Lessons fifthLessons, Lessons sixthLessons) {
        this.name = name;
        this.firstLessons = firstLessons;
        this.secondLessons = secondLessons;
        this.thirdLessons = thirdLessons;
        this.fourthLessons = fourthLessons;
        this.fifthLessons = fifthLessons;
        this.sixthLessons = sixthLessons;
    }

    private Lessons firstLessons;
    private Lessons secondLessons;
    private Lessons thirdLessons;
    private Lessons fourthLessons;
    private Lessons fifthLessons;
    private Lessons sixthLessons;

    @Override
    public String toString() {
        return  "\nПервые 5 уроков: " + firstLessons + "\n" +
                "Вторые  5 уроков: " + secondLessons + "\n" +
                "Третьи 5 уроков: " + thirdLessons + "\n" +
                "Четвертые 5 уроков: " + fourthLessons + "\n" +
                "Пятые 5 уроков: " + fifthLessons + "\n" +
                "Шестые 5 уроков: " + sixthLessons + "\n"
                ;
    }

    public Day() {
    }

    public Lessons getFirstLessons() {
        return firstLessons;
    }

    public void setFirstLessons(Lessons firstLessons) {
        this.firstLessons = firstLessons;
    }

    public Lessons getSecondLessons() {
        return secondLessons;
    }

    public void setSecondLessons(Lessons secondLessons) {
        this.secondLessons = secondLessons;
    }

    public Lessons getThirdLessons() {
        return thirdLessons;
    }

    public void setThirdLessons(Lessons thirdLessons) {
        this.thirdLessons = thirdLessons;
    }

    public Lessons getFourthLessons() {
        return fourthLessons;
    }

    public void setFourthLessons(Lessons fourthLessons) {
        this.fourthLessons = fourthLessons;
    }

    public Lessons getFifthLessons() {
        return fifthLessons;
    }

    public void setFifthLessons(Lessons fifthLessons) {
        this.fifthLessons = fifthLessons;
    }

    public Lessons getSixthLessons() {
        return sixthLessons;
    }

    public void setSixthLessons(Lessons sixthLessons) {
        this.sixthLessons = sixthLessons;
    }
}
