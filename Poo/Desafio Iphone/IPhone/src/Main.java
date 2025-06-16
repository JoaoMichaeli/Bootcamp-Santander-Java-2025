public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Teste de navegador...");
        iphone.openPage("https://www.google.com");
        iphone.newTab();
        iphone.refreshPage();

        System.out.println();

        System.out.println("Teste de ligação...");
        iphone.call("1199999-9999");
        iphone.answerCall();
        iphone.startVoiceMail();

        System.out.println();

        System.out.println("Teste de música...");
        iphone.playMusic();
        iphone.pauseMusic();
        iphone.selectMusic("Shape of You - Ed Sheeran");
    }
}
