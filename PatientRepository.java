package com.example.taskManagerBackend.Repository;

import com.example.taskManagerBackend.DTO.PatientDto;
import com.example.taskManagerBackend.Model.PatientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepository extends JpaRepository<PatientModel, Integer> {
    @Query(value = "select t.description as description,t.status as status,p.name as patientName,p.age as age," + "p.location as location From task_table t join patient_tb as p on" + " p.id= t.patient_id where p.name like %:name% ", nativeQuery = true)
    List<PatientDto> searchTask(@Param("name") String name);
}
