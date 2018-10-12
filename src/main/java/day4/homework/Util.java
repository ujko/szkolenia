package day4.homework;

import java.io.*;

public class Util<T> {
    private static final String NAZWA_PLIKU = "mojplik.obj";

    public void saveObject(T object){
        try {
            OutputStream is = new FileOutputStream(NAZWA_PLIKU);
            ObjectOutputStream out = new ObjectOutputStream(is);
            out.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public T openObject(){
        T resultObject = null;
        File file = new File(NAZWA_PLIKU);
        if(file.exists()){
            try {
                FileInputStream in = new FileInputStream(file);
                ObjectInputStream objIn = new ObjectInputStream(in);
                resultObject = (T) objIn.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return resultObject;
    }
}
