package at.saifee.simpleapp.repository;

import at.saifee.simpleapp.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {
}
