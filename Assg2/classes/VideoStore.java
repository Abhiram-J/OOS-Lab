package classes;

import java.util.ArrayList;

public class VideoStore{
    public ArrayList<Video> videos;

    public VideoStore(){
        videos = new ArrayList<Video>();
    }

    public void add(Video video) {
       videos.add(video);
    }

    public boolean checkAvailability(String title){
        for(Video video: videos){
            if ( video.title.equals(title)){
                return video.isAvailable;
            }
        }
        return false;
    }

    public void rent(String title){
        for(Video video: videos){
            if (video.title.equals(title) ){
                video.isAvailable = false;
            }
        }
    }

    public void returnVideo(String title){
        for(Video video: videos){
            if ( video.title.equals(title)){
                video.isAvailable = true;
            }
        }
    }

    public void list(){
        for(Video video: videos){
            System.out.println(video.title);
        }
    }

}
