import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String,String>();
        trackList.put("Diamonds","Shine bright like a diamond");
        trackList.put("Umbrella","No clouds in my stones");
        trackList.put("The Monster","I am friend with the monster that's under my bad");
        trackList.put("We Found Love","Yellow diamonds in the light");
        String title = trackList.get("Diamonds");
        System.out.println(title);
        Set<String> tracks = trackList.keySet();
        for(String track: tracks){
            System.out.println(track + ": " + trackList.get(track));

        }
    }

}
