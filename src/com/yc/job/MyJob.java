package com.yc.job;

import java.util.Date;

import com.yc.utils.DateUtil;

/**@ClassName: MyJob
 * @Description:不用继承Quartz的Job接口 
 * @author: 
 * @date:
 */ 
public class MyJob { 
	public void execute() { 
		System.out.println("Quartz Spring XML 配置 - MyJob:"+DateUtil.format(new Date(), DateUtil.dmy_hms));
	} 
}
