import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import javax.tools.Tool;

import java.awt.event.*;

// Extends JFrame so it can create frames

public class Lesson21 extends JFrame {

    JButton button1;
    JTextField textField1;
    JTextArea textArea1;
    int buttonClicked;

    public static void main(String[] args) {

        new Lesson21();

    }

    public Lesson21() {

        // Defines the size of the frame
        this.setSize(400, 400);

        // Toolkit is the super class for the Abstract Window Toolkit
        // It allows us to ask questions of the OS

        Toolkit tk = Toolkit.getDefaultToolkit();

        // A Dimension can hold the width and height of a component
        // getScreenSize returns the size of the screen
        Dimension dim = tk.getScreenSize();

        // A Dimension can hold the width and height of a component
        // getScreenSize returns the width of the frame you are making
        // You could also define the x, y position of the frame

        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);

        this.setLocation(xPos, yPos);

        // Define how the frame exits (Click the Close Button)
        // Without this Java will eventually close the app

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Define the title for the frame
        this.setTitle("My Second Frame");

        // The JPanel contains all the components for your frame
        JPanel thePanel = new JPanel();

        // Create a button with Click Here on it
        button1 = new JButton("Click Here");

        // Create an instance of ListenForEvents to handle events
        ListenForButton lForButton = new ListenForButton();

        // Tell Java that we want to be alerted when an event
        // occurs on the button

        button1.addActionListener(lForButton);

        thePanel.add(button1);

        // How to add a text field ----------------------

        textField1 = new JTextField("Type Here", 15);

        ListenForKeys lForKeys = new ListenForKeys();

        textField1.addKeyListener(lForKeys);

        thePanel.add(textField1);

        // How to add a text area ----------------------

        textArea1 = new JTextArea(15, 20);

        // Set the default text for the text area
        textArea1.setText("Tracking Events\n");

        // If text doesn't fit on a line, jump to the next

        textArea1.setLineWrap(true);

        // Makes sure that words stay intact if a line wrap occurs
        textArea1.setWrapStyleWord(true);

        // Adds scroll bars to the text area ----------
        JScrollPane scrollbar1 = new JScrollPane(textArea1,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        thePanel.add(scrollbar1);

        this.add(thePanel);

        ListenForWindows lForWindow = new ListenForWindows();

        this.addWindowListener(lForWindow);
        this.setVisible(true);

        // Track the mouse if it is inside of the panel
        ListenForMouse lForMouse = new ListenForMouse();

        thePanel.addMouseListener(lForMouse);

    }

    private class ListenForButton implements ActionListener {

        // This method is called when an event occurs
        public void actionPerformed(ActionEvent e) {
            // Check if the source of the event was the button

            if(e.getSource() == button1){

                buttonClicked++;

                // Change the text for the label, will be displayed on the textArea1 everytime
                textArea1.append("Button clicked " + buttonClicked + " times\n");

                // e.getSource().toString() returns information on the button
                // and the event that occurred
            }
        }
    }


    private class ListenForKeys implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            textArea1.append("Key Hit: " + e.getKeyChar() + "\n");
        }

        // Handle the key-pressed event from the text field.
        @Override
        public void keyPressed(KeyEvent e) {

        }

        // Handle the key-released event from the text field.
        @Override
        public void keyReleased(KeyEvent e) {

        }
    }


    private class ListenForWindows implements WindowListener {

        @Override
        public void windowOpened(WindowEvent e) {
            textArea1.append("Window Created\n");

        }

        @Override
        public void windowClosing(WindowEvent e) {

        }

        @Override
        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {
            textArea1.append("Window Minimized\n");

        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            textArea1.append("Window in Normal State\n");

        }

        @Override
        public void windowActivated(WindowEvent e) {
            textArea1.append("Window Activated\n");

        }

        // Called when window is closed using dispose
        // this.dispose(); can be used to close a window

        @Override
        public void windowDeactivated(WindowEvent e) {
            textArea1.append("Window Deactivated\n");

        }
    }


    private class ListenForMouse implements MouseListener{


        @Override
        public void mouseClicked(MouseEvent e) {
            textArea1.append("Mouse Panel Pos: " + e.getX() + " " + e.getY() + "\n");
            textArea1.append("Mouse Screen Pos: " + e.getXOnScreen() + " " + e.getYOnScreen() + "\n");
            textArea1.append("Mouse Button: " + e.getButton()  + "\n");
            textArea1.append("Mouse Clicks: " + e.getClickCount()  + "\n");

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

}