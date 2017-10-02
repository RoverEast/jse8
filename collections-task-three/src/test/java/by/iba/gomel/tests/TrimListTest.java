package by.iba.gomel.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.TrimList;

public class TrimListTest {

    @Test
    public void testTrimList() {
        final TrimList trimList = new TrimList();
        List<String> list = new ArrayList<>();
        list.add("      AAAAA      ");
        list.add("     BBBBBB      ");
        list.add("      CCCCC      ");
        list = trimList.trimList(list);
        Assert.assertEquals("expected --->", "[AAAAA, BBBBBB, CCCCC]", list.toString());

    }

}
