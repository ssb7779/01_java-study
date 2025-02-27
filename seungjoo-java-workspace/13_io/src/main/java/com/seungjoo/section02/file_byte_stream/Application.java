package com.seungjoo.section02.file_byte_stream;

public class Application {
    public static void main(String[] args) {

        FileByteDao fileByteDao = new FileByteDao();
        fileByteDao.fileSave();
        fileByteDao.fileRead();

    }
}
