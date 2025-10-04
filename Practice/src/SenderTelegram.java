public class SenderTelegram extends Sender{
    @Override
    public boolean send(String to, String msg){
        if (to.startsWith("@")){
            System.out.println("Сообщение: "+msg+" было отправлено "+to+" в телеграме");
            return false;
        }
        return true;
    }
}
