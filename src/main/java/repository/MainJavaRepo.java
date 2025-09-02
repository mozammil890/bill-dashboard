package repository;

import entity.MainTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainJavaRepo extends JpaRepository<MainTable,Long> {

}
