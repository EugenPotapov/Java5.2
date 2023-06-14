package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class MonthCalculateTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/test.csv")
    public void testMonthCalculateLimit(int expected, int expenses, int income, int threshold) {
        MonthCalculate service = new MonthCalculate();

        int actual = service.getCount(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

}
