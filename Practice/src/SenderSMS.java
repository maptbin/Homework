public class SenderSMS extends Sender {
    @Override
    public boolean send(String to, String msg){
        if (to.startsWith("+375")){
            System.out.println("Сообщение: "+msg+" было отправлено "+to+" по смс.");
        }else {
            return false;
        }
        return true;
    }
}

