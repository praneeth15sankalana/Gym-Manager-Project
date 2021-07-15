
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyGymManager implements GymManager {

    private List<DefaultMember> MemberList = new ArrayList<DefaultMember>();
    private Object Member;

    public List<DefaultMember> getMembers(){
        return this.MemberList;
    }


    @Override
    public void AddMember(DefaultMember Member) {
        System.out.println("No of occupied slots : "+MemberList.size());
        System.out.println("No of free slots : "+(100 - MemberList.size()));

        if ( MemberList.size() < 100){
            MemberList.add(Member);
        } else {
            System.out.println("No free slot are available for new member");
        }

    }




    @Override
    public boolean deleteMember(String MembershipNumber) {
        boolean flag = false;
        for (DefaultMember Member : MemberList) {
            if (Member.getMembershipNumber().equals(MembershipNumber)) {
                flag = true;
                MemberList.remove(Member);
                System.out.println("Member with the Membership Number " + MembershipNumber + "Successfully removed.");
                System.out.println("No of occupied slots : " + MemberList.size());
                System.out.println("No of free slots : " + (100 - MemberList.size()));
                if (Member instanceof StudentMember) {
                    System.out.println("Member type is : StudentMember");

                } else if (Member instanceof Over60Member) {
                    System.out.println("Member type is : Over 60 Member");

                } else {
                    System.out.println("Member type is : Default Member");
                }
                break;
            }
        }
        if (!flag) {
            System.out.println("Not found");
        }

        return flag;
    }

    void writeData() {
        System.out.println("Write Data");
        System.out.println(MemberList.size());

        try {

            FileWriter writer = new FileWriter("Member Details.txt");

            for (DefaultMember Member : MemberList) {
                System.out.println("MembershipNumber");
                System.out.println(Member.getMembershipNumber());
                //writer.write("Membership Number : "+Member.getMembershipNumber()+"\n");
                writer.append("Membership Number : ").append(Member.getMembershipNumber()).append("\n");
                if (Member instanceof StudentMember){
                    writer.write("Membership type is : StudentMember \n" );

                }else if (Member instanceof Over60Member){
//                    writer.write("Membership type is : Over 60 Member \n");
                    writer.append("Membership type is : Over 60 Member \n");

                }else {
//                    writer.write("Membership type is : Default Member \n");
                    writer.append("Membership type is : Over 60 Member \n");
                }
//                writer.write("Name is : "+Member.getName() + "\n");
                writer.append("Name is : ").append(Member.getName()).append("\n");
//                writer.write("Membership start date is : "+Member.getMembershipStartDate() + "\n");
                writer.append("Membership start date is : ").append(Member.getMembershipStartDate()).append("\n");

            }
            if (MemberList.size()==0){
                System.out.println("Empty List");
            }

            writer.close();

            System.out.println("Data Wrote Successfully");

        } catch (IOException e) {
            System.out.println("An Error Occurred");
            e.printStackTrace();
        }

    }


    @Override
    public void PrintListOfMember() {
        for (DefaultMember Member : MemberList) {
            System.out.println("Membership Number : "+Member.getMembershipNumber()+"");
            if (Member instanceof StudentMember){
                System.out.println("Membership type is : StudentMember " );

            }else if (Member instanceof Over60Member){
                System.out.println("Membership type is : Over 60 Member ");

            }else {
                System.out.println("Membership type is : Default Member ");
            }
            System.out.println("Name is : "+Member.getName());
            System.out.println("Membership start date is : "+Member.getMembershipStartDate());

        }
        if (MemberList.size()==0){
            System.out.println("Empty List");
        }


    }
    @Override
    public List<DefaultMember> sort() {
        DefaultMember[] arr = MemberList.toArray(new DefaultMember[] {});
        bubbleSort.bubbleSort(arr, true);
        List<DefaultMember> sortedList= Arrays.asList(arr);

        return sortedList;




    }

    @Override
    public void save() {
        if (MemberList.size() != 0){

        }else {
            System.out.println("Empty List nothing to save");
        }


    }

    @Override
    public List<DefaultMember> getMemberList() {
        return this.MemberList;
    }

    @Override
    public DefaultMember getMemberByMembershipNumber(String MembershipNumber) {
        return null;
    }

    @Override
    public DefaultMember[] getMemberByName(String Name) {
        return new DefaultMember[0];
    }
}
