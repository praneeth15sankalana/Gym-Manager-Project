public class StudentMember extends DefaultMember {
    private  String SchoolName;

    public StudentMember(String MembershipNumber, String Name, String MembershipStartDate, String SchoolName) {
        super(MembershipNumber, Name, MembershipStartDate);
        this.SchoolName = SchoolName;

    }





    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        this.SchoolName = schoolName;
    }
}
