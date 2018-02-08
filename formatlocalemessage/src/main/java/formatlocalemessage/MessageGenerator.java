package formatlocalemessage;

import java.text.MessageFormat;

public class MessageGenerator {

    public String generateForecastText(String str, int temp, String locaton){
        return MessageFormat.format("Tomorrow expect {0} with {1} \u00B0C temperature in {2}.",str,temp,locaton);
    }

    public String generateLotteryAnnouncement(String name){
        String template = "Yesterday %s won a staggering sum of %d M";
        return String.format(template,name,500);
    }

}
