package fr.zeykra.util;

import com.eclipsesource.json.*;

import java.io.*;
import java.nio.file.Path;

public class JsonMod {

    File JsonFile = new File("mods.json");
    String jsonPath = "C:/Users/boobo/IntelliJ/LaissezMoiParseDuJson/";

    public Boolean getEnable(String mod) throws IOException {
        FileReader reader = new FileReader(jsonPath + mod + ".json");
        JsonObject modSetting = Json.parse(reader).asObject();
        return modSetting.get("isEnabled").asBoolean();
    }

    public String getColor(String mod) throws IOException {
        FileReader reader = new FileReader(jsonPath + mod + ".json");
        JsonObject modSetting = Json.parse(reader).asObject();
        return modSetting.get("Color").asString();
    }

    public Double getX(String mod) throws IOException {
        FileReader reader = new FileReader(jsonPath + mod + ".json");
        JsonObject modSetting = Json.parse(reader).asObject();
        return modSetting.get("x").asDouble();
    }

    public Double getY(String mod) throws IOException {
        FileReader reader = new FileReader(jsonPath + mod + ".json");
        JsonObject modSetting = Json.parse(reader).asObject();
        return modSetting.get("y").asDouble();
    }

    public void setEnable(String mod, Boolean Enabled) throws IOException {
        FileReader reader = new FileReader(jsonPath + mod + ".json");
        JsonObject modSetting = Json.parse(reader).asObject();
        modSetting.set("isEnabled", Enabled);

        Writer writer = new FileWriter(jsonPath + mod + ".json");
        writer.write(modSetting.toString(WriterConfig.PRETTY_PRINT));
        writer.close();
    }

    public void setColor(String mod, String color) throws IOException {
        FileReader reader = new FileReader(jsonPath + mod + ".json");
        JsonObject modSetting = Json.parse(reader).asObject();
        modSetting.set("color", color);

        Writer writer = new FileWriter(jsonPath + mod + ".json");
        writer.write(modSetting.toString(WriterConfig.PRETTY_PRINT));
        writer.close();
    }
    public void setX(String mod, Double x) throws IOException {
        FileReader reader = new FileReader(jsonPath + mod + ".json");
        JsonObject modSetting = Json.parse(reader).asObject();
        modSetting.set("x", x);

        Writer writer = new FileWriter(jsonPath + mod + ".json");
        writer.write(modSetting.toString(WriterConfig.PRETTY_PRINT));
        writer.close();
    }

    public void setY(String mod, Double y) throws IOException {
        FileReader reader = new FileReader(jsonPath + mod + ".json");
        JsonObject modSetting = Json.parse(reader).asObject();
        modSetting.set("y", y);

        Writer writer = new FileWriter(jsonPath + mod + ".json");
        writer.write(modSetting.toString(WriterConfig.PRETTY_PRINT));
        writer.close();
    }

}
