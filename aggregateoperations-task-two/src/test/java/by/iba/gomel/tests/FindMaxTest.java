package by.iba.gomel.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.FindMax;

public class FindMaxTest {

    @Test
    public void testFindMax() {
        final FindMax findMax = new FindMax();
        final List<String> i = new ArrayList<>();
        i.add("a12");
        i.add("b11");
        i.add("c");
        i.add("aaa10sff");

        Assert.assertEquals("expected --->", "[a12]", findMax.findMax(i));
    }

}
