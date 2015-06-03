package com.epam.five.report;

import com.epam.five.creator.Creator;
import java.io.IOException;
import org.apache.log4j.Logger;

public class CreatorReports extends Report{
    private static final Logger LOG = Logger.getLogger(Creator.class);

    public CreatorReports() throws IOException{
        super();
    }

    public CreatorReports(String filename) throws IOException {
        super(filename);
    }
    public CreatorReports(String filename,boolean b) throws IOException{
        super(filename,b);
    }
    public CreatorReports(boolean b) throws IOException{
        super(b);
    }
    @Override
    public void reportToLog(String s) {
        LOG.info(s);
    }
    
}
