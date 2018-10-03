import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

class LSB {

    BufferedImage getImageBuffer() throws IOException {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("img.bmp"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return img;
    }

    byte[] extractHiddenBytes(BufferedImage img){
        final int HIDDEN_FILE_SIZE = 83;
        byte[] hiddenBytes = new byte[HIDDEN_FILE_SIZE];

        //todo implement

        return hiddenBytes;
    }
}
