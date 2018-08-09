package com.h.inputoutput.practise;

import java.io.File;

public class DIr {
   public static void main(String args[]) {
      String dirname = "";
      File f1 = new File("/Users/bishnu/eclipse-workspace/IODemo/src/com/io/demo/dirname.txt");
      if (f1.isDirectory()) {
         System.out.println( "Directory of " + dirname);
         String s[] = f1.list();
         for (int i=0; i < s.length; i++) {
            File f = new File(dirname + "/" + s[i]);
            if (f.isDirectory()) {
               System.out.println(s[i] + " is a directory");
            } else {
               System.out.println("     --- "+s[i] + " is a file");
            }
         }
      } else {
         System.out.println(" - "+dirname + " is not a directory");
    }
  }
}