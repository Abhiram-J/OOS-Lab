import java.util.ArrayList;
import java.util.Scanner;

class Meeting {
    String meetingTitle;
    String meetingDate;
    String meetingStartTime;
    String meetingEndTime;
    String meetingDescription;

    public Meeting(String title, String date, String startTime, String endTime, String description) {
        this.meetingTitle = title;
        this.meetingDate = date;
        this.meetingStartTime = startTime;
        this.meetingEndTime = endTime;
        this.meetingDescription = description;
    }

    public boolean isOverlapping(Meeting other) {
        return this.meetingDate.equals(other.meetingDate) &&
               !this.meetingStartTime.equals(other.meetingEndTime) &&
               !this.meetingEndTime.equals(other.meetingStartTime) &&
               (this.meetingStartTime.compareTo(other.meetingEndTime) < 0 ||
                this.meetingEndTime.compareTo(other.meetingStartTime) > 0);
    }
}

class DepartmentMeetingScheduler {
    private ArrayList<Meeting> meetings;

    public DepartmentMeetingScheduler() {
        this.meetings = new ArrayList<>();
    }

    public void scheduleMeeting(String title, String date, String startTime, String endTime, String description) {
        Meeting newMeeting = new Meeting(title, date, startTime, endTime, description);

        boolean isCollision = false;
        for (Meeting existingMeeting : meetings) {
            if (newMeeting.isOverlapping(existingMeeting)) {
                isCollision = true;
                break;
            }
        }

        if (!isCollision) {
            meetings.add(newMeeting);
            System.out.println("Scheduled successfully");
        } else {
            System.out.println("Collision! Already another meeting is scheduled");
        }
    }

    public void displayMeetings(String date) {
        System.out.println("Meetings on " + date + ":");
        for (Meeting meeting : meetings) {
            if (meeting.meetingDate.equals(date)) {
                System.out.println("Title: " + meeting.meetingTitle);
                System.out.println("Start Time: " + meeting.meetingStartTime);
                System.out.println("End Time: " + meeting.meetingEndTime);
                System.out.println("Description: " + meeting.meetingDescription);
                System.out.println();
            }
        }
    }

}

public class Q3 {

    public static void main(String[] args) {
        DepartmentMeetingScheduler scheduler = new DepartmentMeetingScheduler();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Schedule Meeting");
            System.out.println("2. List Meetings");
            System.out.println("3. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Title - ");
                    String title = sc.nextLine();
                    System.out.print("Date - ");
                    String date = sc.nextLine();
                    System.out.print("Start time - ");
                    String startTime = sc.nextLine();
                    System.out.print("End time - ");
                    String endTime = sc.nextLine();
                    System.out.print("Description - ");
                    String description = sc.nextLine();
                    scheduler.scheduleMeeting(title, date, startTime, endTime, description);
                    break;
                case 2:
                    System.out.print("Enter date to list meetings - ");
                    String listDate = sc.nextLine();
                    scheduler.displayMeetings(listDate);
                    break;
                case 3:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}