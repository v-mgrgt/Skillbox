import org.imgscalr.Scalr;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.io.File;
import java.io.IOException;

public class ImageResizer implements Runnable {
    private static final int targetWidth = 408;

    private final File[] files;
    private final File dst;

    public ImageResizer(File[] files, File dst) {
        this.files = files;
        this.dst = dst;
    }

    public BufferedImage resize(BufferedImage src, int targetWidth, int targetHeight, BufferedImageOp... ops) {
        return Scalr.resize(src, targetWidth, targetHeight, ops);
    }

    @Override
    public void run() {
        try {
            for (File file : files) {
                if (file == null)
                    continue;

                BufferedImage src = ImageIO.read(file);
                int targetHeight = (int) Math.round(src.getHeight() / (1.0 * src.getWidth() / targetWidth));

                BufferedImage target = resize(src, targetWidth, targetHeight);
                ImageIO.write(target, "JPG", new File(dst, file.getName()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
