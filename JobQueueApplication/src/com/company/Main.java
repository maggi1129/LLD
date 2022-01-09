package com.company;

public class Main {

    public static void main(String[] args) {
        final IJobService jobService = new JobService();
        jobService.start("1");
        jobService.poll();
        jobService.end("1");
        jobService.poll();
        jobService.start("2");
        jobService.poll();
        jobService.end("2");
        jobService.poll();
    }
}
