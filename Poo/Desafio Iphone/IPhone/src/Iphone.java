import interfaces.Browser;
import interfaces.Device;
import interfaces.MusicPlayer;

public class Iphone implements Browser, Device, MusicPlayer  {

    @Override
    public void openPage(String url) {
        System.out.println("Carregando página");
    }

    @Override
    public void newTab() {
        System.out.println("Abrindo nova página");
    }

    @Override
    public void refreshPage() {
        System.out.println("Atualizando página");
    }

    @Override
    public void call(String number) {
        System.out.println("Ligando para " + number);
    }

    @Override
    public void answerCall() {
        System.out.println("Recebendo ligação");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Iniciando mensagem de voz");
    }

    @Override
    public void playMusic() {
        System.out.println("Tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Música pausada");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Tocando: " + music);
    }
}
