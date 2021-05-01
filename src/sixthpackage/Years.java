package sixthpackage;

import java.time.Month;
import java.time.Year;

public class Years {

    private Months months;

    public Years(Months months) {
        this.months = months;

    }

    public void whatToDo() {
        switch (months) {
            case January:
                System.out.println("I'll celebrate my birthday");
                break;
            case February:
                System.out.println("I will go on vacation");
                break;
            case Decemeber:
                System.out.println("I will spend time with family");
                break;
            default:
                System.out.println("I will go to work");
        }

    }

    public static void main(String[] args) {
        Years years = new Years(Months.October);
        years.whatToDo();
    }
}
