package com.shitu.api.utils;

import com.shitu.api.ClientSdkException;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author andrew
 * @date 2021-10-28 3:38 PM
 */
public class FileUtil {
    private FileUtil() {
    }

    public static byte[] fileToBytes(File file) {
        try (FileInputStream fis = new FileInputStream(file);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            byte[] b = new byte[256];
            int length;
            while ((length = fis.read(b)) > 0) {
                baos.write(b, 0, length);
            }

            return baos.toByteArray();
        } catch (IOException e) {
            throw new ClientSdkException(e);
        }
    }
}
