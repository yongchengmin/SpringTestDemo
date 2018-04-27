package com.yc.job;

import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.yc.utils.DateUtil;

/**
 * 
 * 
 * @ClassName: MyJobDetail
 * 
 * @Description: 配置文件中使用JobDetailBean,需要继承QuartzJobBean
 * 
 * @author:
 * 
 * @date:
 */


public class MyJobDetail extends QuartzJobBean{

	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		System.out.println("Spring 集成 Quartz 的第二种方式:"+DateUtil.format(new Date(), DateUtil.dmy_hms));
	}

}
