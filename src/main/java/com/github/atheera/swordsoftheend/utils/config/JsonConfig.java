package com.github.atheera.swordsoftheend.utils.config;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import com.github.atheera.swordsoftheend.*;

public abstract class JsonConfig {

    private Path filePath = null;

    void initOrLoad() throws IOException, IllegalStateException {
        if(this.filePath == null)
            throw new IllegalStateException("File path of " + getName() + " is null!");
        try {
            FileReader reader = new FileReader(this.filePath.toString());
            JsonParser parser = new JsonParser();
            JsonObject json = parser.parse(reader).getAsJsonObject();
            read(json);
            reader.close();
            Main.LOGGER.info("Config: " + getName() + " has been loaded.");
        } catch (FileNotFoundException e) {
            preWrite();
            Main.LOGGER.info("Config: " + getName() + " has been written and loaded.");
        } catch (JsonParseException|IllegalArgumentException|NullPointerException e) {
            Main.LOGGER.info("Error during config initialization on " + getName() + " caused by: " + e.getLocalizedMessage());
            preWrite();
            Main.LOGGER.info("Config " + getName() + " have been rewritten and loaded.");
        }
    }

    private void postWrite(JsonObject json) throws IOException {
        FileWriter fileWriter = new FileWriter(this.filePath.toString());
        fileWriter.write(json.toString());
        fileWriter.flush();
        fileWriter.close();
    }

    private void preWrite() throws IOException, IllegalStateException {
        if(this.filePath == null)
            throw new IllegalStateException("File path of " + getName() + " is null!");
        JsonObject json = write();
        postWrite(json);
    }

    protected abstract void read(JsonObject paramJsonObject);

    protected abstract JsonObject write();

    protected abstract String getName();

    void filePath(Path path) {
        this.filePath = path;
    }

}