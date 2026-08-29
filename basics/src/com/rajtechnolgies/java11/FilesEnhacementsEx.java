package com.rajtechnolgies.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilesEnhacementsEx {

    public static void main(String[] args) throws IOException {
        Path path= Paths.get("C:\\Obul\\Learning\\CoreJava\\files\\test.txt");
        Files.writeString(path,"Obul Reddy\n" +
                "tested by Obul", StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
        Files.writeString(path,"Vijaya is my wife\n", StandardOpenOption.CREATE,
                StandardOpenOption.APPEND );
        String content = Files.readString(path);

        System.out.println(content);

    }
}
