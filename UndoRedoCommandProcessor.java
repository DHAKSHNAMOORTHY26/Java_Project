import java.util.*;

public class UndoRedoCommandProcessor {

    // Command history
    private static Stack<String> undoStack = new Stack<>();
    private static Deque<String> redoStack = new ArrayDeque<>();

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            printMenu();
            int choice = getChoice();

            switch (choice) {
                case 1:
                    executeCommand();
                    break;
                case 2:
                    undo();
                    break;
                case 3:
                    redo();
                    break;
                case 4:
                    viewHistory();
                    break;
                case 5:
                    System.out.println("Exiting Undo-Redo Processor.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // ---------------- MENU ----------------

    private static void printMenu() {
        System.out.println("\n=== Undo-Redo Command Processor ===");
        System.out.println("1. Execute Command");
        System.out.println("2. Undo");
        System.out.println("3. Redo");
        System.out.println("4. View History");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");
    }

    private static int getChoice() {
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Enter valid number: ");
        }
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }

    // ---------------- CORE LOGIC ----------------

    private static void executeCommand() {
        System.out.print("Enter command: ");
        String command = sc.nextLine().trim();

        if (command.isEmpty()) {
            System.out.println("Empty command ignored.");
            return;
        }

        undoStack.push(command);

        // New command invalidates redo history
        redoStack.clear();

        System.out.println("Command executed: " + command);
    }

    private static void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo.");
            return;
        }

        String command = undoStack.pop();
        redoStack.push(command);

        System.out.println("Undo → " + command);
    }

    private static void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo.");
            return;
        }

        String command = redoStack.pop();
        undoStack.push(command);

        System.out.println("Redo → " + command);
    }

    private static void viewHistory() {
        System.out.println("\n--- Undo Stack (Latest on Top) ---");
        if (undoStack.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (int i = undoStack.size() - 1; i >= 0; i--) {
                System.out.println(undoStack.get(i));
            }
        }

        System.out.println("\n--- Redo Stack (Latest on Top) ---");
        if (redoStack.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (String cmd : redoStack) {
                System.out.println(cmd);
            }
        }
    }
}
