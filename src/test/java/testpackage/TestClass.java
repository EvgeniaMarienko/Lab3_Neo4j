package testpackage;

import packagewithmainclass.Lab3_main;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestClass {

    private Lab3_main testInstance = new Lab3_main();

    @Test
    public void task3aIsCorrect() {
        String expected = "[[\"Ada\"], [\"Andrew\"], [\"Bob\"], [\"Dima\"], [\"Grishka\"], [\"Liza\"], [\"Misha\"], [\"Nazar\"], [\"Taras\"]]";
        assertEquals(expected, testInstance.task3a());
    }

    @Test
    public void task3bIsCorrect() {
        String expected = "[[\"Dima\", 23], [\"Nazar\", 22], [\"Taras\", 21], [\"Bob\", 20], [\"Andrew\", 19], [\"Grishka\", 17], [\"Misha\", 16]]";
        assertEquals(expected, testInstance.task3b("male"));
    }

    @Test
    public void task3cIsCorrect() {
        String expected = "[[\"Andrew\"], [\"Bob\"], [\"Misha\"]]";
        assertEquals(expected, testInstance.task3c("Ada"));
    }

    @Test
    public void task3dIsCorrect() {
        String expected = "[[\"Ada\"], [\"Ada\"], [\"Ada\"], [\"Grishka\"], [\"Taras\"]]";
        assertEquals(expected, testInstance.task3d("Ada"));
    }

    @Test
    public void task3eIsCorrect() {
        String expected = "[[\"Ada\", 3], [\"Andrew\", 2], [\"Bob\", 2], [\"Dima\", 1], [\"Grishka\", 1], [\"Liza\", 1], [\"Misha\", 1], [\"Nazar\", 1], [\"Taras\", 2]]";
        assertEquals(expected, testInstance.task3e());
    }

    @Test
    public void task3fIsCorrect() {
        String expected = "[[\"KPI\"], [\"NAU\"]]";
        assertEquals(expected, testInstance.task3f());
    }

    @Test
    public void task3gIsCorrect() {
        String expected = "[[\"NAU\"]]";
        assertEquals(expected, testInstance.task3g("Grishka"));
    }

    @Test
    public void task3hIsCorrect() {
        String expected = "[[\"NAU\", 5], [\"KPI\", 4]]";
        assertEquals(expected, testInstance.task3h());
    }

//
//    @Test
//    public void task3iIsCorrect() {
//        String expected = "[[\"Bob\", 2], [\"Liza\", 1], [\"Nazar\", 1], [\"Andrew\", 1], [\"Dima\", 1], [\"Grishka\", 1], [\"Taras\", 1], [\"Misha\", 1]]";
//        assertEquals(expected, testInstance.task3i());
//    }

    @Test
    public void task3jIsCorrect() {
        String expected = "[[4]]";
        assertEquals(expected, testInstance.task3j("Misha"));
    }

    @Test
    public void task4aIsCorrect() {
        String expected = "[[[\"Bob First post\", \"Bob second post\", \"Bob third post\", \"Bob fourth post\"]]]";
        assertEquals(expected, testInstance.task4a("Bob"));
    }

    @Test
    public void task4bIsCorrect() {
        String expected = "[[[\"Andrew First post\", \"Andrew second post\", \"Andrew third post\"]], [[]], [[]], [[\"Grishka First post\", \"Grishka second post\", \"Grishka third post\"]], [[\"Taras First post\", \"Taras second post\"]], [[\"Nazar First post\", \"Nazar second post\", \"Nazar third post\", \"Grishka fourth post\"]], [[\"Dima second post\"]], [[\"Misha First post\", \"Misha second post\"]], [[\"Liza second post\"]]]";
        assertEquals(expected, testInstance.task4b(15));
    }

    @Test
    public void task4cIsCorrect() {
        String expected = "[[\"Bob\", 4], [\"Nazar\", 4], [\"Andrew\", 3], [\"Grishka\", 3], [\"Dima\", 3], [\"Liza\", 3], [\"Ada\", 2], [\"Taras\", 2], [\"Misha\", 2]]";
        assertEquals(expected, testInstance.task4c());
    }

    @Test
    public void task4dIsCorrect() {
        String expected = "[[\"Dima\", [\"Dima First post\", \"Dima second post\", \"Dima third post\"]]]";
        assertEquals(expected, testInstance.task4d("Dima"));
    }

    @Test
    public void task4iIsCorrect() {
        String expected = "[[\"Grishka\", 18], [\"Andrew\", 17], [\"Nazar\", 17], [\"Taras\", 16], [\"Misha\", 16], [\"Dima\", 15], [\"Liza\", 15], [\"Bob\", 14], [\"Ada\", 14]]";
        assertEquals(expected, testInstance.task4i());
    }
	
}
