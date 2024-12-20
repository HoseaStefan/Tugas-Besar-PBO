package view;

import javax.swing.*;

import model.CurrentUser;
import model.User;
import model.Admin;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class MenuAdmin {

    private JFrame frame;

    public MenuAdmin() {
        showMenuAdmin();
    }

    public void showMenuAdmin() {
        CurrentUser currentUser = CurrentUser.getInstance();
        Admin admin = currentUser.getAdmin();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        final int FRAME_WIDTH = 500;
        final int FRAME_HEIGHT = 700;

        int start_x = screenWidth / 2 - (FRAME_WIDTH / 2);
        int start_y = screenHeight / 2 - (FRAME_HEIGHT / 2);

        Font buttonFont = new Font("SansSerif", Font.BOLD, 18);

        frame = new JFrame("Admin Dashboard");
        frame.setUndecorated(true);
        frame.setBounds(start_x, start_y, FRAME_WIDTH, FRAME_HEIGHT);
        frame.setShape(new RoundRectangle2D.Double(0, 0, FRAME_WIDTH, FRAME_HEIGHT, 30, 30));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.getHSBColor(0.6f, 0.7f, 0.9f));
        panel.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);

        JLabel welcomeTitle = new JLabel("Welcome Admin, " + admin.getName());
        welcomeTitle.setBounds(50, 50, 400, 25);
        welcomeTitle.setFont(new Font("SansSerif", Font.BOLD, 24));
        welcomeTitle.setForeground(Color.WHITE);
        panel.add(welcomeTitle);

        JButton createPromo = new JButton("Create Kode Promo");
        createPromo.setBounds(120, 240, 260, 50);
        Component.styleButton(createPromo, new Color(3, 123, 252), buttonFont);
        panel.add(createPromo);

        createPromo.addActionListener(e -> {
            frame.dispose();
            new MenuTransaksi();
        });

        JButton exitButton = new JButton("Logout");
        exitButton.setBounds(120, 600, 260, 50);
        Component.styleButton(exitButton, new Color(255, 69, 58), buttonFont);
        panel.add(exitButton);

        exitButton.addActionListener(e -> {
            frame.dispose();
            CurrentUser.getInstance().clearUser();
            new MainMenu();
        });

        frame.add(panel);
        frame.setVisible(true);

    }
}