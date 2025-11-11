import javax.sound.sampled.*;
import java.util.Scanner;

public class SineWavePlayer {
    public static void main(String[] args) throws LineUnavailableException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Frequência (Hz): ");
        float freq = scanner.nextFloat();

        System.out.print("Volume (0 a 1): ");
        float volume = scanner.nextFloat();

        final int SAMPLE_RATE = 44100;
        byte[] buffer = new byte[1];

        AudioFormat format = new AudioFormat(SAMPLE_RATE, 8, 1, true, true);
        SourceDataLine line = AudioSystem.getSourceDataLine(format);
        line.open(format);
        line.start();

        double angle = 0;
        double increment = (2 * Math.PI * freq) / SAMPLE_RATE;

        System.out.println("Pressione Ctrl+C para parar.");

        while (true) {
            buffer[0] = (byte) (Math.sin(angle) * 127 * volume);
            line.write(buffer, 0, 1);
            angle += increment;
            if (angle > 2 * Math.PI) angle -= 2 * Math.PI;
        }
    }
}
