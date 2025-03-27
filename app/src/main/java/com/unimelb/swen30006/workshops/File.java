package com.unimelb.swen30006.workshops;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Sample private file class to be replaced by your implementaiton
class File {
    private String ftype;

    public File(String filename) {
        Pattern pattern = Pattern.compile(".+\\.([a-z]*)");
        Matcher matcher = pattern.matcher(filename);
        matcher.find();

        String filetype = matcher.group(1);
        if (filetype != null ) {
            ftype = filetype;
        }
        else {
            System.out.println("Unknown file type error");
            ftype = "ERROR";
        }
    }

    public String fileType(){
        return ftype;
    }
}