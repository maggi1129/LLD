package com.company;

public interface IJobService {

    /**
     * When a process starts, it calls 'start' with processId.
     * @param processId
     */
    void start(String processId);

    /**
     * When the same process ends, it calls end with processId
     * @param processId
     */
    void end(String processId);

    /**
     * Polls the first entry of a completed process sorted by the
     * start time of processes in the format
     * {processId} started at {startTime} and ended at {endTime}
     *
     * process id = 1 --> 12,15
     * process id = 2 --> 8,12
     *
     * {2} started at {8} and ended at {12}
     * {1} started at {12} and ended at {15}
     *
     * poll method will block until the process is running
     */
    void poll();

}


