package by.iba.gomel.tests;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.FilesOperates;

public class FilesOperatesTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testWork() throws IOException {
        final FilesOperates filesOperates = new FilesOperates();
        final String name = "aqe.txt";
        new File(name);

        for (int i = 1; i < 4; i++) {
            switch (i) {
            case 1:

                Assert.assertEquals("expected --->", "ok",
                        filesOperates.createFile(name, "asdads"));

                Assert.assertEquals("expected --->", "not ok",
                        filesOperates.createFile(name, "asdads"));

                break;
            case 3:
                Assert.assertEquals("expected --->", "File deleted",
                        filesOperates.deleteFile(name));

                Assert.assertEquals("expected --->", "File did not deleted",
                        filesOperates.deleteFile(name));

                break;
            case 2:
                Assert.assertEquals("expected --->", "asdads", filesOperates.readFile(name));

                break;
            case 4:
                break;
            }
        }
    }

    @Test
    public void testWorkTwo() throws IOException {
        final FilesOperates filesOperates = new FilesOperates();
        Assert.assertEquals("expected --->", "", filesOperates.readFile("n.txt"));
        Assert.assertEquals("expected --->", "not ok", filesOperates.createFile("name.txt", ""));

    }

}
