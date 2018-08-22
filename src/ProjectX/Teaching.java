package ProjectX;

public class Teaching {

    private static final String INVALID_VALUE_MESSAGE = "Error....";

    public static void main(String[] args) {

        System.out.println(getDurationString(1, 60));
        System.out.println(getDurationString(105));

    }

    private static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60L;
        long minutesLeft = minutes % 60;

        String displayHours = hours + " h";
        String displayMinutes = minutes + " m";
        String displaySeconds = seconds + " s";


        return displayHours + displayMinutes + displaySeconds;
    }

    public static String getDurationString(long seconds) {

        if (seconds < 0) {
            return ("Invalid value");
        }
        long minutes = seconds/60;
        long secondsLeft = seconds - (minutes * 60);

        return getDurationString(minutes, secondsLeft);
    }
}

