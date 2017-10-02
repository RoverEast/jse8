package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.ArithmeticDemo;

public class ArithmeticDemoTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();
    
    @Test
    public void testMain() {
        ArithmeticDemo.main(new String[] {});
        Assert.assertEquals("32423 string should be in system out", "32423",
                this.log.getLog());
    }
        
    

}
