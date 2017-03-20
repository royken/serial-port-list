package com.royken.serialportlist;

import com.fazecast.jSerialComm.SerialPort;

/**
 *
 * @author Kenfack Valmy-Roi <roykenvalmy@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        SerialPort[] commPorts = SerialPort.getCommPorts();
        System.out.println("There are " + commPorts.length + " serial port on my machine");
        for (SerialPort commPort : commPorts) {
            System.out.println("System port name " + commPort.getSystemPortName());
            System.out.println("Descriptive port name" + commPort.getDescriptivePortName());
            System.out.println("Is Port opened ? " + commPort.isOpen());
        }
    }
    
}