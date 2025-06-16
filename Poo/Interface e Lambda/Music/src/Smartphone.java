public class Smartphone implements VideoPlayer, MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("O celular está tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O celular está pausando música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O celular está parando música");
    }

    @Override
    public void playVideo() {
        System.out.println("O celular está reproduzindo vídeo");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O celular está pausando vídeo");
    }

    @Override
    public void stopVideo() {
        System.out.println("O celular está parando vídeo");
    }
}
