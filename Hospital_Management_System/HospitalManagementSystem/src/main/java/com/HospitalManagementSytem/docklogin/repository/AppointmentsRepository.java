package com.HospitalManagementSytem.docklogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HospitalManagementSytem.docklogin.entity.Appointments;

@Repository
public interface AppointmentsRepository extends JpaRepository<Appointments, Long>{

}
