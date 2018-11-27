package geco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {

    private PasswordGeneration password;

    @Before
    public void setUp() throws Exception {
        password = new PasswordGeneration();
    }

    @Test
    public void getRandomPassword() {
        Assert.assertNotEquals(password.getRandomPassword(),password.getRandomPassword());
    }
}