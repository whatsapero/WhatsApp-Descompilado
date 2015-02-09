package com.googlecode.mp4parser.authoring;

import com.googlecode.mp4parser.util.Matrix;
import java.util.Date;

public class TrackMetaData implements Cloneable {
    private Date creationTime;
    private int group;
    private double height;
    private String language;
    int layer;
    private Matrix matrix;
    private Date modificationTime;
    private long timescale;
    private long trackId;
    private float volume;
    private double width;

    public TrackMetaData() {
        this.modificationTime = new Date();
        this.creationTime = new Date();
        this.matrix = Matrix.ROTATE_0;
        this.trackId = 1;
        this.group = 0;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public long getTimescale() {
        return this.timescale;
    }

    public void setTimescale(long timescale) {
        this.timescale = timescale;
    }

    public Date getModificationTime() {
        return this.modificationTime;
    }

    public void setModificationTime(Date modificationTime) {
        this.modificationTime = modificationTime;
    }

    public Date getCreationTime() {
        return this.creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public long getTrackId() {
        return this.trackId;
    }

    public void setTrackId(long trackId) {
        this.trackId = trackId;
    }

    public int getLayer() {
        return this.layer;
    }

    public void setLayer(int layer) {
        this.layer = layer;
    }

    public float getVolume() {
        return this.volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public int getGroup() {
        return this.group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Matrix getMatrix() {
        return this.matrix;
    }

    public void setMatrix(Matrix matrix) {
        this.matrix = matrix;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
