package com.cloud.taskservice.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * @Auther zyx
 * @Date 2018/7/12 15:41
 * @Description:
 */
@Component
public class ScheduledTask {

    private Logger logger = LoggerFactory.getLogger(ScheduledTask.class);

    /**
     *     @Scheduled(fixedDelay = 5000)
     *                fixedDelay = 5000表示当前方法执行完毕5000ms后，Spring scheduling会再次调用该方法
     *     @Scheduled(fixedRate = 5000)
     *                fixedRate = 5000表示当前方法开始执行5000ms后，Spring scheduling会再次调用该方法
     *     @Scheduled(initialDelay = 1000,
     *                initialDelay = 1000表示延迟1000ms执行第一次任务
     *     @Scheduled(cron = "0 0/1 * * * ?")
     *                cron接受cron表达式，根据cron表达式确定定时规则
     */

    /**
     * 每隔10分钟
     */
    @Scheduled(cron = "0 0/10 * * * ?")
    public void initOverview() {
        logger.info("==============  10分钟到了  ===============");
    }

    /**
     * 每个月1号凌晨两点
     */
    @Scheduled(cron = "0 0 2 1 * ?")
    public void monthMove() {
        logger.info("==============  每月1号凌晨两点执行  ===============");
    }

    /**
     * 每天凌晨十二点五分
     */
    @Scheduled(cron = "0 5 0 * * ?")
    public void dailyUpdate() {
        logger.info("==============  每天凌晨十二点五分  ===============");
    }

    /**
     * 每天凌晨四点执行
     */
    @Scheduled(cron = "0 0 4 * * ?")
    public void dailyAccounting() {
        logger.info("==============  每天凌晨四点执行  ===============");
    }

    /**
     * 每秒执行
     */
    @Scheduled(cron = "0/1 * * * * ?")
    public void retryNotify() {
        logger.info("==============  每秒执行  ===============");
    }
}
