//package com.example.bookshop.config;
//
//import com.example.bookshop.entity.User;
//import com.example.bookshop.repository.UserRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import java.util.List;
//
//
//@Configuration
//public class UserConfig {
//    @Bean
//    CommandLineRunner commandLineRunnerUserConfig(UserRepository userRepository, PasswordEncoder passwordEncoder) {
//        userRepository.deleteAll();
//        return args -> {
//            User user1 = new User("user1", passwordEncoder.encode("haslo123"), "USER");
//            User user2 = new User("admin", passwordEncoder.encode("haslo123"), "ADMIN");
//
//            userRepository.saveAll(List.of(user1, user2));
//        };
//
//    }
//}
