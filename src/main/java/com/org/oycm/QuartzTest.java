package com.org.oycm;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.JobBuilder.newJob;


/**
 * @author ouyangcm
 * create 2024/6/4 15:59
 */
public class QuartzTest {

    public static void main(String[] args) throws InterruptedException {
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

            scheduler.start();

            // newJob(class) class不能为空
            // 定义job
            JobDetail job = newJob(HelloJob.class).withIdentity("job1", "group1").build();

            // 定义触发器 5s执行一次 重复执行
            Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger", "group2").startNow()
                    .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever())
                    .build();

            // 使用触发器来执行job
            scheduler.scheduleJob(job, trigger);

            Thread.sleep(60000);

            scheduler.shutdown();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
