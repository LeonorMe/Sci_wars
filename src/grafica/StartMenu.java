package grafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class StartMenu extends JFrame {
    JButton Login = new JButton("Login");
    JButton Register = new JButton("Register");
    JButton newGame = new JButton("New Game");
    JButton loadGame = new JButton("Load Game");
    JButton exit = new JButton("Exit");

    public StartMenu() {
        super("Start Menu");
        setSize(1400, 800);
        setLocation(70, 10);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        //setContentPane(new JLabel(new ImageIcon("src\\grafica\\images\\startMenu.jpg")));

        Login.setBounds(200, 100, 100, 50);
        add(Login);
        Register.setBounds(200, 200, 100, 50);
        add(Register);
        newGame.setBounds(200, 300, 100, 50);
        add(newGame);
        loadGame.setBounds(200, 400, 100, 50);
        add(loadGame);
        exit.setBounds(200, 500, 100, 50);
        add(exit);
    }

    public static void main(String[] args) {
        new StartMenu();
    }
}
