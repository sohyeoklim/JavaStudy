package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConsctruct member1 = new MemberConsctruct("user1", 15, 90);
        MemberConsctruct member2 = new MemberConsctruct("user2", 16);

        MemberConsctruct[] members = {member1, member2};

        for (MemberConsctruct member : members) {
            System.out.println("이름:" + member.name + " 나이:" + member.age + " 성적:" + member.grade);
        }
    }
}
