package MyProject;

public class Switch {

    public static final String ERROR_MESSAGE = "Невозможно посчитать письки и пуканы";

    public static void main(String[] args) {

        System.out.println(showLigusha(-1,3));


    }

    public static String showLigusha (int X, int pukan) {
        if ((piska < 0 ) || (pukan < 0)) {
            return ERROR_MESSAGE;
        }
            String displayPiska = " " + piska + " ";
            String displayPukan = " " + pukan + " ";

            return ("У лягушки писек:" + displayPiska + " и пуканов:" + displayPukan);
        }
    }
