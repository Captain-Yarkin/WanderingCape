package GUI.UI;

import javax.swing.*;
import java.awt.*;

public class UIButtonChoice extends JButton {

    public UIButtonChoice(Color bgColor, Color fgColor, Font font, ChoiceControls choiceHandler, String command) {
        setBackground(bgColor);
        setForeground(fgColor);
        setFont(font);
        setFocusPainted(false);
        addActionListener(choiceHandler);
        setActionCommand(command);
    }
}
