/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package homework2.cardpack; CQHQZHGF

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import static java.awt.EventQueue.invokeLater;
import java.awt.event.*;
import java.io.IOException;

/**
 *
 * @author tomas
 */



public class  menubar extends JFrame  {

    public static void main (String[] args){
        invokeLater(()->{
            try {
                new menubar().setVisible(true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public menubar () throws IOException {
        init();
    }

    public void init() throws IOException {
        //frame
        //System.out.print("asdfadfasfd");

        newgame game = new newgame();
        add(game);

        setSize(new Dimension(1366,768));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //menu bar
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);

        JMenu file = new JMenu("File");
        menubar.add(file);

            JMenuItem new_game = new JMenuItem("New game");
            file.add(new_game);

            JMenuItem new_screen = new JMenuItem("New screen");
            file.add(new_screen);

            JMenuItem save_game= new JMenuItem("Save game");
            file.add(save_game);

            JMenuItem reload_game= new JMenuItem("Reload game");
            file.add(reload_game);

            JMenuItem exit= new JMenuItem("Exit");
            file.add(exit);


            exit.addActionListener(new exitaction());

        JMenu edit = new JMenu("Edit");
        menubar.add(edit);

            JMenuItem undo= new JMenuItem("Undo");
            edit.add(undo);

            JMenuItem reundo= new JMenuItem("Redo");
            edit.add(reundo);


        JMenu help=new JMenu("Help");
        menubar.add(help);

            JMenuItem move= new JMenuItem("Move");
            help.add(move);

    }

}

//exit
class exitaction implements ActionListener {
    public void actionPerformed (ActionEvent e){
        System.exit(0);
    }
}
//new screen
class newscreen implements ActionListener {
    public void actionPerformed (ActionEvent e){

    }
}
//savegame
class savegame implements ActionListener {
    public void actionPerformed (ActionEvent e){

    }
}

//reload game
class reloadgame implements ActionListener {
    public void actionPerformed (ActionEvent e){

    }
}
