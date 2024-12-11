package ua.ucu.edu.task3;

import lombok.Getter;

@Getter
public class ProxyImage implements MyImage {
    private RealImage realImage;
    private String filepath;

    public ProxyImage(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filepath);
        }
        realImage.display();
    }
}