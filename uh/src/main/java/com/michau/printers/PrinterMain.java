package com.michau.printers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrinterMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("com.michau.printers");
        applicationContext.refresh();

        ConsolePrinter consolePrinter = applicationContext.getBean(ConsolePrinter.class);
        FilePrinter filePrinter = applicationContext.getBean(FilePrinter.class);
        DialogPrinter dialogPrinter = applicationContext.getBean(DialogPrinter.class);

        consolePrinter.print("super text");
        dialogPrinter.print("mega text");
        filePrinter.print("extra text");

        System.out.println("---------Beans as printer interface types------------");
        Printer consolePrinter1 = applicationContext.getBean(ConsolePrinter.class);
        Printer dialogPrinter1 = applicationContext.getBean(DialogPrinter.class);
        Printer filePrinter1 = applicationContext.getBean(FilePrinter.class);

        consolePrinter1.print("dssd");
        dialogPrinter1.print("sdasdasdd");
        filePrinter1.print("sdfsfwrf");

        Printer printer = applicationContext.getBean("dialogPrinter", Printer.class);
        printer.print("Printer printer = applicationContext.getBean(\"dialogPrinter\", Printer.class);");


    }
}
