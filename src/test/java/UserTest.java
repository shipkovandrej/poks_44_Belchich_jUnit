import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    @DisplayName("Проверка создания объекта с двумя параметрами")
    public void testUserCreation() {
        // Аргументы для конструктора
        String email = "example@email.com";
        String login = "exampleLogin";

        // Создание объекта User
        User user = new User(login, email);

        // Проверка, что атрибуты были установлены правильно
        assertEquals(email, user.getEmail());
        assertEquals(login, user.getLogin());
    }

    @Test
    @DisplayName("Проверка создания объекта без параметров")
    public void testCreateUserWithoutParameters() {
        // Проверяем, что при вызове конструктора без параметров возникнет исключение
        Assertions.assertThrows(IllegalArgumentException.class, User::new);
    }
    @Nested
    @DisplayName("Проверка установки значений")
    class check{
        @Test
        @DisplayName("Установка email")
        public void testEmail() {
            // Проверяем, что при вызове конструктора без параметров возникнет исключение
            Assertions.assertThrows(IllegalArgumentException.class, () -> new User("login", "email@example"));
        }

        @Test
        @DisplayName("Установка логина")
        public void testLogin() {
            // Проверяем, что при вызове конструктора без параметров возникнет исключение
            Assertions.assertThrows(IllegalArgumentException.class, () -> new User("log", "email@example.com"));
        }
    }

}
