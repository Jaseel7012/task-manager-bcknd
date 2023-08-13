package com.example.taskManagerBackend.Repository;

import com.example.taskManagerBackend.DTO.TaskDto;
import com.example.taskManagerBackend.Model.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TaskRepository extends JpaRepository<TaskModel, Integer> {
    @Query(value = "select t.id as taskId,t.description as description,t.due_date as dueDate,t.priority as priority," +
            "t.status as status,p.age as age ,p.bed as bed,p.facility as facility,p.room as room,p.location as location," +
            "p.name as patientName,p.unit_name as unitName from patient_tb p join task_table t on p.id=t.patient_id" +
            " ORDER BY due_date DESC ", nativeQuery = true)
    List<TaskDto> listTasks();


}
