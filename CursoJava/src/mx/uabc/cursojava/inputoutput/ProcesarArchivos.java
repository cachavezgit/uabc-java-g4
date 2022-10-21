package mx.uabc.cursojava.inputoutput;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Collections;

public class ProcesarArchivos {
    public static void main(String[] args) throws IOException {
        String pathString = System.getProperty("java.io.tmpdir");
        System.out.println(pathString);
        String [] fileNames = new File(pathString).list();
        for (int i = 0; i < 5; i++ ) {
            System.out.println(fileNames[i]);
        }

        pathString = System.getProperty("java.io.tmpdir");
        Path ruta = Paths.get(pathString);
        Files.list(ruta).limit(5).forEach(System.out::println);

        Path path = Paths.get(System.getProperty("user.home"));

        Files.walkFileTree(path, Collections.emptySet(), 2, new SimpleFileVisitor<Path>() {

            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                System.out.println(dir.toString());
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                System.out.println("visitFileFailed: " + file);
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
