package com.docker.process.service;

import com.docker.process.document.Process;
import com.docker.process.repository.ProcessRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static java.util.Optional.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProcessServiceTest {


    @Mock
    private ProcessRepository repository;
    @InjectMocks
    private ProcessService service;

    @Test
    void findAll() {
        Process process1 = new Process("","","","",""
                ,"","","","",
                "");
        Process process2 = new Process("5fa537ae52330657a188b781","123","trf-4","Civil","123.678.910-12"
                ,"1234/5567/8919-11","São Paulo/SP","882975384","jroge-4@gmail.com",
                "");
        List<Process> list = new ArrayList<>();
        list.add(process1);
        list.add(process2);
        when(repository.findAll()).thenReturn(list);
        assertEquals(service.findAll(),list);

    }

    @Test
    void findId() {

        Process process = new Process("5fa537ae52330657a188b781","123","trf-4","Civil","123.678.910-12"
                ,"1234/5567/8919-11","São Paulo/SP","882975384","jroge-4@gmail.com",
                "");
        when(repository.findById("5fa537ae52330657a188b781")).thenReturn(of(process));
        assertEquals(service.findId("5fa537ae52330657a188b781"),process);
    }



    @Test
    void saveProcess() {
        Process process = new Process("5fa537ae52330657a188b781","123","trf-4","Civil","123.678.910-12"
                ,"1234/5567/8919-11","São Paulo/SP","882975384","jroge-4@gmail.com",
                "");
        when(repository.save(process)).thenReturn(process);
        assertEquals(service.saveProcess(process),process);

    }

    @Test
    void update() {

    }

    @Test
    void delete() {
    }


}