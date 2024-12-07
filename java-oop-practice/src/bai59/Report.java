/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai59;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author P51
 */
public class Report {
    private String id;
    private SimpleDateFormat sd = new SimpleDateFormat("HH:mm");
    private SimpleDateFormat sd1 = new SimpleDateFormat("hh:mm");
    private Date reportTime;
    private boolean isMorning;
    public Report(String id, String reportTime) throws ParseException{
        this.id = id;
        this.reportTime = sd.parse(reportTime);
        calIsMorning();
    }
    private void calIsMorning() throws ParseException{
        Date start = sd1.parse("00:00");
        Long time = reportTime.getTime() - start.getTime();
        isMorning = time <= 12 * 3600 * 1000;
//        System.out.println(time / (3600 * 1000));
    }

    public boolean isIsMorning() {
        return isMorning;
    }
    

    public String getId() {
        return id;
    }
    @Override
    public String toString(){
        return sd1.format(reportTime);
    }
}
