public class MusicBox implements MusicPlayer{

    @Override
    public void playMusic() {
        System.out.println("A music box está tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("A music box está pausando música");
    }

    @Override
    public void stopMusic() {
        System.out.println("A music box está parando música");
    }
}
