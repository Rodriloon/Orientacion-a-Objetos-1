package oo1.ejercicio10_jobScheduler;
import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    protected List<JobDescription> jobs;
    protected JobStrategy strategy;

    public JobScheduler () {
        this.jobs = new ArrayList<>();
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public JobStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(JobStrategy strategy) {
		this.strategy = strategy;
	}

	public List<JobDescription> getJobs(){
        return jobs;
    }


    public JobDescription next() {
        JobDescription nextJob =  this.strategy.selectNextJob(jobs);
        this.unschedule(nextJob);
        return nextJob;
    }

}
