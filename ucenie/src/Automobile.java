import java.util.Calendar;
import java.util.Locale;

public interface Automobile {
    String safetyAssessmentProgram = "Global NCAP";
    String getMake();
    String getModel();
    Double getPrice();

    static String getFormattedCalendarString(){
        Calendar now = Calendar.getInstance();
//        System.out.println(now);
        return String.format("%s.%s.%s",
                now.get(Calendar.DAY_OF_MONTH),
                now.get(Calendar.MONTH),
                now.get(Calendar.YEAR));
    }

    default String getReleaseDate(){
        return getFormattedCalendarString();
    };
}
