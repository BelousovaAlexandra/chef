package com.epam.five.report;

import java.io.IOException;
import org.apache.log4j.Logger;

public class ActionReports extends Report{
    
    private static final Logger LOG = Logger.getLogger(ActionReports.class);

    public ActionReports() throws IOException {
        super();
    }

    public ActionReports(String filename) throws IOException {
        super(filename);
    }
    public ActionReports(String filename,boolean b) throws IOException{
        super(filename,b);
    }
    public ActionReports(boolean b) throws IOException{
        super(b);
    }
    @Override
    public void throwLog(String s) {
        LOG.info(s);
    }
    
}
