package com.example.c006;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by liguohua on 01/03/2017.
 */
@Component
public class ScheduledTasks {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime() {
        System.err.println("现在时间：" + dateFormat.format(new Date()));
    }
}