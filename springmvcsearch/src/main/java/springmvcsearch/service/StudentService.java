package springmvcsearch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvcsearch.dao.StudentDao;
import springmvcsearch.model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;
	
	public int createUser(Student student)
	{
		return this.studentDao.saveUser(student);
	}
}
