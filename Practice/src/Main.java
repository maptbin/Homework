public class Main {
    public static void main(String[] args) {
        String to = "+375299739992";
        String msg = "Это техническое сообщение. Не отвечайте на него";

        Sender sSMS = new SenderSMS();
        Sender sEmail = new SenderEmail();
        Sender sTg = new SenderTelegram();

        Sender[] senders = {sSMS, sEmail, sTg};

        for (Sender sender:senders){
            sender.send(to, msg);
        }

    }
}