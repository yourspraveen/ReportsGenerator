package com.yourspraveen.jasper.scriptlets;

import net.sf.jasperreports.engine.JRDefaultScriptlet;
import net.sf.jasperreports.engine.JRScriptletException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloScriptlet extends JRDefaultScriptlet {
    private static final Logger LOGGER = LogManager.getLogger(HelloScriptlet.class.getName());


    public HelloScriptlet() {
        super();
        LOGGER.info("Constructor");
    }

    public void beforeReportInit() throws JRScriptletException {
        LOGGER.info("beforeReportInit");
    }


    public void afterReportInit() throws JRScriptletException {
        LOGGER.info("afterReportInit");
    }


    public void beforePageInit() throws JRScriptletException {
        LOGGER.info("beforePageInit");

    }


    public void afterPageInit() throws JRScriptletException {
        LOGGER.info("afterPageInit");

    }


    public void beforeColumnInit() throws JRScriptletException {
        LOGGER.info("beforeColumnInit");
    }


    public void afterColumnInit() throws JRScriptletException {
        LOGGER.info("afterColumnInit");
    }


    public void beforeGroupInit(String groupName) throws JRScriptletException {
        LOGGER.info("beforeGroupInit");
    }


    public void afterGroupInit(String groupName) throws JRScriptletException {
        LOGGER.info("afterGroupInit");
    }


    public void beforeDetailEval() throws JRScriptletException {
        LOGGER.info("beforeDetailEval");
    }


    public void afterDetailEval() throws JRScriptletException {
        LOGGER.info("afterDetailEval");
    }
}
