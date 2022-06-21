import java.util.Scanner;

public class MainMenu {
    private static char menu_value = '-';
    private final static char MENU_ADD_BUTTON = 'a';
    private final static char MENU_EXIT_BUTTON = 'e';
    private final static char MENU_SHOW_MAX_VALUE = 'y';
    private final static char MENU_SHOW_MIN_VALUE = 'u';
    private final static char MENU_SHOW_AVERAGE_VALUE = 'i';

    public static boolean showMenu(MaxMin MyArray) {
        Scanner in = new Scanner(System.in);
        while (menu_value != MENU_EXIT_BUTTON) {
            System.out.println ("[a] Add value \n" +
                    "[y] Show max value \n" +
                    "[u] Show min value \n" +
                    "[i] Show average value \n" +
                    "[e] Close program \n");
            menu_value = in.next().charAt(0);
            switch (menu_value) {
                case (MENU_ADD_BUTTON):
                    System.out.println("Input value: ");
                    MyArray.push(in.nextDouble());
                    break;
                case (MENU_EXIT_BUTTON):
                    return false;
                case (MENU_SHOW_AVERAGE_VALUE):
                    System.out.println("Average value is: " + MyArray.returnAverage());
                    break;
                case (MENU_SHOW_MAX_VALUE):
                    System.out.println("Max value is: " + MyArray.returnMax());
                    break;
                case (MENU_SHOW_MIN_VALUE):
                    System.out.println("Min value is: " + MyArray.returnMin());
                    break;
            }
        }
        return false;
    }

}
