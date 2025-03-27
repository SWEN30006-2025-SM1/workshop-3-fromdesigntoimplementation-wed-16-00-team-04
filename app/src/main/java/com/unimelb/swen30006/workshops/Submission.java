package com.unimelb.swen30006.workshops;

// Sample private submission class to be replaced by your implementation
class Submission {
    // Return two fake files
    String studID;
    int attemptNum;
    final int maxFiles = 5;
    File[] files;

    public Submission(String studID, int SubAttemptNum, String[] fileNames) {
        this.studID = studID;
        attemptNum = SubAttemptNum;

        files = new File[fileNames.length < maxFiles ? fileNames.length : maxFiles];
        for (int i = 0; i < maxFiles && i < fileNames.length; i++) {
            files[i] = new File(fileNames[i]);
        }
    }

    public File[] includedFiles(){
        return files;
    }
}
