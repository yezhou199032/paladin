package com.xiaoju.automarket.paladin.core.runtime.scheduler;

import com.typesafe.config.Config;
import com.xiaoju.automarket.paladin.core.runtime.job.JobExecutor;

import java.util.concurrent.CompletableFuture;

/**
 * @Author Luogh
 * @Date 2020/12/6
 **/
public interface JobScheduler {

    void configure(Config config);

    CompletableFuture<Void> cancelJob(String jobId);

    void shutdown();

    JobExecutor createNewJobExecutor();
}