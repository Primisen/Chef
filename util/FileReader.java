package com.primisen.java_november.part4.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//можно добавить сепаратор
public class FileReader {

    private String fileName;
    private String filePath;
    private File fileToRead;

    public FileReader(String fileName, String filePath) {
        this.fileName = fileName;
        this.filePath = filePath;
        fileToRead = new File(filePath + fileName);
    }

    public String getFileName() {
        return fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public File getFileToRead() {
        return fileToRead;
    }

    public String read() { //разобраться с недостатками метода

        Scanner scanner = null;
        try {
            scanner = new Scanner(fileToRead);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String textFromFile = scanner.nextLine();

        while (scanner.hasNextLine()) {
            textFromFile = textFromFile + "\n" + scanner.nextLine();
        }

        return textFromFile;
    }
}
