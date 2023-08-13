package com.example.taskManagerBackend.Service;

import com.example.taskManagerBackend.DTO.PatientDto;
import com.example.taskManagerBackend.DTO.TaskDto;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "*")
public interface TaskService {

    List<TaskDto> taskDetails();

    List<PatientDto> searchData(String name);
}
