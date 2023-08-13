package com.example.taskManagerBackend.DTO;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;

@CrossOrigin(origins = "*")
public interface TaskDto {

    int getTaskId();

    String getDescription();

    Date getDueDate();

    String getPriority();

    String getStatus();

    int getAge();

    int getBed();

    String getFacility();

    String getPatientName();

    String getLocation();

    int getRoom();

    String getUnitName();


}
