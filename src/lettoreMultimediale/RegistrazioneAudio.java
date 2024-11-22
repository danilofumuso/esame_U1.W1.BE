package lettoreMultimediale;

public class RegistrazioneAudio extends ElementoMultimediale implements IPlayable {
    private int durata;
    private int volume;

    public RegistrazioneAudio(String titolo, int durata) {
        super(titolo,FileMultimediale.AUDIO);
        this.durata = durata;
        this.volume = 3;
    }

    @Override
    public void alzaVolume() {
        if (volume > 9) {
            return;
        }

        this.volume++;
    }

    @Override
    public void abbassaVolume() {
        if (volume < 1) {
            return;
        }

        this.volume--;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void play() {
        StringBuilder puntoEsclamativo = new StringBuilder();
        for (int i = 0; i < volume; i++) {
            puntoEsclamativo.append("!");
        }

        for (int i = 0; i < durata; i++) {
            System.out.println(this.getTitolo() + puntoEsclamativo);
        }

    }

    @Override
    public void esegui() {
        play();
    }
}
