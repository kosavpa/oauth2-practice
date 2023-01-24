package owlhome.practice.repos;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import owlhome.practice.dto.Userok;


@Component
public interface UserRepos extends CrudRepository<Userok, Long> {
    Userok findByUsername(String username);
}
