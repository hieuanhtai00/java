import java.util.Scanner;

public class Account {
    private int ID;
    private String name;
    private float balance;

    Account() {
    }

    public void setID(int iD) {
        ID = iD;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public float getBalance() {
        return balance;
    }

    void ShowInformation() {
        System.out.println("ID : " + ID + "\nName : " + name + "\nBalance : " + balance);
    }

    public static void main(String[] args) {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input ID : ");
        account.setID(scanner.nextInt());
        System.out.println("Input Name : ");
        account.setName(scanner.nextLine());
        System.out.println("Input Balance : ");
        account.setBalance(scanner.nextFloat());
        scanner.close();
    }
}
