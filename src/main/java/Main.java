import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {

    public static void main(String[] args){
        DiscordApi api = new DiscordApiBuilder().setToken("ODM0Nzk2NDcxNDA0NDYyMTQw.YIGGzA.uKqcWmKVVTciqRpUgprVhjIB84A").login().join();
    }
}
