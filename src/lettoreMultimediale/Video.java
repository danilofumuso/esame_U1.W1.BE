package lettoreMultimediale;

public class Video extends ElementoMultimediale implements IPlayable, ILuminosita {
    private int durata;
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata) {
        super(titolo,FileMultimediale.VIDEO);
        this.durata = durata;
        this.volume = 3;
        this.luminosita = 5;
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
    public void alzaLuminosita() {
        if (luminosita > 9) {
            return;
        }

        this.luminosita++;
    }

    @Override
    public void abbassaLuminosita() {
        if (luminosita < 1) {
            return;
        }

        this.luminosita--;
    }

    public int getLuminosita() {

        return luminosita;
    }

    @Override
    public void play() {
        StringBuilder puntoEsclamativo = new StringBuilder();
        for (int i = 0; i < volume; i++) {
            puntoEsclamativo.append("!");

        }

        StringBuilder asterisco = new StringBuilder();
        for (int i = 0; i < luminosita; i++) {
            asterisco.append("*");
        }

        for (int i = 0; i < durata; i++) {
            System.out.println(this.getTitolo() + puntoEsclamativo + asterisco);
        }
    }

    @Override
    public void esegui() {
        play();
    }

}
