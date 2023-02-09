import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.Calendar;
import java.util.TimeZone;
import java.text.DateFormat;

public class PhonebookView {

    public static String currentTimestamp() {
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        DateFormat f = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
        return f.format(c.getTime());
    }
    
    public void viewPhonebookInConsole(ArrayList<Phonebook> people){
        Logger logger = Logger.getAnonymousLogger();
        logger.info(currentTimestamp());
        for (Phonebook phonebook : people) {
            logger.info(phonebook.toString());
        }
    }
}
