public class Lessons { // 6 параллельных уоров в 1 время

    private Lesson lessonForA;
    private Lesson lessonForB;
    private Lesson lessonForC;
    private Lesson lessonForD;
    private Lesson lessonForE;

    public Lessons(Lesson lessonForA, Lesson lessonForB, Lesson lessonForC, Lesson lessonForD, Lesson lessonForE) {
        this.lessonForA = lessonForA;
        this.lessonForB = lessonForB;
        this.lessonForC = lessonForC;
        this.lessonForD = lessonForD;
        this.lessonForE = lessonForE;
    }

    public Lessons() {

    }

    @Override
    public String toString() {
        return  "А класс: " + lessonForA +
                "Б класс: " + lessonForB +
                "В класс: " + lessonForC +
                "Г класс: " + lessonForD +
                "Д класс: " + lessonForE
                ;
    }

    public Lesson getLessonForA() {
        return lessonForA;
    }

    public void setLessonForA(Lesson lessonForA) {
        this.lessonForA = lessonForA;
    }

    public Lesson getLessonForB() {
        return lessonForB;
    }

    public void setLessonForB(Lesson lessonForB) {
        this.lessonForB = lessonForB;
    }

    public Lesson getLessonForC() {
        return lessonForC;
    }

    public void setLessonForC(Lesson lessonForC) {
        this.lessonForC = lessonForC;
    }

    public Lesson getLessonForD() {
        return lessonForD;
    }

    public void setLessonForD(Lesson lessonForD) {
        this.lessonForD = lessonForD;
    }

    public Lesson getLessonForE() {
        return lessonForE;
    }

    public void setLessonForE(Lesson lessonForE) {
        this.lessonForE = lessonForE;
    }
}
