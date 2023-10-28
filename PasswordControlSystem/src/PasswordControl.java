import java.util.ArrayList;

public class PasswordControl {
    private final ArrayList<Integer> queue = new ArrayList<>();
    private final ArrayList<Integer> preferencialQueue = new ArrayList<>();
    private int nextPasswordNumber = 1;
    private int age;
    private int preferencialCounter;

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public int getPreferencialCounter() {
        return this.preferencialCounter;
    }
    public void emitNewPassword() {
        int newPassword = nextPasswordNumber;
        int clientAge = getAge();
        nextPasswordNumber++;

        if (clientAge < 60)
            queue.add(newPassword);
        else
            preferencialQueue.add(newPassword);

        System.out.println("New password: " + newPassword);
    }

    public void giveUpQueue(int password) {
        if (queue.contains(password)) {
            queue.remove((Integer) password);
            System.out.println("Password " + password + " removed.");
        } else if (preferencialQueue.contains(password)) {
            preferencialQueue.remove((Integer) password);
            System.out.println("Password " + password + " removed.");
        } else {
            System.out.println("Password not found.");
        }
    }

    public void preferencialNext() {
        if (preferencialCounter >= 2) {
            serverNext();
        }
        else {
            if (!preferencialQueue.isEmpty()) {
                int nextPassword = preferencialQueue.get(0);
                preferencialQueue.remove(0);
                System.out.println("Next password: " + nextPassword);
                preferencialCounter++;
            }
            else {
                serverNext();
            }
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

    public void findPasswordPosition(Integer password) {
        if (password == null) {
            System.out.println("The given password does not exist. Type a valid password.");
            return;
        }
        int position = queue.indexOf(password) + 1;
        System.out.println("The password " + password + " is current in the position " + position + " in the line.");

    }

    public void printPasswordQueue() {
        System.out.println("Currently passwords in the line: ");

        if (this.preferencialCounter < 2) {
            for (int c = 0; c < 2; c++) {
                int preferencialPassword = preferencialQueue.get(c);
                System.out.print(preferencialPassword);

                if (!queue.isEmpty())
                {
                    System.out.print(", ");
                }
            }
        }
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
