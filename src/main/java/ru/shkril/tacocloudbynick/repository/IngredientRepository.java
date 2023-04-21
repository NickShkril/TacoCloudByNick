package ru.shkril.tacocloudbynick.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.shkril.tacocloudbynick.model.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, String> {
}
