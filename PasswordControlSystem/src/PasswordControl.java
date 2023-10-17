import java.util.ArrayList;

public class PasswordControl {
    private final ArrayList<Integer> queue = new ArrayList<>();
    private int nextPasswordNumber = 1;

    public void emitNewPassword() {
        int newPassword = nextPasswordNumber;
        nextPasswordNumber++;
        queue.add(newPassword);
        System.out.println("New password: " + newPassword);
    }

    public void giveUpQueue(int password) {
        if (queue.contains(password)) {
            queue.remove((Integer) password);
            System.out.println("Password " + password + " removed.");
        }
        else {
            System.out.println("Password not found.");
        }
    }

    public void serverNext() {
        if (!queue.isEmpty()) {
            int nextPassword = queue.get(0);
            queue.remove(0);
            System.out.println("Next password: " + nextPassword);
        }
        else {
            System.out.println("The password line is currently empty.");
        }
    }

    public int findPasswordPosition(Integer password) {
        if (password == null) {
            System.out.println("The given password does not exist. Type a valid password.");
            return -1;
        }
        int position = queue.indexOf(password) + 1;
        System.out.println("The password " + password + " is current in the position " + position + " in the line.");

        return 0;
    }

    public void printPasswordQueue() {
        System.out.println("Currently passwords in the line: ");

        for (int i = 0; i < queue.size(); i++) {
            int password = queue.get(i);
            System.out.print(password);

            if (i < queue.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
