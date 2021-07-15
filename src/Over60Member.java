public class Over60Member extends DefaultMember {

    private int Age;


    public Over60Member(String MembershipNumber, String Name, String MembershipStartDate, int Age) {
        super(MembershipNumber, Name, MembershipStartDate);
        setAge(Age);
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        if (Age >= 60) {
            this.Age = age;
        }else {
            System.out.println("Invalid age for a Over 60 Member.");
        }
    }
}
