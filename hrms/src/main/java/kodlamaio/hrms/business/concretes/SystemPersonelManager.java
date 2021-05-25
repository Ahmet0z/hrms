package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SystemPersonelService;
import kodlamaio.hrms.dataAccess.abstracts.SystemPersonelDao;
import kodlamaio.hrms.entities.concretes.SystemPersonel;

@Service
public class SystemPersonelManager implements SystemPersonelService{
	
	private SystemPersonelDao dao;
	
	@Autowired
	public SystemPersonelManager(SystemPersonelDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public List<SystemPersonel> getAll() {
		return this.dao.findAll();
	}

}
