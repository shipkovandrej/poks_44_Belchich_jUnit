import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    @DisplayName("�������� �������� ������� � ����� �����������")
    public void testUserCreation() {
        // ��������� ��� ������������
        String email = "example@email.com";
        String login = "exampleLogin";

        // �������� ������� User
        User user = new User(login, email);

        // ��������, ��� �������� ���� ����������� ���������
        assertEquals(email, user.getEmail());
        assertEquals(login, user.getLogin());
    }

    @Test
    @DisplayName("�������� �������� ������� ��� ����������")
    public void testCreateUserWithoutParameters() {
        // ���������, ��� ��� ������ ������������ ��� ���������� ��������� ����������
        Assertions.assertThrows(IllegalArgumentException.class, User::new);
    }
    @Nested
    @DisplayName("�������� ��������� ��������")
    class check{
        @Test
        @DisplayName("��������� email")
        public void testEmail() {
            // ���������, ��� ��� ������ ������������ ��� ���������� ��������� ����������
            Assertions.assertThrows(IllegalArgumentException.class, () -> new User("login", "email@example"));
        }

        @Test
        @DisplayName("��������� ������")
        public void testLogin() {
            // ���������, ��� ��� ������ ������������ ��� ���������� ��������� ����������
            Assertions.assertThrows(IllegalArgumentException.class, () -> new User("log", "email@example.com"));
        }
    }

}
