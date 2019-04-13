package no.dev1lroot.misc.ui;

import javax.swing.*;
import java.net.URL;

import static com.sun.javafx.scene.control.skin.Utils.getResource;

public class jDev1l {
    private JPanel MainFrame;
    private JTree PackageList;
    private JTabbedPane EditorTabs;
    private JTextArea FileContent;
    private JToolBar MainNavbar;
    private JPanel PackageExplorer;
    private JToolBar PackageBar;
    private JPanel EditFrame;
    private JScrollPane FileScroll;
    public void addMainButtons(JToolBar toolBar) {
        JButton button = null;
        
        //second button
        button = CreateButton("button_new", "CreateNewFile()","Create new file","New");
        toolBar.add(button);

        //first button
        button = CreateButton("button_open", "OpenFile()","Open Exiting File","Open");
        toolBar.add(button);

    }
    protected JButton CreateButton(String imageName,String actionCommand,String toolTipText,String altText) {
        String imgLocation = "assets/"+imageName+".png";
        URL imageURL = getResource(imgLocation);

        JButton button = new JButton();
        button.setActionCommand(actionCommand);
        button.setToolTipText(toolTipText);
        //button.addActionListener(this);

        if (imageURL != null) {
            button.setIcon(new ImageIcon(imageURL, altText));
        } else {
            button.setText(altText);
            System.err.println("Resource not found: " + imgLocation);
        }

        return button;
    }
    public void Run() {
        JFrame frame = new JFrame("jDev1l Studio");
        addMainButtons(PackageBar);
        frame.setContentPane(new jDev1l().MainFrame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
