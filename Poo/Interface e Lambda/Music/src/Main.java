public class Main {
    public static void main(String[] args) {
        runMusic(new Computer());
        runVideo(new Computer());
    }

    public static void runVideo(VideoPlayer videoPlayer){
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer){
        musicPlayer.playMusic();
    }
}
