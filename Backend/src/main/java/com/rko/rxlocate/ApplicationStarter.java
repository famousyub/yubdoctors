package com.rko.rxlocate;

import com.rko.rxlocate.domain.User;
import com.rko.rxlocate.domain.enums.Role;
import com.rko.rxlocate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;



/*


 private String firstname;

    private String lastname;

    @NotBlank(message = "Username is mandatory")
    private String username;

    @NotBlank(message = "Password is mandatory")
    private String password;
 */


//@Component
public class ApplicationStarter  implements CommandLineRunner {



   @Autowired
   private UserRepository userRepository ;

   @Autowired
   private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {


         User user = new User();
         user.setFirstname("ayoub");
         user.setLastname("smayen");
         user.setPassword(passwordEncoder.encode("123456Az@"));
         user.setUsername("ayoub@gmail.com");
         user.setRole(Role.ROLE_ADMIN);

         userRepository.save(user);
    }
}
