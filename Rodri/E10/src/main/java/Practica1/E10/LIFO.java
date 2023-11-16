package Practica1.E10;
import java.util.List;

public class LIFO implements JobStrategy {

	@Override
	public JobDescription selectNextJob(List<JobDescription> jobs) {
		return jobs.get(jobs.size() - 1);
	}

}