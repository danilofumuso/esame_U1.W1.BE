package lettoreMultimediale;

public abstract class ElementoMultimediale {
    private final String titolo;
    private final FileMultimediale fileMultimediale;

    public ElementoMultimediale(String titolo, FileMultimediale fileMultimediale) {
        this.titolo = titolo;
        this.fileMultimediale =fileMultimediale;
    }

    public String getTitolo() {
        return titolo;
    }

    public FileMultimediale getFileMultimediale() {
        return fileMultimediale;
    }

    public abstract void esegui();

}
