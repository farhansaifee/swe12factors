package at.saifee.simpleapp.controller;

import at.saifee.simpleapp.model.TodoItem;
import at.saifee.simpleapp.repository.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoItemController {
    @Autowired
    private TodoItemRepository repository;

    private static final Logger logger = LoggerFactory.getLogger(TodoItemController.class);

    @PostMapping
    public TodoItem createTodoItem(@RequestBody TodoItem item) {
        logger.info("TODO Item created.");
        return repository.save(item);
    }

    @GetMapping
    public List<TodoItem> getAllTodoItems() {
        logger.info("Here are all TODO items.");
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public TodoItem getTodoItem(@PathVariable Long id) {
        logger.info("Here is a TODO item with the ID " + id);
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public TodoItem updateTodoItem(@PathVariable Long id, @RequestBody TodoItem updatedItem) {
        TodoItem existingItem = repository.findById(id).orElse(null);
        if (existingItem != null) {
            existingItem.setDescription(updatedItem.getDescription());
            existingItem.setCompleted(updatedItem.isCompleted());
            logger.info("TODO updated.");
            return repository.save(existingItem);
        }
        logger.error("Error: TODO could not be updated");
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteTodoItem(@PathVariable Long id) {
        logger.info("TODO Item deleted.");
        repository.deleteById(id);
    }

}
