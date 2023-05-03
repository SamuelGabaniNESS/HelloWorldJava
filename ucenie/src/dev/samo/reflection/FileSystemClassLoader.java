package dev.samo.reflection;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileSystemClassLoader extends ClassLoader{
    private final String filePath;
    public FileSystemClassLoader(String filePath){
        this.filePath = filePath;
    }

    @Override
    public Class<?> findClass(String binaryName){
        System.out.println("Binary name:" + binaryName);
        String[] nameComponents = binaryName.split("\\.");
        System.out.println("Name components: "+ Arrays.toString(nameComponents));
        String className = nameComponents[nameComponents.length-1];
        System.out.println("Class name:" + className);
        String fileName = filePath + className + ".class";
        System.out.println("Absolute file path: "+fileName);
        byte[] classBytes = new byte[0];
        try {
            classBytes = loadClassFromFile(fileName);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return defineClass(binaryName,classBytes,0,classBytes.length);
    }

    private byte[] loadClassFromFile(String fileName) throws  FileNotFoundException{
        FileInputStream fileInputStream = new FileInputStream(fileName);
        byte[] buffer;
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        int nextValue = 0;
        try{
            while ((nextValue = fileInputStream.read())!=-1){
                byteStream.write(nextValue);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        buffer = byteStream.toByteArray();
        return buffer;
    }
}
