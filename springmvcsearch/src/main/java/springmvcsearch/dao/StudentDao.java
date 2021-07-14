package springmvcsearch.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvcsearch.model.Student;

@Repository
public class StudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int saveUser(Student student)
	{
		
		int id =(Integer)this.hibernateTemplate.save(student);

		return id;

	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
