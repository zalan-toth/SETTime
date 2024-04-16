import java.util.ArrayList;

public class TimetableAPI {
        ArrayList<Timetable> timetables = new ArrayList<>();

        public boolean add(Timetable timetable) {
            return timetables.add(timetable);
        }

        public Timetable getTimetable(int i){
            return timetables.get(i);
        }

        public boolean delete(Timetable timetable) {
            return timetables.remove(timetable);
        }
}
