package kz.bitlab.springmiddletodolist.service;

import kz.bitlab.springmiddletodolist.dto.TaskDto;
import kz.bitlab.springmiddletodolist.mapper.TaskMapper;
import kz.bitlab.springmiddletodolist.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    public List<TaskDto> getAll() {
        return taskMapper.toDtoList(taskRepository.findAll());
    }

    public TaskDto add(TaskDto task) {
        return taskMapper.toDto(taskRepository.save(taskMapper.toEntity(task)));
    }

    public TaskDto update(TaskDto task) {
        return taskMapper.toDto(taskRepository.save(taskMapper.toEntity(task)));
    }

    public TaskDto get(Long id) {
        return taskMapper.toDto(taskRepository.findById(id).orElse(null));
    }

    public void delete(Long id) {
        taskRepository.deleteById(id);
    }

}
