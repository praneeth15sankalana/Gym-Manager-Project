public class DefaultMember implements Comparable<DefaultMember> {
    private String MembershipNumber;
    private String Name;
    private String MembershipStartDate;

    public DefaultMember(String MembershipNumber, String Name, String MembershipStartDate) {
        super();
        this.MembershipNumber = MembershipNumber;
        this.Name = Name;
        this.MembershipStartDate = MembershipStartDate;

    }



    public String getMembershipNumber() {
        return MembershipNumber;
    }

    public void setMembershipNumber(String membershipNumber) {
        this.MembershipNumber = membershipNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getMembershipStartDate() {
        return MembershipStartDate;
    }

    public void setMembershipStartDate(String membershipStartDate) {
        this.MembershipStartDate = membershipStartDate;
    }

    @Override
    public int compareTo(DefaultMember o) {
        return this.Name.compareTo(o.getName());
    }
}
