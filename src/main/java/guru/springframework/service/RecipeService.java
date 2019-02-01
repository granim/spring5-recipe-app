package guru.springframework.service;

import guru.springframework.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface RecipeService {

  Set<Recipe> getRecipes();

}
