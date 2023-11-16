package com.example.SpJPARunner.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.SpJPARunner.Model.Student1;

import jakarta.transaction.Transactional;

import java.util.*;


@Repository
public interface StudentRepo extends JpaRepository<Student1,Long> {

	 List<Student1> findByname(String str);
   List<Student1> findBypercentage(int p);
//	@Query("select u from Student1 u where u.name like ?1%")
	List<Student1> findByNameContaining(char s);
	@Query("select u from Student1 u where u.name =?1")
	List<Student1> findByNameContainingSting(String  s);
	@Query("select u from Student1 u where u.name=?1 and u.college=?2")
	Student1 searchByNameAndCollege(String s1,String s2);
	@Query(value="select percentage from student1 where name=?1 ",nativeQuery=true)
	List<Integer> findpercentageByName(String name);
	@Modifying
@Transactional
	@Query(
			value="update student1 set percentage=?1 where name=?2",nativeQuery=true)
	public int updatePercentBasedOnName(int percentage,String name);
}
