package com.company;

import java.util.*;

public class JobService implements IJobService {

    // List is not a good idea always O(n) to find the end of the process
    //private final List<ProcessModel> processes;
    //can also use a heap + map
    private final TreeMap<Long, ProcessModel> queue;
    private final Map<String, ProcessModel> processes;

    public JobService() {
        this.processes = new HashMap<>();
        this.queue = new TreeMap<>(
                Comparator.comparingLong(startTime -> startTime));
    }

    @Override
    public void start(String processId) {
        final long now = System.currentTimeMillis();
        final ProcessModel process = new ProcessModel(processId, System.currentTimeMillis());
        processes.put(processId,process);
        queue.put(now,process);
    }

    @Override
    public void end(String processId) {
        final long now = System.currentTimeMillis();
        processes.get(processId).setEndTime(now);

    }

    /**
     * Find the process with least end time
     */
    @Override
    public void poll() {
        final ProcessModel process = queue.firstEntry().getValue();
        if(process.getEndTime() != -1){
            System.out.println("started at "+ process.getStartTime() +
                    " and ended at "+ process.getEndTime());
            processes.remove(process.getId());
            queue.pollFirstEntry();
        }else{
            System.out.println("No completed tasks in queue");
        }
    }
}
