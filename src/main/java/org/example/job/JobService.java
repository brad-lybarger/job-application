package org.example.job;

import com.google.common.collect.ImmutableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    JobRepository jobRepository;

    public List<Job> getAllJobs() {
        return ImmutableList.copyOf(jobRepository.findAll());
    }

    public Job getJobById(int id) {
        return jobRepository.findById(id).get();
    }

    public void upsertJob(Job job) {
        jobRepository.save(job);
    }

    public void deleteJobById(int id) {
        jobRepository.deleteById(id);
    }
}
