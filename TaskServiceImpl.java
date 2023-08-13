package com.example.taskManagerBackend.Service;

import com.example.taskManagerBackend.DTO.PatientDto;
import com.example.taskManagerBackend.DTO.TaskDto;
import com.example.taskManagerBackend.Repository.PatientRepository;
import com.example.taskManagerBackend.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<TaskDto> taskDetails() {
        return taskRepository.listTasks();
    }

    @Override
    public List<PatientDto> searchData(String name) {

        List<PatientDto> patientList = patientRepository.searchTask(name);
        try {
            if (name.length() < 15) {
                System.out.println("accepted");
                return patientList;
            } else {
                throw new NameLengthException("Name too long..");
            }
        } catch (NameLengthException e) {
            System.out.println(e);
        }


        return patientList;


    }


}

