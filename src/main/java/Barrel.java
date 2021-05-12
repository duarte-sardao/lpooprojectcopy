import java.io.IOException;

public class Barrel extends DangerousObstacle{

    public Barrel(Position pos) throws IOException {
        super(pos);
        toDamage = 3;
        readSpriteFromFile("barrel.txt");
        colour = "#801e0d";
    }
}
