import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class Listener implements MessageCreateListener{

    @Override
    public void onMessageCreate(MessageCreateEvent event) {

        if (event.getMessageContent().contains("i love you") || event.getMessageContent().contains("te amo")) {
            event.getChannel().sendMessage("I love you more!");
        }else if(event.getMessageContent().contains("$pinthis")) {
            event.getMessage().pin();
        }
    }
}
