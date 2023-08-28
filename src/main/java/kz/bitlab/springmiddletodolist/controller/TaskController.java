package kz.bitlab.springmiddletodolist.controller;


import kz.bitlab.springmiddletodolist.dto.TaskDto;
import kz.bitlab.springmiddletodolist.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/task")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping
    public List<TaskDto> get() {
        return taskService.getAll();
    }

    @GetMapping(value = "{id}")
    public TaskDto get(@PathVariable(name = "id") Long id) {
        return taskService.get(id);
    }

    @PostMapping
    public TaskDto add(@RequestBody TaskDto task) {
        return taskService.add(task);
    }

    @PutMapping
    public TaskDto update(@RequestBody TaskDto task) {
        return taskService.update(task);
    }

    @DeleteMapping(value = "{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        taskService.delete(id);
    }

}