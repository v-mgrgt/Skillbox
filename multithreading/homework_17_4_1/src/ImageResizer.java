import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
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

    @Override
    public void run() {
        try {
            for (File file : files) {
                if (file == null)
                    continue;

                BufferedImage src = ImageIO.read(file);

                int targetHeight = (int) Math.round(src.getHeight() / (1.0 * src.getWidth() / targetWidth));
                int widthStep = src.getWidth() / targetWidth;
                int heightStep = src.getHeight() / targetHeight;

                BufferedImage target = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);

                for (int h = 0; h < targetHeight; h++) {
                    for (int w = 0; w < targetWidth; w++) {
                        int rgb = src.getRGB(w * widthStep, h * heightStep);
                        target.setRGB(w, h, rgb);
                    }
                }

                ImageIO.write(target, "JPG", new File(dst, file.getName()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
