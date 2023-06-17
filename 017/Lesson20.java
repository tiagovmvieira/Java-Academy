// Swing allows us to create Graphical User Interfaces
// We need the Swing library to create GUI interfaces
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

// We must extend the JFrame class to make a frame

public class Lesson20 extends JFrame {

    public static void main(String[] args){

        new Lesson20();
    }

    public Lesson20(){

        // Define the size of the frame
        this.setSize(400, 400);

        // Opens the frame in the middle of the screen
        // You could also define position based on a component

        // this.setLocationRelativeTo(null);

        // Toolkit is the super class for the Abstract Window Toolkit
        // it allows us to ask questions of the OS

        Toolkit tk = Toolkit.getDefaultToolkit();

        // A Dimension can hold the width and height of a component
        // getScreenSize returns the size of the screen
        Dimension dim = tk.getScreenSize();

        // dim.width returns the width of the screen
        // this.getWidth returns the width of the frame we are building

        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);

        // You could also define the x, y position of the frame
        this.setLocation(xPos, yPos);

        // Define if the user can resize the frame (true by default)
        this.setResizable(false);

        // Define how the user exits the program
        // This closes when they click the close button
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Define the title for the frame
        this.setTitle("My First Frame");

        // The JPanel contains all the components for your fame
        JPanel thePanel = new JPanel();

        // How to create a label with its text ----------
        JLabel label1 = new JLabel("Tell me something");

        // How to change the text for the label
        label1.setText("New Text");

        // How to create a tool tip for the label
        label1.setToolTipText("Does not do anything");

        // How to add the label to the panel
        thePanel.add(label1);

        // How to create a button -----------------------
        JButton button1 = new JButton("Send");

        // How to hide the button border (Default True)
        button1.setBorderPainted(false);

        // How to hide the button background (Default True)
        button1.setContentAreaFilled(false);

        // How to change the text for the label
        button1.setText("New Button");

        // How to create a tool tip for the label
        button1.setToolTipText("Does not do anything either");

        // How to add the button to the panel
        thePanel.add(button1);

        // How to add a textfield ----------------------
        JTextField textField1 = new JTextField("Type Here", 15);

        // Change the size of the text field
        textField1.setText("New Text Here");

        // Change the tool tip for the text field
        textField1.setToolTipText("More of nothing");

        thePanel.add(textField1);

        // How to add a text area ----------------------
        JTextArea textArea1 = new JTextArea(15 ,20);

        // Set the default text for the text area

        textArea1.setText("Just a whole bunch of text that is important\n");

        // If a text doesn't fir on a line, jump to the next
        textArea1.setLineWrap(true);

        // Makes sure that words stay intact if a line wrap occurs
        textArea1.setWrapStyleWord(true);

        // Gets the number of newlines in the text
        int numOfLines = textArea1.getLineCount();

        // Appends text after the current text
        textArea1.append(" number of lines: " + numOfLines);

        // Adds scroll bars to the text area ----------
        JScrollPane scrollbar1 = new JScrollPane(textArea1,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Other options: VERTICAL_SSCROLLBAR_ALWAYS, VERTICAL_SCROLLBAR_NEVER
        thePanel.add(scrollbar1);

        // How to add the panel to the frame
        this.add(thePanel);

        // Makes the frame shown on the screen
        this.setVisible(true);

        // Gives focus to the textField
        textField1.requestFocus();

        // We can also request focus for the text array
        // textArea1.requestFocus();

    }

}
