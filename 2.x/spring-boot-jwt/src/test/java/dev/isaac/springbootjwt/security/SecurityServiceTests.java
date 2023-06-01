package dev.isaac.springbootjwt.security;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SecurityServiceTests {

    @Autowired
    private SecurityService securityService;

    /**
     * token check url : https://jwt.io/
     * */
    @Test
    @DisplayName("createTokenTest")
    public void createTokenTest() {
        String token = securityService.createToken("Hello", 50000);
        System.out.println("token : " + token);
    }

}
