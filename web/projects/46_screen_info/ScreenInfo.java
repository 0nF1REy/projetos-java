import java.awt.*;

public class ScreenInfo {
    public static void main(String[] args) {
        // Obtém o ambiente gráfico
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        DisplayMode dm = gd.getDisplayMode();

        // Tamanho físico da tela (em pixels)
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Resolução (DPI)
        int dpi = Toolkit.getDefaultToolkit().getScreenResolution();

        System.out.println("Largura x Altura: " + screenSize.width + " x " + screenSize.height);
        System.out.println("Resolução (DPI): " + dpi);
        System.out.println("Taxa de atualização: " + dm.getRefreshRate() + " Hz");
        System.out.println("Profundidade de cor: " + dm.getBitDepth() + " bits");
    }
}
