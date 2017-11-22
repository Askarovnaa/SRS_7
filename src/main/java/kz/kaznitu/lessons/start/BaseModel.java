package kz.kaznitu.lessons.start;


import kz.kaznitu.lessons.interfaces.Model;
import kz.kaznitu.lessons.interfaces.Ozu;
import kz.kaznitu.lessons.interfaces.Phone;
import kz.kaznitu.lessons.interfaces.VideoKarta;


public abstract class BaseModel implements Phone {
    private Model model;
    private Ozu ozu;
    private VideoKarta videoKarta;

    public BaseModel() {

        System.out.println(this + " - BaseModelconstructor()");
    }

    public BaseModel(Model model, Ozu ozu, VideoKarta videoKarta) {
        this();
        this.model = model;
        this.ozu = ozu;
        this.videoKarta = videoKarta;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Ozu getOzu() {
        return ozu;
    }

    public void setOzu(Ozu ozu) {
        this.ozu = ozu;
    }

    public VideoKarta getVideoKarta() {
        return videoKarta;
    }

    public void setVideoKarta(VideoKarta videoKarta) {
        this.videoKarta = videoKarta;
    }
}