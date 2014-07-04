/**
 * Created by yuyutsu on 7/4/14.
 */
import com.techventus.server.voice.Voice
import com.techventus.server.voice.datatypes.Phone;

class GoogleVoiceHelper {

    static void main(String[] args) {
        String gmailId = args[0]
        String password = args[1]
        String googleVoiceNumber = args[2];
        String callingNumber = args[3]
        Voice voice = new Voice(gmailId, password);

        String response = voice.call(callingNumber, googleVoiceNumber, "1") //1 = Home Type
        println "response = $response"
    }
}
