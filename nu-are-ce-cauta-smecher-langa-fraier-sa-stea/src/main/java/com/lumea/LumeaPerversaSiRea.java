package com.lumea;

import com.lumea.banetu.Bani;
import com.lumea.fraierii.Fraieru;
import com.lumea.smecherii.Golanu;
import com.lumea.smecherii.Smecherasu;
import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.net.URL;

public class LumeaPerversaSiRea extends Application {
    private MediaPlayer mediaPlayer;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Smecherasu nutzuAlMic =
                            new Smecherasu("Nutzu", "Ghidon", "Al mic", 35, Bani.BANI_DE_MA_ENERVEAZA);

                    Fraieru titi = new Fraieru("Titi", "", 33);

                    Golanu giovanny = new Golanu("Giovanny", "Pufosu", "G.", 29);

                    Thread.sleep(1500);

                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            ConsoleHelper consoleHelper = new ConsoleHelper();
                            for (int i = 0; i < 600; i++) {
                                consoleHelper.animate();
                                try {
                                    Thread.sleep(400);
                                } catch (InterruptedException e) {
                                    ; // s-a dus...
                                }
                            }
                        }
                    }).start();

                    nutzuAlMic.staiLanga(giovanny);
                    Thread.sleep(32000);

                    System.out.println("\033[0m");
                    nutzuAlMic.smecheresteFraieru();
                    Thread.sleep(24000);

                    System.out.println("\033[0m");
                    nutzuAlMic.staiLanga(titi);
                    Thread.sleep(45000);

                    System.out.println("\033[0m");
                    nutzuAlMic.dezgheataFraieru();
                    Thread.sleep(23000);

                    System.out.println("\033[0m");
                    nutzuAlMic.staiLanga(titi);
                    Thread.sleep(46000);

                    System.out.println("\033[0m");
                    nutzuAlMic.smecheresteFraieru();
                    Thread.sleep(23000);

                    System.out.println("\033[0m");
                    nutzuAlMic.staiLanga(titi);
                } catch (InterruptedException e) {
                    ; // s-a dus...
                }
            }
        }).start();
        launch(args);
    }

    public void daBlana() {
        URL url = LumeaPerversaSiRea.class.getClassLoader().getResource("manea.mp3");
        String source = url.toString();
        Media hit = new Media(source);
        mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        daBlana();
    }

    public static class ConsoleHelper {
        private String lastLine = "";

        public void print(String line) {
            //clear the last line if longer
            if (lastLine.length() > line.length()) {
                String temp = "";
                for (int i = 0; i < lastLine.length(); i++) {
                    temp += " ";
                }
                if (temp.length() > 1)
                    System.out.print("\r" + temp);
            }
            System.out.print("\r" + line);
            lastLine = line;
        }

        private byte anim;

        public void animate() {
            switch (anim) {
                case 1:
                    print("\033[0m\033[0;100m\033[1;92m$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                    break;
                case 2:
                    print("\033[0m\033[0;100m\033[1;92m$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                    break;
                case 3:
                    print("\033[0m\033[0;100m\033[1;92m$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                    break;
                case 4:
                    print("\033[0m\033[0;100m\033[1;92m$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                    break;
                case 5:
                    print("\033[1;91m\033[0;107mEXCEPTION: PREA MULTA VALOARE");
                    break;
                default:
                    anim = 0;
                    print("\033[0m\033[0;100m\033[1;92m$$$$$$$$$$$$$$$$$$$$");
            }
            anim++;
        }
    }
}


