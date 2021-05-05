package fr.zeykra;

import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonValue;
import fr.zeykra.util.JsonMod;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        JsonMod jsonMod = new JsonMod();
        System.out.println(jsonMod.getEnable("FpsMod"));
        jsonMod.setEnable("FpsMod", false);
        System.out.println(jsonMod.getEnable("FpsMod"));
        //System.out.println(jsonMod.getColor("FpsMod"));
        //System.out.println(jsonMod.getX("FpsMod"));
        //System.out.println(jsonMod.getY("FpsMod"));

        //jsonMod.setEnable("FpsMod", true);
        //System.out.println(jsonMod.getEnable("FpsMod"));
    }

}
