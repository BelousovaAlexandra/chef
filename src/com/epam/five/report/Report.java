package com.epam.five.report;

import java.io.FileWriter;
import java.io.IOException;

public abstract class Report {
    private final FileWriter fw;
    
    public Report() throws IOException {
        this.fw = new FileWriter("output.txt");
    }
    public Report(boolean b) throws IOException{
        this.fw = new FileWriter("output.txt",b);
    }
    public Report(String filename) throws IOException {
        this.fw = new FileWriter(filename);
    }

    public Report(String filename, boolean b) throws IOException {
        
        this.fw = new FileWriter(filename, b);
    }
        
    public void reportToConsole(String s) throws IOException{
        System.out.println(s);
    }
    public void reportToFile(String s) throws IOException{
        fw.write(s+";\r\n");
    }
    public abstract void reportToLog(String s);
    
    public void closeFile() throws IOException{
        fw.write("\r\n======= end of the file =======");
        fw.close();
    }
}
