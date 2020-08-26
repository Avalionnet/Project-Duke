package duke.Ui;

import duke.Tasks.Task;

import java.util.Scanner;

/**
 * Contains and executes all user interaction methods.
 */
public class Ui {

    /** Takes in user commands from the command line. */
    private Scanner sc;

    /**
     * Initialises the Ui object.
     */
    public Ui() {
        this.sc = new Scanner(System.in);
    }

    /** Reads a line of user input. */
    public String readCommand() {
        return this.sc.nextLine();
    }

    /** Prints welcome message. */
    public void showWelcome() {
        String logo = "     ____        _        \n"
                + "    |  _ \\ _   _| | _____ \n"
                + "    | | | | | | | |/ / _ \\\n"
                + "    | |_| | |_| |   <  __/\n"
                + "    |____/ \\__,_|_|\\_\\___|\n";
        System.out.println("    Welcome to \n" + logo + "\n    Your personal assistant :)");
        showLine();
        showLine();
    }

    /** Prints a breakLine. */
    public void showLine() {
        System.out.println("    ______________________________________________________");
    }

    /** Prints loading error.
     * @param error error message.
     */
    public void showLoadingError(String error) {
        System.out.println(error);
    }

    /**
     * Prints duke exception error message.
     * @param error Duke exception message.
     */
    public void showError(String error) {
        System.out.println(error);
    }

    /** Prints exit statement. */
    public void showExit() {
        System.out.println("    Bye. Hope to see you again soon!");
    }

    /**
     * Print task description.
     * @param counter Index of the task in the list.
     * @param task The task to print.
     */
    public void printTask(int counter, Task task) {
        System.out.println("    " + counter + ": " + task.toString());
    }

    /**
     * Prints the add task message.
     * @param listSize The size of the task list.
     * @param task The task to add into the list.
     */
    public void addTask(int listSize, Task task) {
        System.out.println("    Got it. I've added this task: \n     " + task.toString());
        System.out.println("    Now you have " + listSize + " tasks in the list.");
    }

    /**
     * Prints the done message.
     * @param task The task that is completed.
     */
    public void markDone(Task task){
        System.out.println("    Nice! I've marked this task as done:");
        System.out.println("    " + task.toString());
    }

    /**
     * Prints the delete message.
     * @param listSize The size of the task list.
     * @param task The task to delete from the list.
     */
    public void markDelete(int listSize,Task task){
        System.out.println("    Noted. I've removed this task:");
        System.out.println("    " + task.toString());
        System.out.println("    Now you have " + listSize + " tasks in the list.");
    }

}
