package com.michau;

import com.michau.printers.ConsolePrinter;
import com.michau.printers.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    private ConsolePrinter consolePrinter;


    @Autowired
    public HelloWorld(ConsolePrinter consolePrinter) {
       this.consolePrinter=consolePrinter;
    }

    public void setPrinter(Printer printer){
        this.printer=printer;
    }

    public void sayHello(){
        printer.print("hello");
    }

    public static void main(String[] args) {
        HelloWorld helloWorld=new HelloWorld()
    }
}
