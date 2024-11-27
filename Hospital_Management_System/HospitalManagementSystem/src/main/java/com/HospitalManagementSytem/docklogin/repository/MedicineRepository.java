package com.HospitalManagementSytem.docklogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HospitalManagementSytem.docklogin.entity.Medicine;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long>{

}
