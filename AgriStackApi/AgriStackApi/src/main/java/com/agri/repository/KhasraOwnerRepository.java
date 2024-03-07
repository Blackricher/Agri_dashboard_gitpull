package com.agri.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.agri.entity.KhasraOwner;
import com.agri.model.KhasraOwnerM;

public interface KhasraOwnerRepository extends JpaRepository<KhasraOwner, Integer> {

	@Query(value = "select gata_unique_code, khasra_no, area from khasra_owner where village_code_census =:villageCode and fasal_year=:fasalyear group by gata_unique_code ,area, khasra_no order by khasra_no ", nativeQuery = true)
	List<KhasraOwnerM> getKhasraPublicData(@Param("villageCode") String villageCode,@Param("fasalyear") String fasalyear);
}
