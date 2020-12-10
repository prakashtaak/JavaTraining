package com.java.nuance;

import sun.audio.AudioDataStream;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.List;

public class AutoToTextAPI {


}

interface AudioToTextAPI {

    /*
    API which produces text as output for the given audio data
    @accepts AudioData
    @produces JSON
    {
        nameOfThePerson : "xyz",
        test :" this is a sample audio to text conversion text"

    }
     */
    default public TextResults streamAudioAndConvertToText(RawAudioDataBlocks dataStream) {
        return null;


    }


    /*
        API which produces text as output for given sequence of audio files
     */
    default public TextResults streamAudioAndConvertToText(InputDataStream dataStream) {
        return null;
    }


}

class AudioToTextApiProcessor implements AudioToTextAPI {



    @Override
    public TextResults streamAudioAndConvertToText(InputDataStream dataStream) {
        AudioDataProcessor processor = AudioDataProcessor.getInstance(dataStream);
        return processor.processAudioData();
    }

    @Override
    public TextResults streamAudioAndConvertToText(RawAudioDataBlocks dataStream) {
        AudioDataProcessor processor = AudioDataProcessor.getInstance(dataStream);
        return processor.processAudioData();
    }

}



/**
 * AudioDataProcessor interface, which can be implemented to process various input audio format
 */

interface AudioDataProcessor {

    TextResults processAudioData();

    static AudioDataProcessor getInstance(AudioDataInput input) {
        AudioDataProcessor processor = null;
        if (input instanceof RawAudioDataBlocks) {
            processor = new RawAudioDataBlocksProcessor(input);
        } else if (input instanceof AudioDataStream) {
            processor = new AudioDataStreamProcessor(input);
        }
        return processor;
    }


}


class RawAudioDataBlocksProcessor implements AudioDataProcessor {
    private AudioDataInput input;

    public RawAudioDataBlocksProcessor(AudioDataInput input) {
        this.input = input;
    }

    @Override
    public TextResults processAudioData() {
        return new TextResults(new Results("prakash", "raw audio blocks sample text"), new Results("anil", "sample text"));
    }
}

class AudioDataStreamProcessor implements AudioDataProcessor {
    private AudioDataInput input;

    public AudioDataStreamProcessor(AudioDataInput input) {
        this.input = input;
    }

    @Override
    public TextResults processAudioData() {
        return new TextResults(new Results("prakash", "audio stream sample data"), new Results("anil", "sample text"));
    }
}


class Results implements Serializable {
    String nameOfThePerson;
    String text;

    public Results(String nameOfThePerson, String text) {
        this.nameOfThePerson = nameOfThePerson;
        this.text = text;
    }
}

class TextResults implements Serializable {
    Results previewResults;
    Results stableResults;

    public TextResults(Results previewResults, Results stableResults) {
        this.previewResults = previewResults;
        this.stableResults = stableResults;
    }
}

class RawAudioDataBlocks implements AudioDataInput {

    private InputStream stream;

    public RawAudioDataBlocks(InputStream stream) {
        this.stream = stream;
    }


}

interface AudioDataInput {
}

class InputDataStream implements AudioDataInput {
    List<File> audioDataFiles;


}

