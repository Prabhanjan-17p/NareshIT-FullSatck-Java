package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Artist;

public interface IArtistRepository extends JpaRepository<Artist, Integer> {

	// @Query(value="select (sysdate-dob)/365.25 from JPA_ARTIST WHERE JSID=:id",nativeQuery = true) // for oracle
	@Query(value = "select  timestampdiff(DAY,dob,curdate())/365.25 from JPA_ARTIST WHERE JSID=:id", nativeQuery = true) // for MYSQl																										// mysql
	public double getArtistAgeById(int id);

	// @Query(value="select timestampdiff(DAY,doj,now())/365.25 from JPA_ARTIST WHERE JSID=:id",nativeQuery = true) // for mysql
	@Query(value = "select  sysdate-doj from JPA_ARTIST WHERE JSID=:id", nativeQuery = true) // for oracle
	public String getArtistExperienceById(int id);

}