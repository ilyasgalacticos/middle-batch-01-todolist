package kz.bitlab.springmiddletodolist.mapper;


import kz.bitlab.springmiddletodolist.dto.TaskDto;
import kz.bitlab.springmiddletodolist.model.Task;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    @Mapping(source = "taskLevel", target = "level")
    Task toEntity(TaskDto taskDto);

    @Mapping(source = "level", target = "taskLevel")
    TaskDto toDto(Task task);

    List<TaskDto> toDtoList(List<Task> tasks);

}
