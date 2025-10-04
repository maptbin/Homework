public class SenderEmail extends Sender {
    @Override
    public boolean send(String to, String msg){
        if (to.endsWith("@gmail.com")){
            System.out.println("Сообщение: "+msg+" было отправлено "+to+" по Email.");
            return false;
        }
        return true;
    }

}
