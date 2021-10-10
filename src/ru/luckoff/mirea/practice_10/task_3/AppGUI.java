package ru.luckoff.mirea.practice_10.task_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppGUI extends JFrame {

    public AppGUI() {
        super("Redactor");
        this.setBounds(200, 200, 500, 500);
        Container pane = this.getContentPane();
        pane.setLayout(new GridLayout(3, 3, 1, 1));

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menuFile());
        setJMenuBar(menuBar);
        setSize(300, 200);
        setVisible(true);

    }

    private JMenu menuFile() {
        JMenu file = new JMenu("File");
        JMenu newFile = new JMenu("New");
        JMenuItem textDocumentNew = new JMenuItem("Text Document");
        JMenuItem imageDocumentNew = new JMenuItem("Image Document");
        JMenuItem musicDocumentNew = new JMenuItem("Music Document");
        JMenu open = new JMenu("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem(new ExitAction());
        JMenuItem textDocumentOpen = new JMenuItem("Text");
        JMenuItem imageDocumentOpen = new JMenuItem("Image");
        JMenuItem musicDocumentOpen = new JMenuItem("Music");

        file.add(newFile);
        newFile.add(textDocumentNew);
        newFile.add(imageDocumentNew);
        newFile.add(musicDocumentNew);
        file.add(open);
        open.add(textDocumentOpen);
        open.add(imageDocumentOpen);
        open.add(musicDocumentOpen);
        file.addSeparator();
        file.add(save);
        file.add(exit);

        ICreateDocument imageFac = new CreateImageDocument();
        ICreateDocument textFac = new CreateTextDocument();
        ICreateDocument musicFac = new CreateMusicDocument();

        imageDocumentNew.addActionListener(arg0 -> {
           imageFac.CreateNew();
        });
        textDocumentNew.addActionListener(arg0 -> {
            textFac.CreateNew();
        });
        musicDocumentNew.addActionListener(arg0 -> {
            musicFac.CreateNew();
        });

        imageDocumentOpen.addActionListener(arg0 -> {
            imageFac.CreateOpen();
        });
        textDocumentOpen.addActionListener(arg0 -> {
            textFac.CreateOpen();
        });
        musicDocumentOpen.addActionListener(arg0 -> {
            musicFac.CreateOpen();
        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Document has been saved.", "Saved", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Document has been saved.");
            }
        });

        return file;
    }
}

class ExitAction extends AbstractAction {
    private static final long serialVersionUID = 1L;
    ExitAction() {
        putValue(NAME, "Exit");
    }
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
