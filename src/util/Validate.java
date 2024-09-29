package util;

import java.util.Scanner;
import constant.IConstant;

/**
 * The Validate class provides methods for validating user input.
 */
public class Validate {

    /**
     * A Scanner instance for reading user input from the console.
     */
    private static final Scanner sc = new Scanner(System.in);

    /**
     * Validates and retrieves a string input.
     *
     * @param msgInfo The prompt message for the user.
     * @param msgError The error message if input is not valid.
     * @param regex The regular expression for user to to validate the input
     * string.
     * @return The validated string input.
     */
    public static String getString(
            String msgInfo,
            String regex
    ) {
        String input;
        while (true) {
            System.out.println(msgInfo);
            input = sc.nextLine();
            if (input.matches(regex)) {
                return input;
            }
        }
    }

    /**
     * Validates and retrieves an integer input within a specified range.
     *
     * @param msgInfo The prompt message for the user.
     * @param msgErrorOutOfRange The error message if input is out of range.
     * @param msgErrorInvalidFormat The error message if input is not a number
     * or is empty.
     * @param min The minimum value allowed.
     * @param max The maximum value allowed.
     * @return The validated integer input.
     */
    public static Integer getInt(
            String msgInfo,
            String msgErrorOutOfRange,
            String msgErrorInvalidFormat,
            int min, int max) {
        while (true) {
            try {
                System.out.println(msgInfo);
                int result = Integer.parseInt(sc.nextLine());
                if (result < min || result > max) {
                    System.out.println(msgErrorOutOfRange);
                    continue;
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println(msgErrorInvalidFormat);
            }
        }
    }

    /**
     * Validates and retrieves a boolean input when user continue to create
     * student or not.
     *
     * @param msgInfo The prompt message for the user.
     * @param msgError The error message if input is not valid.
     * @param choiceYes boolean is true in case user want to continue create
     * student
     * @param choiceNo otherwise in case user want to stop creating
     * @param regex The regular expression to validate the input string.
     * @return The validated boolean input.
     */
    public static boolean isContinue(
            String msgInfo,
            String choiceYes,
            String choiceNo,
            String regex) {
        // lặp cho đến khi người dùng nhập đúng
        while (true) {
              System.out.println(msgInfo);
            String input = sc.nextLine();
            if (input.matches(regex)) {
                if (input.equalsIgnoreCase(choiceYes)) {
                    return true;
                }
                if (input.equalsIgnoreCase(choiceNo)) {
                    return false;
                }
            }
        }
    }

    /**
     * Validates and retrieves a boolean input to determine if the user wants to
     * update the student information.
     *
     * @param msgInfo The prompt message for the user.
     * @param msgError The error message if input is not valid.
     * @param choiceUpdate boolean is true in case user's choice is to update
     * student
     * @param choiceDelete otherwise in case user's choice is to delete student
     * @param regex The regular expression to validate the input string.
     * @return The validated boolean input.
     */
    public static String getChoice(
            String msgInfo,
            String choiceUpdate,
            String choiceDelete,
            String regex) {
        while (true) {
            System.out.println(msgInfo);
            String input = sc.nextLine();
            if (input.matches(regex)) {
                if (input.equalsIgnoreCase(choiceUpdate)) {
                    return IConstant.UPDATE;
                }
                if (input.equalsIgnoreCase(choiceDelete)) {
                    return IConstant.DELETE;
                }
            }
        }
    }
}
