package com.dzpykj.plugins.quartz.xml;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.springframework.scheduling.quartz.QuartzJobBean;

@PersistJobDataAfterExecution
@DisallowConcurrentExecution// 不允许并发执行
public class FirstTask extends QuartzJobBean {
	 
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
    	System.out.println(new SimpleDateFormat("YYYY-MM-dd-HH:mm:ss").format(new Date()));
    }
}