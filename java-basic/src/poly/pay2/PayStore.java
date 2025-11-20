package poly.pay2;

//결제수단을 보관하고 관리
//객체 생성을 불가능하게 하기위해 추상으로 선언
public abstract class PayStore {

    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("kb")) {
            return new KbPay();
        } else {
            return new DefaultPay();
        }
    }
}
