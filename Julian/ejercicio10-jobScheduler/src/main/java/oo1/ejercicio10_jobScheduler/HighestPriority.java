package oo1.ejercicio10_jobScheduler;

import java.util.List;

public class HighestPriority implements JobStrategy{

	@Override
	public JobDescription selectNextJob(List<JobDescription> jobs) {
		return jobs.stream()
				.max((p1,p2) -> Double.compare(p1.getPriority(), p2.getPriority()))
				.orElse(null);
	}

}
