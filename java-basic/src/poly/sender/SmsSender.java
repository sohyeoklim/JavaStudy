package poly.sender;

public class SmsSender implements Sender{

    @Override
    public void sendMessage(String message) {
        System.out.println("Sms에 전송합니다:" + message);
    }
}
