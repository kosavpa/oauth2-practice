package owlhome.practice.configs;


import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import owlhome.practice.dto.Userok;
import owlhome.practice.repos.UserRepos;


@Configuration
public class RunnerConfig {
    @Bean
    public ApplicationRunner applicationRunner(UserRepos repo, PasswordEncoder encoder) {
        return args -> {
            repo.save(new Userok("habuma", encoder.encode("hpwd"), "ROLE_ADMIN"));
        };
    }
}
