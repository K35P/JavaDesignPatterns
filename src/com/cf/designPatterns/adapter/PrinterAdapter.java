package com.cf.designPatterns.adapter;

public class PrinterAdapter implements Printer{
    private OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter){
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void print() {
        oldPrinter.printOld();
    }
}
