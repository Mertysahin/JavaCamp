package HRMS.homework6hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMS.homework6hrms.business.abstracts.JobsService;
import HRMS.homework6hrms.entities.concretes.Jobs;


@RestController
@RequestMapping("/api/jobs")
public class JobsController 
{
	private JobsService jobsService;

	@Autowired
	public JobsController(JobsService jobsService) {
		super();
		this.jobsService = jobsService;
	}
	
	public JobsController()
	{
		
	}
	@GetMapping("/getall")
	public List<Jobs> getAll()
	{
		return this.jobsService.getAll();
	}
}
