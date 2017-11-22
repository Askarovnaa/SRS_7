package kz.kaznitu.lessons.start;

import kz.kaznitu.lessons.interfaces.Model;
import kz.kaznitu.lessons.interfaces.Ozu;
import kz.kaznitu.lessons.interfaces.Phone;
import kz.kaznitu.lessons.interfaces.VideoKarta;

public class ModelT1000 extends BaseModel{
    private String color;
    private int year;
    private boolean soundEnabled;

    public ModelT1000() {

    }

    public ModelT1000(Model model, Ozu ozu, VideoKarta videoKarta) {
        super(model, ozu, videoKarta);
    }

    public ModelT1000(Model model, Ozu ozu, VideoKarta videoKarta, String color, int year, boolean soundEnabled) {
        super(model, ozu, videoKarta);
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public ModelT1000(String color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public void action() {
        getOzu().memory();
        getModel().model();
        getVideoKarta().videokart();
        System.out.println("color notebook: " + color);
        System.out.println("Year of issue: " + year);
        System.out.println("sound active: " + soundEnabled);
    }

    public void game() {
        System.out.println("T1000 is games!");
    }
}

