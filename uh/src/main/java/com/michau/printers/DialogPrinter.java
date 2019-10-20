package com.michau.printers;

import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class DialogPrinter implements Printer {
    public void print(String text) {
        JOptionPane.showMessageDialog(null, text);
        System.out.println("Dialog window should pop-up");
    }
}
