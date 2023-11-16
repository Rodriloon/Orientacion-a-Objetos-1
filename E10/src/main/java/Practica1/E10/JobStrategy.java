package Practica1.E10;
import java.util.List;

public interface JobStrategy {
	
	public JobDescription selectNextJob(List<JobDescription> jobs);

}