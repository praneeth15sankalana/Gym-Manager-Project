import java.util.List;
import java.util.Scanner;

public class ConsoleUI {

    private static MyGymManager Manager = new MyGymManager();
    private static int Count = 0;


    public static void main(String[] args) {
        while (true) {
            printMembers();
            Scanner input = new Scanner(System.in);

            System.out.println("1 for insert ");
            System.out.println("2 for delete");
            System.out.println("3 for print");
            System.out.println("4 for write");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    insertMember();
                    // Manager.writeData();
                    break;
                case 2:
                    deleteMember();
                    break;
                case 3:
                    Manager.PrintListOfMember();
                    break;
                case 4:
                    Manager.writeData();
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }


    }

    private static void printMembers() {
        List<DefaultMember> members = Manager.getMemberList();
        for (int i = 0; i < members.size(); i++) {
            System.out.println(members.get(i).getName());
        }
    }


    private static void deleteMember() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Membership Number : ");
        String MembershipNumber = input.next();
        boolean result = Manager.deleteMember(MembershipNumber);
        if (result) {

            int count = 0;
            count--;
        }

    }

    private static void insertMember() {

        Scanner input = new Scanner(System.in);

        int count = 0;
        if (count < 100) {

            System.out.println("Enter the Membership Number : ");

            String MembershipNumber = input.next();
            System.out.println("Enter the Name : ");
            String Name = input.next();
            System.out.println("Enter the date in the following format DD/MM/YYYY ; ");

            String MembershipStartDate = input.next();
            System.out.println("Enter the type of membership (1-DefaultMember / 2-StudentMember / 3-over 60 Member) : ");
            String type = input.next();


            DefaultMember Member = null;

            switch (type) {
                case "1":

                    Member = new DefaultMember(MembershipNumber, Name, MembershipStartDate);
                    break;
                case "2":

                    System.out.println("Enter School Name : ");
                    String SchoolName = input.next();
                    Member = new StudentMember(MembershipNumber, Name, MembershipStartDate, SchoolName);
                    break;
                case "3":

                    System.out.println("Enter the Age : ");
                    int Age = input.nextInt();
                    Member = new Over60Member(MembershipNumber, Name, MembershipStartDate, Age);
                    break;
                default:
                    System.out.println("Invalid Input");


            }
            Manager.AddMember(Member);
        } else {
            System.out.println("no free slots");
        }
    }

}

