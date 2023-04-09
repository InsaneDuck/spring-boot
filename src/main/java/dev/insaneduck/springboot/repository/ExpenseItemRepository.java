package dev.insaneduck.springboot.repository;

import dev.insaneduck.springboot.model.ExpenseItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseItemRepository extends JpaRepository<ExpenseItem, Integer>
{
}
