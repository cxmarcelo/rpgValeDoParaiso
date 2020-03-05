package control;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteCaveira {

    private static BufferedImage spriteSheet;
    private static final int TILE_SIZE_X = 64;
    private static final int TILE_SIZE_Y = 64;

    public static BufferedImage loadSprite() {
        BufferedImage sprite = null;
        try {
            sprite = ImageIO.read(new File(SpriteCaveira.class.getResource("../imgs/caveiraLanca2.png").getPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sprite;
    }

    public static BufferedImage getSprite(int xGrid, int yGrid) {

        if (spriteSheet == null) {
            spriteSheet = loadSprite();
        }

        return spriteSheet.getSubimage(xGrid * TILE_SIZE_X, yGrid * TILE_SIZE_Y , TILE_SIZE_X, TILE_SIZE_Y);
    }

}