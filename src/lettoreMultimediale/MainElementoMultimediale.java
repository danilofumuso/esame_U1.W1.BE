package lettoreMultimediale;

import java.util.ArrayList;
import java.util.Scanner;

public class MainElementoMultimediale {
    public static void main(String[] args) {

        // Creo gli elementi multimediali con lo scanner e li aggiungo all'arrayList elementi

        ArrayList<ElementoMultimediale> elementi = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean crea = true;

        while (crea) {

            System.out.println("Che tipo di elemento multimediale vuoi creare? (audio/video/immagine)");
            String tipo = scanner.nextLine().toLowerCase();

            switch (tipo) {
                case "audio":
                    System.out.print("Inserisci il titolo dell'audio: ");
                    String titoloAudio = scanner.nextLine();
                    System.out.print("Inserisci la durata in secondi: ");
                    int durataAudio = scanner.nextInt();
                    scanner.nextLine(); //inserito perché si buggava lo scanner!

                    RegistrazioneAudio audio = new RegistrazioneAudio(titoloAudio, durataAudio);
                    //I valori di luminosità e volume sono impostati ad un valore di base, non sono parametri del costruttore!
                    // Se volessi modificarne il valore fallo qui!

                    audio.alzaVolume();
                    audio.alzaVolume();
                    audio.alzaVolume();

                    elementi.add(audio);
                    break;

                case "video":
                    System.out.print("Inserisci il titolo del video: ");
                    String titoloVideo = scanner.nextLine();
                    System.out.print("Inserisci la durata in secondi: ");
                    int durataVideo = scanner.nextInt();
                    scanner.nextLine(); //inserito perché si buggava lo scanner!

                    Video video = new Video(titoloVideo, durataVideo);
                    video.abbassaLuminosita();
                    video.abbassaLuminosita();
                    video.alzaVolume();
                    video.alzaVolume();
                    video.alzaVolume();
                    video.alzaVolume();
                    video.alzaVolume();
                    video.alzaVolume();
                    video.alzaVolume();

                    elementi.add(video);
                    break;

                case "immagine":
                    System.out.print("Inserisci il titolo dell'immagine: ");
                    String titoloImmagine = scanner.nextLine();

                    Immagine immagine = new Immagine(titoloImmagine);

                    immagine.abbassaLuminosita();
                    immagine.alzaLuminosita();
                    immagine.alzaLuminosita();
                    immagine.alzaLuminosita();
                    immagine.alzaLuminosita();

                    elementi.add(immagine);
                    break;

                default:
                    System.out.println("Tipo non riconosciuto, inseriscine uno valido!");
                    continue;
            }


            System.out.print("Vuoi aggiungere un altro elemento? (si/no): ");
            String risposta = scanner.nextLine().toLowerCase();
            if (risposta.equals("no")) {
                crea = false;
            }
        }

        System.out.println("****************************");
        System.out.println("Lista Elementi Disponibili!");
        for (int i = 0; i < elementi.size(); i++) {
            System.out.println("Elemento Multimediale " + (i + 1) + ": " + elementi.get(i).getTitolo() + " Tipo: " + elementi.get(i).getFileMultimediale());
        }
        System.out.println("****************************");

        //Ciclo per stampare l'elemento riprodotto

        while (true) {
            System.out.println("Inserisci il numero dell'elemento della lista per riprodurlo, 0 per terminare!");
            int riprodotto = scanner.nextInt();

            if (riprodotto > elementi.size()) {
                System.out.println("Elemento Multimediale non trovato!");
            } else if (riprodotto > 0) {
                elementi.get(riprodotto - 1).esegui();
            } else {
                System.out.println("Arrivederci, grazie per aver utilizzato il nostro lettore multimediale!");
                break;
            }
        }

        scanner.close();

    }
}
