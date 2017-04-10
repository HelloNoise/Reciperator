package fi.haagahelia.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface FaveRecipeRepository extends CrudRepository<FaveRecipe, Long> {
    List<FaveRecipe> findByRecipeName(String recipeName);
}
