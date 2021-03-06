import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;

import java.io.IOException;

public interface GUI {
    void clear();
    void refresh() throws IOException;
    void close() throws IOException;
    MOVEMENT getNextMovement() throws IOException;
    void drawText(Position position, String text, String color,String background);
    void drawObj(Position position, String text, String color, String fcolor);
    void fillRectangle(Position position, Position size, String color, Character character);
    KeyStroke readInput() throws IOException;


    enum MOVEMENT{ UP, DOWN, DOUBLEUP, QUIT, NONE}
}
