package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Converter;

public class ConverterTest {

    @Test
    public void testConvert() {
        Converter c1 =  new Converter(44);
        Assert.assertEquals("return type","int", c1.toString() );
        
        Converter c2 =  new Converter((byte)44);
        Assert.assertEquals("return type","byte", c2.toString() );
        
        Converter c3 =  new Converter(44f);
        Assert.assertEquals("return type","float", c3.toString() );
        
        Converter c4 =  new Converter(44d);
        Assert.assertEquals("return type","double", c4.toString() );
        
        Converter c5 =  new Converter(44L);
        Assert.assertEquals("return type","long", c5.toString() );
        
        Converter c6 =  new Converter((short)44);
        Assert.assertEquals("return type","short", c6.toString() );
        
        Converter c7 =  new Converter('c');
        Assert.assertEquals("return type","char", c7.toString() );
        
        Converter c8 =  new Converter("44");
        Assert.assertEquals("return type","string", c8.toString() );
        
        Converter c9 =  new Converter(44);
        Assert.assertEquals("return type","int", c9.toString() );
        
        c1.nothing();
    
    }
}
