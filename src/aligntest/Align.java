/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aligntest;

/**
 * Ex 12.8
 * 
 * Iman Fahmy
 * 11/10/17
 */
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class Align extends JFrame {
    
    private JCheckBox snapToGrid;
    private JCheckBox showGrid;
    private JTextField xTextField;
    private JTextField yTextField;
    private JButton okButton;
    private JButton cancelButton;
    private JButton helpButton;
    private JLabel xLabel;
    private JLabel yLabel;
    private JPanel checkBoxPanel;
    private JPanel labelPanel;
    private JPanel textFieldPanel;
    private JPanel buttonPanel;
    
    public Align ()
    {
    super("Align");
    setLayout(new FlowLayout());
    
    checkBoxPanel = new JPanel();
    labelPanel = new JPanel();
    textFieldPanel = new JPanel();
    buttonPanel = new JPanel();
    
    snapToGrid = new JCheckBox("Snap to Grid");
    showGrid = new JCheckBox("Show Grid");
    JCheckBox[] checkBoxArray = {snapToGrid, showGrid};
    checkBoxPanel.setLayout(new GridLayout(2, checkBoxArray.length, 5,5));
    
    xLabel = new JLabel("X: ");
    yLabel = new JLabel("Y: ");
    JLabel[] labelArray = {xLabel, yLabel};
    labelPanel.setLayout(new GridLayout(2, labelArray.length, 5, 5));
    
    xTextField = new JTextField(3);
    yTextField = new JTextField(3);
    JTextField[] textFieldArray = {xTextField, yTextField};
    textFieldPanel.setLayout(new GridLayout(2, textFieldArray.length, 10, 10));
    
    for (int i = 0; i < 2; i++)
    {
        checkBoxPanel.add(checkBoxArray[i]);
        labelPanel.add(labelArray[i]);
        textFieldPanel.add(textFieldArray[i]);
    }
    
    add(checkBoxPanel, BorderLayout.WEST);
    add(labelPanel, BorderLayout.WEST);
    add(textFieldPanel, BorderLayout.WEST);
    
    okButton = new JButton("Ok");
    cancelButton = new JButton("Cancel");
    helpButton = new JButton("Help");
    JButton[] buttonArray = {okButton, cancelButton, helpButton};
    buttonPanel.setLayout(new GridLayout(3, buttonArray.length, 10, 5));
      
    for (JButton button : buttonArray) 
    {
            buttonPanel.add(button);
    }
    add(buttonPanel, BorderLayout.WEST);
    
    }
}
