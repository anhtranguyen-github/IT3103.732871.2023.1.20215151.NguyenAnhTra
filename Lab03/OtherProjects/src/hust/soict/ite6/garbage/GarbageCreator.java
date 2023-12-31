// Dinh Viet Ha - 20215042

package hust.soict.ite6.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) throws IOException {
        String fileName = "src\\hust\\soict\\ite6\\garbage\\main.exe";
        byte[] inputBytes = {0};
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(fileName));

        startTime = System.currentTimeMillis();
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char) b;
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}

