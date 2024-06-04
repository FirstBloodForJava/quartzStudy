package com.org.oycm;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;


/**
 * @author ouyangcm
 * create 2024/6/4 15:59
 */
public class QuartzTest {

    public static void main(String[] args) {
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

            scheduler.start();

            scheduler.shutdown();

        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
