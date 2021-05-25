package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "system_personel")
public class SystemPersonel{
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	public SystemPersonel() {
		super();
	}
	
	public SystemPersonel(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
