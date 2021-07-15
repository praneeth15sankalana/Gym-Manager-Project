import java.util.List;

public interface GymManager {
    public void AddMember(DefaultMember Member);
    public boolean deleteMember(String MembershipNumber);
    public void PrintListOfMember();
    public List <DefaultMember> sort();
    public void save();
    public List<DefaultMember> getMemberList();
    public DefaultMember getMemberByMembershipNumber(String MembershipNumber);
    public DefaultMember[] getMemberByName(String Name);


}
