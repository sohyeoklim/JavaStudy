package poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {
        //부모변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        //자식의 기능은 사용x
        //poly.childMethod();

        //다운캐스팅(부모 타입에서 -> 자식 타입으로 바꿈)
        Child child = (Child) poly;
        child.childMethod();

        //일시적 다운 캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();
    }
}
