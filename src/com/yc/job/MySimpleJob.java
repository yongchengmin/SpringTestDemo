package com.yc.job;

import java.util.Date;
import org.springframework.stereotype.Component;
import com.yc.utils.DateUtil;
/**
 * 简单任务
 */
@Component("mySimpleJob")
public class MySimpleJob {
    public void execute() {
        System.out.println("Quartz Spring XML 简单任务- MySimpleJob:"+DateUtil.format(new Date(), DateUtil.dmy_hms));
    }
}