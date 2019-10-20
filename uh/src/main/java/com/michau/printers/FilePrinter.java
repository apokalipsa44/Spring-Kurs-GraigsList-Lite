package com.michau.printers;

import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class FilePrinter implements Printer{
    public void print(String text) {
        String userHomePath = "C:\\Users\\m_lac\\OneDrive\\Dokumenty\\Spring-Kurs-GraigsList-Lite\\";
        Path outputPath = Paths.get(userHomePath, "out.log");
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(outputPath.toFile(), true))) {

            printWriter.println(text);
            System.out.println("Log file saved at "+userHomePath+"out.log");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
