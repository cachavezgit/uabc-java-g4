package mx.uabc.cursojava.multithreading;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ClienteGUIThreads {
    public static ExecutorService ejecutor= Executors.newFixedThreadPool(5);

    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo Threads");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        placeComponents(frame);
        frame.setVisible(true);
    }

    private static void placeComponents(JFrame frame) {
        frame.setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 10, 80, 25);
        frame.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        frame.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 40, 80, 25);
        frame.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 40, 160, 25);
        frame.add(passwordText);

        JButton loginButton = new JButton("Thread");
        loginButton.setBounds(10, 80, 80, 25);
        frame.add(loginButton);

        JButton registerButton = new JButton("register");
        registerButton.setBounds(180, 80, 80, 25);
        frame.add(registerButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Runnable tarea = new MyRunnable(100000000L);
                Thread hilo = new Thread(tarea);
                hilo.start();
            }
        });

        registerButton.addActionListener((e) -> {
            Runnable tarea = new MyRunnable(100000000L);
            Future<?> future = ejecutor.submit(tarea);
            future.cancel(true);
        });
    }
}
