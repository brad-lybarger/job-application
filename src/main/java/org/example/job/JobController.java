package org.example.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    JobService jobService;

    @GetMapping("/job")
    private List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/job/{jobId}")
    private Job getJobById(@PathVariable int jobId) {
        return jobService.getJobById(jobId);
    }

    @PostMapping("/job")
    private void createJob(@RequestBody Job job) {
        jobService.upsertJob(job);
    }

    @PutMapping("/job/{jobId}")
    private void updateJob(
        @PathVariable int jobId,
        @RequestBody Job job
    ) {
        if (jobId != job.getId()) {
            throw new IllegalArgumentException("job IDs do not match");
        }
        jobService.upsertJob(job);
    }

    @DeleteMapping("/job/{jobId}")
    private void deleteJob(@PathVariable int jobId) {
        jobService.deleteJobById(jobId);
    }
}
