public class User {
    private String name;
    private String email;
    private NotificationService notificationService;

    public User(String name, String email, NotificationService notificationService) {
        this.name = name;
        this.email = email;
        this.notificationService = notificationService;
    }

    public void receiveEmailNotification(String message){
        notificationService.sendNotification("Email received:\n" + message);
    }
    public String getName() {
        return name;
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
