package oo1.ejercicio10_jobScheduler;

import java.util.List;

public interface JobStrategy {
	
	public JobDescription selectNextJob(List<JobDescription> jobs);

}
