package com.yourspraveen.jasper;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class ReportRunner {
    private static final Logger LOGGER = LogManager.getLogger(ReportRunner.class.getName());

    public static void main(String[] args) {

        try {
            HashMap<String, Object> parameterMap = new HashMap<>();

            //parameterMap.put("SUBREPORT_DIR", reportPath);
            LOGGER.info("PARAMS :", parameterMap.toString());
            InputStream is = Thread.currentThread().getContextClassLoader()
                    .getResourceAsStream("/Users/praveen/IdeaProjects/ReportsGenerator/target/jasper/HelloJasper.jasper");

            JasperReport report = JasperCompileManager.compileReport("/Users/praveen/IdeaProjects/ReportsGenerator/src/main/jasperreports/HelloJasper.jrxml");
            JasperPrint print = JasperFillManager.fillReport(report,null);
            JasperExportManager.exportReportToPdfFile(print,"/Users/praveen/IdeaProjects/ReportsGenerator/target/Hello.pdf");

            JRDataSource dataSource = new JRBeanCollectionDataSource(new ArrayList<String>());

            JasperRunManager.runReportToPdf(is, parameterMap);
        } catch (JRException ex){
            LOGGER.error(ex);
        }
    }
}
