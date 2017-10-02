package by.iba.gomel;

/**
 * MediaAdapter
 */
public class MediaAdapter implements MediaPlayer {

    private final Mp4 mp4 = new Mp4();
    private final Vlc vlc = new Vlc();

    /**
     * constructor
     */
    public MediaAdapter() {
        // empty
    }

    /**
     * adapter
     *
     * @param type
     *            input param
     * @return type
     */
    public final String adapter(final String type) {
        String s;
        if ("mp3".equals(type)) {
            s = this.playMusic();
        } else if ("mp4".equals(type)) {
            s = this.mp4.playMusic();
        } else if ("vlc".equals(type)) {
            s = this.vlc.playMusic();
        } else {
            s = "undefined type";
        }
        return s;
    }

    /**
     * get
     */
    @Override
    public String get() {
        return null;
    }

    /**
     * playMusic
     */
    @Override
    public String playMusic() {
        return "play mp3";
    }
}
