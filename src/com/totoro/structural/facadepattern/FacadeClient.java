package com.totoro.structural.facadepattern;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class FacadeClient {
    public void printReport(){
        ReportFacade reportFacade = new ReportFacade();
        reportFacade.generateReport();
    }
}
