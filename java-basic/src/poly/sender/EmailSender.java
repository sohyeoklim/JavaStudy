package poly.sender;

public class EmailSender implements Sender{

    @Override
    public void sendMessage(String message) {
        System.out.println("메일을 전송합니다:" + message);
    }
}
