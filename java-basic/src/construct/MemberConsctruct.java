package construct;

public class MemberConsctruct {
    String name;
    int age;
    int grade;

    //추가, 생성자 오버로딩
    MemberConsctruct(String name, int age) {
        this(name, age, 10); //자기 자신의 생성자를 호출해줌
    }

    //생성자
    MemberConsctruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name:" + name + " age:" + age + " grade:" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
