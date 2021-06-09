import java.util.ArrayList;

public class Class {
    private int number; // вместо а - д 1 - 5

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Class(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number + " ";
    }
}
