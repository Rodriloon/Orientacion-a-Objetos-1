package oo1.ejercicio10_jobScheduler;

import java.util.List;

public class FIFO implements JobStrategy{

	@Override
	public JobDescription selectNextJob(List<JobDescription> jobs) {
		return jobs.get(0); 
	}

}
