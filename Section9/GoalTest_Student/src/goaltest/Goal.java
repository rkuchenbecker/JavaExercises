
package goaltest;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;

import javafx.scene.input.MouseEvent;


public class Goal {

    private Image dukeImage;
    ImageView dukeImageView ;
    private Image gloveImage;
    ImageView gloveImageView;
    private AudioClip tone;

    public Goal(){
        this(0,0);
    }

    public Goal(int x, int y){
        dukeImage = new Image(getClass().getResource("Images/Duke.png").toString());
        gloveImage = new Image(getClass().getResource("Images/Glove.png").toString());
        dukeImageView = new ImageView(dukeImage);
        gloveImageView = new ImageView(gloveImage);
        tone = new AudioClip(getClass().getResource("Audio/Note5.wav").toString());

        dukeImageView.setX(x);
        dukeImageView.setY(y);
        gloveImageView.setPreserveRatio(true);
        gloveImageView.setFitWidth(25);
        gloveImageView.setX(x + dukeImage.getWidth() - 25);
        gloveImageView.setY(y);
        //System.out.println(dukeImage.getWidth());
        GoalTest.root.getChildren().addAll(dukeImageView , gloveImageView);
        //interactions();
    }
    private void interactions(){
        //Exercise 4   
        dukeImageView.setOnMousePressed((MouseEvent me) -> {tone.play();});
        dukeImageView.setOnMouseDragged((MouseEvent me) -> {
            System.out.println("X: " + dukeImageView.getX());
            System.out.println("Y: " + dukeImageView.getY());});
    }
}
