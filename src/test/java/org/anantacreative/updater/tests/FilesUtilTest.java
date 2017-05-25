package org.anantacreative.updater.tests;

import org.anantacreative.updater.FilesUtil;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static org.testng.AssertJUnit.fail;

/**
 *
 */
public class FilesUtilTest {

    private void initTestDir() throws IOException {

        File dir=new File("./tmp");
        if(!dir.exists()) {
            if(!dir.mkdir()) throw new IOException();
        }
        File dir2=new File(dir,"tmp2");
        if(!dir2.exists()) {
            if(!dir2.mkdir()) throw new IOException();
        }
        File file1=new File(dir,"file1.txt");
        file1.createNewFile();
        File file2=new File(dir2,"file2.txt");
        file2.createNewFile();

        if(!file1.exists()) throw new IOException();
        if(!file2.exists()) throw new IOException();

    }

    @Test
    public void recursiveDeleteTest() throws IOException {

            initTestDir();
            File dir = new File("./tmp");
            if(!FilesUtil.recursiveDelete(dir)) fail();

            if(dir.exists()) fail("Директория ./tmp должна быть удалена");


    }


}