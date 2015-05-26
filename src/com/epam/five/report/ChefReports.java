package com.epam.five.report;

import com.epam.five.chef.Chef;
import java.io.IOException;
import org.apache.log4j.Logger;

public class ChefReports extends Report{
    
    private static final Logger LOG = Logger.getLogger(Chef.class);
    
    public ChefReports() throws IOException {
        super();
    }
    
    public ChefReports(String filename) throws IOException {
        super(filename);
    }
    public ChefReports(String filename,boolean b) throws IOException{
        super(filename,b);
    }
    public ChefReports(boolean b) throws IOException{
        super(b);
    }
    @Override
    public void throwLog(String s) {
        LOG.info(s);
    }   
    
}
