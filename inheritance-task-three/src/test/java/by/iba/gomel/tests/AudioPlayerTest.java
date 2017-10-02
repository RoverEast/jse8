package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.AudioPlayer;

public class AudioPlayerTest {

    @Test
    public void testListenToMusic() {

        final AudioPlayer audioPlayer = new AudioPlayer();
        Assert.assertEquals("expected -->", "play vlc", audioPlayer.listenToMusic("vlc"));
        Assert.assertEquals("expected -->", "play mp3", audioPlayer.listenToMusic("mp3"));
        Assert.assertEquals("expected -->", "play mp4", audioPlayer.listenToMusic("mp4"));
        Assert.assertEquals("expected -->", "undefined type", audioPlayer.listenToMusic("mp5"));
    }
}
