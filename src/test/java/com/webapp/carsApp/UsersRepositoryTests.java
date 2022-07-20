package com.webapp.carsApp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) /* to skip in-memory database */
@Rollback(false) /* all operations will be commited to the db */
public class UsersRepositoryTests {

    @Autowired
    private UsersRepository usersRepo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser() {
        User user = new User();
        user.setE_mail("peter@gmail.com");
        user.setPassword("password23");
        user.setName("Peter");
        user.setLast_name("Pen");
        user.setBirthdate("1911-12-01");
        user.setGender("M");
        user.setAddress("Nevertheland");
        user.setTelephone_no("001122334455");

        User savedUser = usersRepo.save(user);

        User existUser = entityManager.find(User.class, savedUser.getId());

        assertThat(existUser.getE_mail()).isEqualTo(user.getE_mail());
    }

    @Test
    public void testFindUserByEmail() {
        String e_mail = "dace@gmail.com";

        User user = usersRepo.findByEmail(e_mail);

        assertThat(user).isNotNull();
    }
}
