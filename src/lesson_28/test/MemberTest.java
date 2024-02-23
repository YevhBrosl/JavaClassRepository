package lesson_28.test;

import lesson_28.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MemberTest {

    Member member;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q$";

    @BeforeEach
    void setUp() {
        member = new Member(startEmail, startPassword);
    }

    @Test
    void testValidEmailSet() {
        String validEmail = "valid@test.com";
        System.out.println("getEmail after: " + member.getEmail());

        member.setEmail(validEmail);

        System.out.println("getEmail before: " + member.getEmail());
        Assertions.assertEquals(validEmail, member.getEmail());
    }

    @ParameterizedTest
    @MethodSource("invalidEmailData")
    public void testInvalidEmail(String invalidEmail) {
        member.setEmail(invalidEmail);
        Assertions.assertEquals(startEmail, member.getEmail());
    }

    static Stream<String> invalidEmailData() {
        return Stream.of(
                "test@em@il.net",
                "test@emailnet",
                "test@email.net.",
                "test@.email.net",
                "test@emailne.t",
                "test@.em&il.net",
                "test@.em.ail.net",
                "@test.email.net"
        );
    }

    @Test
    void testValidPasswordSet() {
        String validPassword = "Valid12#";
        System.out.println("getPassword after: " + member.getPassword());

        member.setPassword(validPassword);

        System.out.println("getPassword before: " + member.getPassword());
        Assertions.assertEquals(validPassword, member.getPassword());
    }

    @ParameterizedTest
    @MethodSource("invalidPasswordData")
    public void testInvalidPassword(String invalidPassword) {
        member.setPassword(invalidPassword);
        Assertions.assertEquals(startPassword, member.getPassword());
    }

    static Stream<String> invalidPasswordData() {
        return Stream.of(
                "",
                "1",
                "12345678",
                "qwertyuio",
                "QWERTYUIO",
                "!@#$%&*(]",
                "QWertyuio",
                "Qwerty123",
                "QWERTY123",
                "qwerty123",
                "qwerty@#$",
                "QWERTY@#$",
                "Qwerty@#$",
                "12345@#$"
        );
    }
}
