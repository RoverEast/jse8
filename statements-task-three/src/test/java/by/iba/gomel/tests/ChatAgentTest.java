package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.ChatAgent;

public class ChatAgentTest {

    @Test
    public void testReply() {
        ChatAgent agent1 = new ChatAgent();
        ChatAgent agent2 = new ChatAgent();
        String mes = "Hi";
        while(!mes.endsWith("bye")){
            mes = agent1.reply(mes);
            if(mes.endsWith("bye")){
                break;
            }
            mes = agent2.reply(mes);
            if(mes.endsWith("bye")){
                break;
            }
        }
        Assert.assertTrue("mes should = bye",mes.endsWith("bye"));
    }

}
