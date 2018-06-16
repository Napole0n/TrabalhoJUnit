
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Murilo
 */
public class JsonIntegerManipulator {

    public static List<List<Integer>> read() {

        List<List<Integer>> listA = new ArrayList<>();

        File file = new File("files");
        File listFiles[] = file.listFiles();

        for (int i = 0; i < listFiles.length; i++) {

            List<Integer> listB = new ArrayList<>();

            BufferedReader bufferedReader = null;
            java.lang.reflect.Type listType = new TypeToken<ArrayList<Integer>>() {
            }.getType();

            try {
                bufferedReader = new BufferedReader(new FileReader(listFiles[i]));
                listB = new Gson().fromJson(bufferedReader, listType);
            } catch (FileNotFoundException ex) {
                System.err.println("Erro ao ler a lista!");
            }

            listA.add(listB);

        }

        return listA;

    }

    public static void write(List<Integer> lista) throws IOException {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        File file = new File("files");
        File listFiles[] = file.listFiles();

        try (FileWriter writer = new FileWriter("files/file" + (listFiles.length + 1) + ".json")) {
            writer.write(gson.toJson(lista));
        }

    }

    public static void clear() {
        File file = new File("files");
        File listFiles[] = file.listFiles();
        for (File listFile : listFiles) {
            listFile.delete();
        }

    }

}
