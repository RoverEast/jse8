package by.iba.gomel;

/**
 * MediaPlayer
 */
public class AudioPlayer implements MediaPlayer {

    private final MediaAdapter mediaAdapter = new MediaAdapter();

    /**
     * constructor
     */
    public AudioPlayer() {
        // empty
    }

    /**
     * get
     */
    @Override
    public String get() {
        return null;
    }

    /**
     * listenToMusic
     *
     * @param type
     *            input param
     * @return play type
     */
    public String listenToMusic(final String type) {
        return this.mediaAdapter.adapter(type);
    }

    /**
     * playMusic
     *
     * @return MP3
     */
    @Override
    public String playMusic() {
        return "MP3";
    }
}
