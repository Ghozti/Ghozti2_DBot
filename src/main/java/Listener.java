import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;
import java.util.Random;

public class Listener implements MessageCreateListener{

    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        Random r =  new Random();

        if (event.getMessageContent().contains("i love you") || event.getMessageContent().contains("te amo")){
            event.getChannel().sendMessage("I love you more!");
        }else if (event.getMessageContent().equalsIgnoreCase("what if we have kids")){
            event.getChannel().sendMessage("https://tenor.com/view/anakin-starwars-darthvader-gif-5533636");
        }else if(event.getMessageContent().equalsIgnoreCase("who is the biggest man child")){
            event.getChannel().sendMessage("https://youtu.be/WseRL9HUxH4");
        }else if(event.getMessageContent().equalsIgnoreCase("raid")){
            for (int i = 0; i < 100; i++) {
                event.getChannel().sendMessage("<@!" + 346797722893811713l + ">");
            }
        }else if (event.getMessageContent().equalsIgnoreCase("and then")){
            event.getChannel().sendMessage("https://youtu.be/qJENLlun5Ts");
        }else if (event.getMessageContent().equalsIgnoreCase("-kill")){
            event.getChannel().sendMessage("ok");
            System.exit(0);
        }

        if (event.getMessageContent().equalsIgnoreCase("tell me a fact")) {
            int i = r.nextInt(21 - 1) + 1;

            switch (i) {
                case 1:
                    event.getChannel().sendMessage("I love you!");
                    break;
                case 2:
                    event.getChannel().sendMessage("epstein did not kill himself");
                    break;
                case 3:
                    event.getChannel().sendMessage("apple is dog shit");
                    break;
                case 4:
                    event.getChannel().sendMessage("mac OS is a joke");
                    break;
                case 5:
                    event.getChannel().sendMessage("linux is for computer neckbeards");
                    break;
                case 6:
                    event.getChannel().sendMessage("anime is garbage");
                    break;
                case 7:
                    event.getChannel().sendMessage("windows is for those who fear linux");
                    break;
                case 8:
                    event.getChannel().sendMessage("the younglings deserved it");
                    break;
                case 9:
                    event.getChannel().sendMessage("ahsoka is not a jedi");
                    break;
                case 10:
                    event.getChannel().sendMessage("rey is not a skywalker");
                    break;
                case 11:
                    event.getChannel().sendMessage("android users never shut up about them being better");
                    break;
                case 12:
                    event.getChannel().sendMessage("iphone users will never get freedom");
                    break;
                case 13:
                    event.getChannel().sendMessage("graphics cards will never come back in stock");
                    break;
                case 14:
                    event.getChannel().sendMessage("AMD is better");
                    break;
                case 15:
                    event.getChannel().sendMessage("fortnite is dead");
                    break;
                case 16:
                    event.getChannel().sendMessage("we will never be unbanned from hypixel");
                    break;
                case 17:
                    event.getChannel().sendMessage("the hive is never coming back");
                    break;
                case 18:
                    event.getChannel().sendMessage("britney is the perfect girlfriend");
                    break;
                case 19:
                    event.getChannel().sendMessage("among us is bad");
                    break;
                case 20:
                    event.getChannel().sendMessage("we will not have kids");
                    break;
            }
        }
    }
}
