package at.saifee.simpleapp.controller;

import at.saifee.simpleapp.model.TodoItem;
import at.saifee.simpleapp.repository.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// src/main/java/com/example/todo/controller/TodoItemController.java
@RestController
@RequestMapping("/api/todo")
public class TodoItemController {
    @Autowired
    private TodoItemRepository repository;

    @PostMapping
    public TodoItem createTodoItem(@RequestBody TodoItem item) {
        return repository.save(item);
    }

    @GetMapping
    public List<TodoItem> getAllTodoItems() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public TodoItem getTodoItem(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public TodoItem updateTodoItem(@PathVariable Long id, @RequestBody TodoItem updatedItem) {
        TodoItem existingItem = repository.findById(id).orElse(null);
        if (existingItem != null) {
            existingItem.setDescription(updatedItem.getDescription());
            existingItem.setCompleted(updatedItem.isCompleted());
            return repository.save(existingItem);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteTodoItem(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
