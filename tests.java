import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class tests {


    private TimetableAPI timetableAPI;
    private Notification notification;

    @BeforeEach
    void setUp() {
        timetableAPI = new TimetableAPI();
        notification = new Notification();
    }

    @AfterEach
    void tearDown() {
        timetableAPI = null;
        notification = null;
    }

    @Nested
    class TimetableTest {

        @Test
        void addingTimetable() {
            Timetable newTimetable = new Timetable("Computer Forensics", 20101948, 4);
            assertTrue(timetableAPI.add(newTimetable));

            assertEquals(newTimetable, timetableAPI.getTimetable(0));
        }

        @Test
        void removingTimetable() {
            Timetable timetable1 = new Timetable("Computer Forensics", 20101948, 4);
            timetableAPI.add(timetable1);

            assertTrue(timetableAPI.delete(timetable1));
        }
    }

    @Nested
    class NotificationTest {

        @Test
        void sendingNotification() {
            assertEquals("Your next class: IT221, Software Engineering Practice", notification.sendNotification());
        }
    }
}
