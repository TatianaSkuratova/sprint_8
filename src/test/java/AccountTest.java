import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @ParameterizedTest
    @CsvSource({
            "Вася Пупкин, true",
            "Вова, false",
            "'Николай Иванов ', false",
            "Николай Иванов, true",
    })
    public void isAdultForBoundaryValuesIsValid(String name, boolean result) {
        Account account = new Account(name);
        assertEquals(result, account.checkNameToEmboss());
    }
}