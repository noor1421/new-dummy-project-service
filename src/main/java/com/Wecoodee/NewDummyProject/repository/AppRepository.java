package com.Wecoodee.NewDummyProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Wecoodee.NewDummyProject.model.ApplicationForm;

@Repository
public interface AppRepository extends JpaRepository<ApplicationForm, String> {

	ApplicationForm getById(String Id);
//
//	@Transactional
//	@Modifying
//	@Query("update ApplicationForm set pendingApproval=:pendingApproval where Id=:id")
//	public static int updatePendingApproval(@Param("id") String Id, @Param("pendingApproval") boolean pendingApproval) {
//		return 0;
//	}

}
