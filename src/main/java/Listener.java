
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;
import java.awt.*;
import java.io.File;

public class Listener implements MessageCreateListener {

    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        if (event.getMessageContent().equalsIgnoreCase("$help")){
            EmbedBuilder embed = new EmbedBuilder()
                    .setTitle("test")
                    .setDescription("Description")
                    .setAuthor("Author Name")
                    .addField("A field", "Some text inside the field");
            event.getChannel().sendMessage(embed);
        }
    }
}
