package com.solid.isp.service;

import com.solid.isp.model.Document;
import com.solid.isp.service.contract.IScanner;
import com.solid.isp.service.contract.MultiFunctionDevice;
import com.solid.isp.service.contract.Printer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MultiFunctionMachine implements MultiFunctionDevice {

    // compose this out of several modules
    private Printer printer;
    private IScanner scanner;


    @Override
    public void Scan(Document d) throws Exception {
        scanner.Scan(d);
    }

    @Override
    public void Print(Document d) throws Exception {
        printer.Print(d);
    }
}