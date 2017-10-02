package by.iba.gomel;

import java.security.SecureRandom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * chat agent class
 */
public class ChatAgent {

    /**
     * Logger.
     * 
     * For future reference - comments on purpose of specific field should go here.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(ChatAgent.class);
    private static String[]     quests = {"q1?", "q2?", "q3?"};
    private static String[]     ans    = {"a1", "a2", "bye"};
    private static final int NUMSOFQNA = 3;
    

    /**
     * empty constructor
     */
    public ChatAgent() {
        // empty
    }

    /**
     * reply class
     * 
     * @param phrase
     *            input message
     * @return message
     */
    public final String reply(String phrase) {
        String       s;
        int          i;
        final SecureRandom r = new SecureRandom();
        if (phrase.endsWith("?")) {
            i = r.nextInt(NUMSOFQNA);
            s = ans[i];
            ChatAgent.LOGGER.info(ans[i]);
        } else {
            i = r.nextInt(NUMSOFQNA);
            s = quests[i];
            ChatAgent.LOGGER.info(quests[i]);
        }
        return s;
    }
}
