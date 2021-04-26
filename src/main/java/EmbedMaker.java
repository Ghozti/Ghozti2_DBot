import org.javacord.api.entity.message.embed.Embed;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import java.awt.*;
import java.io.File;

public class EmbedMaker {

    public void createEmbed(String title, String des, String author, String authorLink1 , String authorLink2, String field, String fieldText, String inlineField, String inlineFieldText,
                            String inlineField2, String inlineText2, Color color, String footerName, String footerlink, File image, File thumbnail){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle(title);
        builder.setDescription(des);
        builder.setAuthor(author,authorLink1,authorLink2);
        builder.addField(field,fieldText);
        builder.addInlineField(inlineField,inlineFieldText);
        builder.addInlineField(inlineField2,inlineText2);
        builder.setColor(color);
        builder.setFooter(footerName,footerlink);
        builder.setImage(image);
        builder.setThumbnail(thumbnail);
    }
}
