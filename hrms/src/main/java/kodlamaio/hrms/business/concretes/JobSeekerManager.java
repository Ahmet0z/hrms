package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {
	private JobSeekerDao dao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public List<JobSeeker> getAll() {
		return this.dao.findAll();
	}

}
