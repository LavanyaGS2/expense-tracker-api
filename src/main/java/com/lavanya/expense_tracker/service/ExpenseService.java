package com.lavanya.expense_tracker.service;

import com.lavanya.expense_tracker.model.Expense;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExpenseService {

    private final List<Expense> expenses = new ArrayList<>();
    private Long nextId = 1L;

    // Add Expense
    public Expense addExpense(Expense expense) {
        expense.setId(nextId++);
        expenses.add(expense);
        return expense;
    }

    // View All Expenses
    public List<Expense> getAllExpenses() {
        return expenses;
    }

    // Filter Expenses by Category
    public List<Expense> getExpensesByCategory(String category) {
        List<Expense> result = new ArrayList<>();

        for (Expense expense : expenses) {
            if (expense.getCategory().equalsIgnoreCase(category)) {
                result.add(expense);
            }
        }

        return result;
    }

    // Calculate Total Expenses
    public double getTotalExpenses() {
        double total = 0;

        for (Expense expense : expenses) {
            total += expense.getAmount();
        }

        return total;
    }

    // Calculate Total Expenses by Category
    public double getTotalByCategory(String category) {
        double total = 0;

        for (Expense expense : expenses) {
            if (expense.getCategory().equalsIgnoreCase(category)) {
                total += expense.getAmount();
            }
        }

        return total;
    }

    // Delete Expense
    public String deleteExpense(Long id) {
        boolean removed = expenses.removeIf(expense -> expense.getId().equals(id));

        if (removed) {
            return "Expense deleted successfully";
        }

        return "Expense not found";
    }
}
