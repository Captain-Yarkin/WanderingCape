package GUI.UI;

import javax.swing.*;
import java.awt.*;

public class UIAdventureButton extends JButton {

    public UIAdventureButton(String buttonText, Color bgColor, Color fgColor, Font font, ChoiceControls choiceHandler, String command) {
        setText(buttonText);
        setBackground(bgColor);
        setForeground(fgColor);
        setFont(font);
        setFocusPainted(false);
        addActionListener(choiceHandler);
        setActionCommand(command);
    }
}
