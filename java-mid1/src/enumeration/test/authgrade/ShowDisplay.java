package enumeration.test.authgrade;

public class ShowDisplay {

    public static void showdiplay(String inputGrade, AuthGrade authgrade) {
        System.out.println("당신의 등급은 " + authgrade.getDescription() + "입니다");
        System.out.println("==메뉴 목록==");

        if(inputGrade.equals(AuthGrade.GUEST.name())) {
            System.out.println("-메인 화면");
        } else if(inputGrade.equals(AuthGrade.LOGIN.name())) {
            System.out.println("-메인 화면");
            System.out.println("-이메일 관리 화면");
        } else if(inputGrade.equals(AuthGrade.ADMIN.name())) {
            System.out.println("-메인 화면");
            System.out.println("-이메일 관리 화면");
            System.out.println("-관리자 화면");
        } else {
            System.out.println("잘못 입력하였습니다");
        }
    }
}
