import java.util.ArrayList;
import java.util.Random;

public class Schedule {
    private Class a = new Class(1);
    private Class b = new Class(2);
    private Class c = new Class(3);
    private Class d = new Class(4);
    private Class e = new Class(5);

    private  Subject russianLanguage = new Subject("Русский язык", 4);
    private  Subject algebra = new Subject("алгебра", 4);
    private  Subject englishLanguage = new Subject("Английский язык", 2);
    private  Subject tatarLanguage = new Subject("Татарский язык", 3);
    private  Subject physics = new Subject("Физика", 2);
    private  Subject chemistry = new Subject("химия", 2);
    private  Subject physicalCulture = new Subject("физкультура", 3);
    private  Subject biology = new Subject("биология", 2);
    private  Subject geometry = new Subject("геометрия", 2);
    private  Subject geography = new Subject("география", 2);
    private  Subject informatics = new Subject("информатика", 2);
    private  Subject history = new Subject("история", 2);
    private  Subject obzh = new Subject("ОБЖ", 2);
    private  Subject socialScience = new Subject("обществознание", 2);
    private  Subject literature = new Subject("литература", 2); //36

//    private Lesson lessonForA = new Lesson(a, russianLanguage);
//    private Lesson lessonForB = new Lesson(b, physicalCulture);
//    private Lesson lessonForC = new Lesson(c, geography);
//    private Lesson lessonForD = new Lesson(d, englishLanguage);
//    private Lesson lessonForE = new Lesson(e, socialScience);

//    private Lessons firstLessons = new Lessons(lessonForA, lessonForB, lessonForC, lessonForD, lessonForE); // 8.30 - 9.15
//    private Lessons secondLessons = new Lessons(lessonForA, lessonForB, lessonForC, lessonForD, lessonForE);
//    private Lessons thirdLessons = new Lessons(lessonForA, lessonForB, lessonForC, lessonForD, lessonForE);
//    private Lessons fourthLessons = new Lessons(lessonForA, lessonForB, lessonForC, lessonForD, lessonForE);
//    private Lessons fifthLessons = new Lessons(lessonForA, lessonForB, lessonForC, lessonForD, lessonForE);
//    private Lessons sixthLessons = new Lessons(lessonForA, lessonForB, lessonForC, lessonForD, lessonForE); //13.20 - 14.00

    private Day monday = new Day();
    private Day tuesday = new Day();
    private Day wednesday = new Day();
    private Day thursday = new Day();
    private Day friday = new Day();
    private Day saturday = new Day();

    public Day getMonday() {
        return monday;
    }

    public void setMonday(Day monday) {
        this.monday = monday;
    }

    public Day getTuesday() {
        return tuesday;
    }

    public void setTuesday(Day tuesday) {
        this.tuesday = tuesday;
    }

    public Day getWednesday() {
        return wednesday;
    }

    public void setWednesday(Day wednesday) {
        this.wednesday = wednesday;
    }

    public Day getThursday() {
        return thursday;
    }

    public void setThursday(Day thursday) {
        this.thursday = thursday;
    }

    public Day getFriday() {
        return friday;
    }

    public void setFriday(Day friday) {
        this.friday = friday;
    }

    public Day getSaturday() {
        return saturday;
    }

    public void setSaturday(Day saturday) {
        this.saturday = saturday;
    }

    @Override
    public String toString() {
        return "Schedule: " + "\n" +
                "monday: " + monday.toString() + "\n" +
                "tuesday: " + tuesday.toString() + "\n" +
                "wednesday: " + wednesday.toString() + "\n" +
                "thursday: " + thursday.toString() + "\n" +
                "friday: " + friday.toString() + "\n" +
                "saturday: " + saturday.toString() + "\n"
                ;
    }

    Random randomizer = new Random();

    private ArrayList subjects = new ArrayList();
    public ArrayList getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList subjects) {
        this.subjects = subjects;
    }

    public void fillSubjects(){
        subjects.add(russianLanguage);
        subjects.add(algebra);
        subjects.add(englishLanguage);
        subjects.add(tatarLanguage);
        subjects.add(physics);
        subjects.add(chemistry);
        subjects.add(biology);
        subjects.add(geometry);
        subjects.add(geography);
        subjects.add(informatics);
        subjects.add(history);
        subjects.add(obzh);
        subjects.add(socialScience);
        subjects.add(literature);
        subjects.add(physicalCulture);
    }

    public Subject chooseRandomSubject(){
        Random randomizer = new Random();

        Subject random = (Subject) subjects.get(randomizer.nextInt(subjects.size()));
        return random;
    }

    public Lessons chooseRandomLessons(){
        Lessons lessons = new Lessons();
        for (int i = 1; i < 7; i++){
            Subject randomSubject = chooseRandomSubject();
            Lesson lesson = new Lesson();
            lesson.setSubject(randomSubject);
            switch (i){
                case 1: lessons.setLessonForA(lesson);
                case 2: lessons.setLessonForB(lesson);
                case 3: lessons.setLessonForC(lesson);
                case 4: lessons.setLessonForD(lesson);
                case 5: lessons.setLessonForE(lesson);
            }
        }
        return lessons;
    }

    public Day chooseRandomDay(){
        Day day = new Day();
        for (int i = 1; i < 7; i++){
            Lessons lessons = chooseRandomLessons();
            switch (i){
                case 1: day.setFirstLessons(lessons);
                case 2: day.setSecondLessons(lessons);
                case 3: day.setThirdLessons(lessons);
                case 4: day.setFourthLessons(lessons);
                case 5: day.setFifthLessons(lessons);
                case 6: day.setSixthLessons(lessons);
            }
        }
        return day;
    }

    public Schedule chooseRanomScheudle(){
        Schedule schedule = new Schedule();
        for(int i = 1; i < 7; i++){
            Day day = chooseRandomDay();
            switch (i){
                case 1: schedule.setMonday(day);
                case 2: schedule.setTuesday(day);
                case 3: schedule.setWednesday(day);
                case 4: schedule.setThursday(day);
                case 5: schedule.setFriday(day);
                case 6: schedule.setSaturday(day);
            }
        }
        return  schedule;
    }
}
