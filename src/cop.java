/**
 * Created by roy on 13.10.15.
 */
package com.javarush.lesson2;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class cop
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream  fileInputStream = new FileInputStream("/media/mirror/Backup/lk/17-10-2014/pki/tls/cert.pem");
        FileOutputStream  fileOutputStream = new FileOutputStream("media/mirror/Backup/lk/17-10-2014/pki/tls/cert.pem2");

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
