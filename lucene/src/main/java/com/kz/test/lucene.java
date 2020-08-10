package com.kz.test;

import org.apache.lucene.store.FSDirectory;

import java.io.File;
import java.io.IOException;

public class lucene {


    public void createIndex() throws IOException {

            FSDirectory open = FSDirectory.open(new File("E:\\indexes").toPath());
            


    }

}
