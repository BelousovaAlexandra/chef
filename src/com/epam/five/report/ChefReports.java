package com.epam.five.report;

import com.epam.five.chef.Chef;
import com.epam.five.exception.TechnicalException;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.log4j.Logger;

public class ChefReports {
    private FileWriter fw;
    
    private static final Logger LOG = Logger.getLogger(Chef.class);
    
    public ChefReports(String filename) throws IOException {
        this.fw = new FileWriter(filename);
    }

    public ChefReports() throws IOException {
        this.fw = new FileWriter("output.txt");
    }
    
    public void reportToConsole(String s) throws IOException{
        System.out.println(s);
       // fw.write(s);
    }
    public void reportToFile(String s) throws IOException{
        fw.write(s+";\r\n");
    }
    public void throwLog(String s){
        LOG.info(s);
    }
    public void closeFile() throws IOException{
        fw.write("\r\n======= end of the file =======");
        fw.close();
    }
}
