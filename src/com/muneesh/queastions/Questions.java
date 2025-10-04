package com.muneesh.queastions;

import javax.swing.text.StringContent;

public class Questions {
    public String QueastionsText;
   public  String[] Options;
   public char CorrectAnswers;

    public Questions(String queastionsText, String[] options, char correctAnswers) {
        QueastionsText = queastionsText;
        Options = options;
        CorrectAnswers = correctAnswers;
    }
}

