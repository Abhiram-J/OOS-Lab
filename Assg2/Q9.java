import java.util.Scanner;

import classes.VideoStore;
import classes.Video;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore videoStore = new VideoStore();
        System.out.println("1.Add video");
        System.out.println("2.Check availability");
        System.out.println("3.Rent a video");
        System.out.println("4.Return");
        System.out.println("5.List the inventory");
        System.out.println("6.Exit");

        while (true) {

            System.out.println("Enter choice :");

            int c = sc.nextInt();
            String title, temp;

            switch (c) {
                case 1:
                    System.out.println("N :");
                    Integer n = sc.nextInt();
                    System.out.println("Titles :");
                    temp = sc.nextLine();
                    while (n > 0) {
                        title = sc.nextLine();
                        Video video = new Video(title, true);
                        videoStore.add(video);
                        n--;
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Title :");
                    temp = sc.nextLine();
                    title = sc.nextLine();
                    if (videoStore.checkAvailability(title)) {
                        System.out.println("Available");
                    } else {
                        System.out.println("Not Available");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Title :");
                    temp = sc.nextLine();
                    title = sc.nextLine();
                    if (videoStore.checkAvailability(title)) {
                        videoStore.rent(title);
                    } else {
                        System.out.println("Video not available");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Title :");
                    temp = sc.nextLine();
                    title = sc.nextLine();
                    videoStore.returnVideo(title);
                    System.out.println();
                    break;

                case 5:
                    videoStore.list();
                    System.out.println();
                    break;
                default:
                    sc.close();
                    return;
            }

        }

    }

}
