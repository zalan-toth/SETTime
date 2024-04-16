public class Notification {

    String classroom = "IT221";

    String module = "Software Engineering Practice";

    public String sendNotification() {
        return "Your next class: " + classroom + ", " + module;
    }
}
