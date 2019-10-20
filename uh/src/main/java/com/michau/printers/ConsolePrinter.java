package com.michau.printers;

import org.springframework.stereotype.Component;

@Component
public class ConsolePrinter implements Printer{
    public void print(String text) {
        System.out.println("printed from console printer"+text);
    }
}
