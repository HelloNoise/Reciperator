package fi.haagahelia.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface FridgeRepository extends CrudRepository<Fridge, Long> {
    List<Fridge> findByFridgeName(String fridgeName);
}
