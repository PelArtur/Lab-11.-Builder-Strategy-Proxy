package com.example.lab11.task3;

public class ProxyImage implements MyImage {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename)
    {
        this.filename = filename;
        realImage = new RealImage(filename);
    }

    @Override
    public void display()
    {
        realImage.display();
    }
}
