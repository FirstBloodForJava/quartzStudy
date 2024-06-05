package com.org.oycm;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ouyangcm
 * create 2024/6/4 17:24
 */
public class HelloJob implements Job {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("[" + Thread.currentThread().getName() + "] " + sdf.format(new Date()) + " HelloJob Exec");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
