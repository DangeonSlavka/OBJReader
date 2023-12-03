package com.cgvsu;

import com.cgvsu.model.Model;
import com.cgvsu.objreader.ObjReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {

        Path fileName = Path.of("C:\\Users\\slava\\Desktop\\ВГУ\\PCgraf\\CGVSU-main\\Task3\\ObjReaderInitial\\ModetlForTest\\Iphone seceond version finished.obj");
        String fileContent = Files.readString(fileName);

        System.out.println("Loading model ...");
        Model model = ObjReader.read(fileContent);

        System.out.println("Vertices: " + model.vertices.size());
        System.out.println("Texture vertices: " + model.textureVertices.size());
        System.out.println("Normals: " + model.normals.size());
        System.out.println("Polygons: " + model.polygons.size());
//          Vertices: 86421
////        Texture vertices: 12282
////        Normals: 12913
////        Polygons: 140117
    }
}
