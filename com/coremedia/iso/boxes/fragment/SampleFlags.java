package com.coremedia.iso.boxes.fragment;

import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import java.nio.ByteBuffer;

public class SampleFlags {
    private int reserved;
    private int sampleDegradationPriority;
    private int sampleDependsOn;
    private int sampleHasRedundancy;
    private int sampleIsDependedOn;
    private boolean sampleIsDifferenceSample;
    private int samplePaddingValue;

    public SampleFlags(ByteBuffer bb) {
        boolean z = true;
        BitReaderBuffer brb = new BitReaderBuffer(bb);
        this.reserved = brb.readBits(6);
        this.sampleDependsOn = brb.readBits(2);
        this.sampleIsDependedOn = brb.readBits(2);
        this.sampleHasRedundancy = brb.readBits(2);
        this.samplePaddingValue = brb.readBits(3);
        if (brb.readBits(1) != 1) {
            z = false;
        }
        this.sampleIsDifferenceSample = z;
        this.sampleDegradationPriority = brb.readBits(16);
    }

    public void getContent(ByteBuffer os) {
        BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(os);
        bitWriterBuffer.writeBits(this.reserved, 6);
        bitWriterBuffer.writeBits(this.sampleDependsOn, 2);
        bitWriterBuffer.writeBits(this.sampleIsDependedOn, 2);
        bitWriterBuffer.writeBits(this.sampleHasRedundancy, 2);
        bitWriterBuffer.writeBits(this.samplePaddingValue, 3);
        bitWriterBuffer.writeBits(this.sampleIsDifferenceSample ? 1 : 0, 1);
        bitWriterBuffer.writeBits(this.sampleDegradationPriority, 16);
    }

    public int getReserved() {
        return this.reserved;
    }

    public void setReserved(int reserved) {
        this.reserved = reserved;
    }

    public int getSampleDependsOn() {
        return this.sampleDependsOn;
    }

    public void setSampleDependsOn(int sampleDependsOn) {
        this.sampleDependsOn = sampleDependsOn;
    }

    public int getSampleIsDependedOn() {
        return this.sampleIsDependedOn;
    }

    public void setSampleIsDependedOn(int sampleIsDependedOn) {
        this.sampleIsDependedOn = sampleIsDependedOn;
    }

    public int getSampleHasRedundancy() {
        return this.sampleHasRedundancy;
    }

    public void setSampleHasRedundancy(int sampleHasRedundancy) {
        this.sampleHasRedundancy = sampleHasRedundancy;
    }

    public int getSamplePaddingValue() {
        return this.samplePaddingValue;
    }

    public void setSamplePaddingValue(int samplePaddingValue) {
        this.samplePaddingValue = samplePaddingValue;
    }

    public boolean isSampleIsDifferenceSample() {
        return this.sampleIsDifferenceSample;
    }

    public void setSampleIsDifferenceSample(boolean sampleIsDifferenceSample) {
        this.sampleIsDifferenceSample = sampleIsDifferenceSample;
    }

    public int getSampleDegradationPriority() {
        return this.sampleDegradationPriority;
    }

    public void setSampleDegradationPriority(int sampleDegradationPriority) {
        this.sampleDegradationPriority = sampleDegradationPriority;
    }

    public String toString() {
        return "SampleFlags{reserved=" + this.reserved + ", sampleDependsOn=" + this.sampleDependsOn + ", sampleHasRedundancy=" + this.sampleHasRedundancy + ", samplePaddingValue=" + this.samplePaddingValue + ", sampleIsDifferenceSample=" + this.sampleIsDifferenceSample + ", sampleDegradationPriority=" + this.sampleDegradationPriority + '}';
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SampleFlags that = (SampleFlags) o;
        if (this.reserved != that.reserved) {
            return false;
        }
        if (this.sampleDegradationPriority != that.sampleDegradationPriority) {
            return false;
        }
        if (this.sampleDependsOn != that.sampleDependsOn) {
            return false;
        }
        if (this.sampleHasRedundancy != that.sampleHasRedundancy) {
            return false;
        }
        if (this.sampleIsDependedOn != that.sampleIsDependedOn) {
            return false;
        }
        if (this.sampleIsDifferenceSample != that.sampleIsDifferenceSample) {
            return false;
        }
        return this.samplePaddingValue == that.samplePaddingValue;
    }

    public int hashCode() {
        return (((((((((((this.reserved * 31) + this.sampleDependsOn) * 31) + this.sampleIsDependedOn) * 31) + this.sampleHasRedundancy) * 31) + this.samplePaddingValue) * 31) + (this.sampleIsDifferenceSample ? 1 : 0)) * 31) + this.sampleDegradationPriority;
    }
}
