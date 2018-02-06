package uk.ac.gcu.wpd2.lab.katrinhartmann.messageboard;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 06/02/2018.
 */
public class MainTest {
    @Before
    public void setUp() throws Exception {
        //runs before each tests
        //used to set up any infrastructure that is used for the tests
        //such as set up connections to a database
    }

    @After
    public void tearDown() throws Exception {
        //runs after the test
        //often used to clear used resources,
        //such as close any open database connections
    }

    @Test
    public void testStart() throws Exception {
        MessageBoard mb = new MessageBoard("Message Board 1");
        assertEquals("Message Board 1", mb.getmBTitle());
    }

    @Test
    public void testTopicListEmpty() throws Exception {
        MessageBoard mb = new MessageBoard("Message Board 1");
        assertTrue(mb.getTopicList().isEmpty());
    }

}