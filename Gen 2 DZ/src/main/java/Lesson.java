import java.util.ArrayList;

public class Lesson {
    private Class aClass;

    private Subject subject;

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Lesson(Subject subject) {
        this.subject = subject;
    }

    public Lesson() {
    }

    @Override
    public String toString() {
        return subject.getName() + ", ";
    }

}
