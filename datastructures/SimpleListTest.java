package dk.cphbusiness.dat.datastructures;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public interface SimpleListTest {

    SimpleList createNewSimpleList();

    @Test
    default void newListIsEmpty()
    {
        SimpleList s = createNewSimpleList();
        assertEquals(0, s.size());
    }

    @Test
    default void throwsNoSuchElementException()
    {
        SimpleList s = createNewSimpleList();
        assertThrows(NoSuchElementException.class, () -> {s.takeFront();});
    }
    @Test
    default void useCaseTest()
    {
        SimpleList s = createNewSimpleList();
        s.addFront(2);
        assertEquals(1, s.size());
        s.addEnd(3);
        assertEquals(2,s.size());
        s.takeFront();
        s.addFront(44);
        s.addFront(22);
        s.takeEnd();
        assertEquals(2, s.size());
    }
}
