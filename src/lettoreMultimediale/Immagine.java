package lettoreMultimediale;

public class Immagine extends ElementoMultimediale implements ILuminosita {
    private int luminosita;

    public Immagine(String titolo) {
        super(titolo,FileMultimediale.IMMAGINE);
        this.luminosita = 5;
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

    public void show() {
        StringBuilder asterisco = new StringBuilder();
        for (int i = 0; i < luminosita; i++) {
            asterisco.append("*");
        }

        System.out.println(this.getTitolo() + asterisco);
    }

    @Override
    public void esegui() {
        show();
    }
}
