package GUI.UI;

import javax.swing.*;
import java.awt.*;

public class UIPlayerLabel extends JLabel {

    public UIPlayerLabel(Color backgroundColor, Font font){
        setFont(font);
        setForeground(backgroundColor);
    }

    public UIPlayerLabel(String text, Color backgroundColor, Font font) {
        this(backgroundColor, font);
        setText(text);
    }
}
