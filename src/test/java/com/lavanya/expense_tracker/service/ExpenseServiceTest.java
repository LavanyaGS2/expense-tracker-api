package com.lavanya.expense_tracker.service;

import com.lavanya.expense_tracker.model.Expense;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ExpenseServiceTest {

    private ExpenseService expenseService;

    @BeforeEach
    void setUp() {
        expenseService = new ExpenseService();
    }

    @Test
    void testAddExpense() {
        Expense expense = new Expense(null, "Lunch", 250, "Food", LocalDate.now());

        Expense savedExpense = expenseService.addExpense(expense);

        assertNotNull(savedExpense.getId());
        assertEquals(1, expenseService.getAllExpenses().size());
    }

    @Test
    void testGetExpensesByCategory() {
        expenseService.addExpense(new Expense(null, "Lunch", 250, "Food", LocalDate.now()));
        expenseService.addExpense(new Expense(null, "Movie", 300, "Entertainment", LocalDate.now()));

        assertEquals(1, expenseService.getExpensesByCategory("Food").size());
    }

    @Test
    void testGetTotalExpenses() {
        expenseService.addExpense(new Expense(null, "Lunch", 250, "Food", LocalDate.now()));
        expenseService.addExpense(new Expense(null, "Movie", 300, "Entertainment", LocalDate.now()));

        assertEquals(550, expenseService.getTotalExpenses());
    }

    @Test
    void testGetTotalByCategory() {
        expenseService.addExpense(new Expense(null, "Lunch", 250, "Food", LocalDate.now()));
        expenseService.addExpense(new Expense(null, "Dinner", 150, "Food", LocalDate.now()));

        assertEquals(400, expenseService.getTotalByCategory("Food"));
    }

    @Test
    void testDeleteExpense() {
        Expense expense = expenseService.addExpense(
                new Expense(null, "Lunch", 250, "Food", LocalDate.now()));

        String result = expenseService.deleteExpense(expense.getId());

        assertEquals("Expense deleted successfully", result);
        assertEquals(0, expenseService.getAllExpenses().size());
    }
}