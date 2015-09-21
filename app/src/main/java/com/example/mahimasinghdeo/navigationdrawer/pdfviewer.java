package com.example.mahimasinghdeo.navigationdrawer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.joanzapata.pdfview.PDFView;


public class pdfviewer extends Activity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfviewer);
        Intent intent = getIntent();
        int y = intent.getIntExtra("name", -1);
        int x = intent.getIntExtra("sem", -1);
        try {


            pdfView = (PDFView) findViewById(R.id.pdfview);
            if (y == 0 && x == 0)
                pdfView.fromAsset("syllabus.pdf").pages(0,1, 2, 3).enableSwipe(true).showMinimap(true).load();
            else if (y == 1 && x == 0)
                pdfView.fromAsset("syllabus.pdf").pages(0,4,5, 6).enableSwipe(true).showMinimap(true).load();

            if (y == 2 && x == 0)
                pdfView.fromAsset("syllabus.pdf").pages(0,7, 8, 9).enableSwipe(true).showMinimap(true).load();
            else if (y == 3 && x == 0)
                pdfView.fromAsset("syllabus.pdf").pages(0,10, 11).enableSwipe(true).showMinimap(true).load();
            pdfView = (PDFView) findViewById(R.id.pdfview);
            if (y == 4 && x == 0)
                pdfView.fromAsset("syllabus.pdf").pages(0,12, 13).enableSwipe(true).showMinimap(true).load();
            else if (y == 5 && x == 0)
                pdfView.fromAsset("syllabus.pdf").pages(0,14, 15).enableSwipe(true).showMinimap(true).load();

            if (y == 6 && x == 0)
                pdfView.fromAsset("syllabus.pdf").pages(0,16, 17, 18, 19).enableSwipe(true).showMinimap(true).load();
            else if (y == 7 && x == 0)
                pdfView.fromAsset("syllabus.pdf").pages(0,20, 21, 22).enableSwipe(true).showMinimap(true).load();
            if (y == 0 && x == 1)
                pdfView.fromAsset("syllabus.pdf").pages(0,23,24, 25).enableSwipe(true).showMinimap(true).load();
            else if (y == 1 && x == 1)
                pdfView.fromAsset("syllabus.pdf").pages(0,26,27, 28).enableSwipe(true).showMinimap(true).load();
            pdfView = (PDFView) findViewById(R.id.pdfview);
            if (y == 2 && x == 1)
                pdfView.fromAsset("syllabus.pdf").pages(0,28,29).enableSwipe(true).showMinimap(true).load();
            else if (y == 3 && x == 1)
                pdfView.fromAsset("syllabus.pdf").pages(0, 30,31).enableSwipe(true).showMinimap(true).load();

            if (y == 4 && x == 1)
                pdfView.fromAsset("syllabus.pdf").pages(0, 32,33, 34).enableSwipe(true).showMinimap(true).load();
            else if (y == 5 && x == 1)
                pdfView.fromAsset("syllabus.pdf").pages(0, 35,36).enableSwipe(true).showMinimap(true).load();
            pdfView = (PDFView) findViewById(R.id.pdfview);
            if (y == 6 && x == 1)
                pdfView.fromAsset("syllabus.pdf").pages(0, 37,38).enableSwipe(true).showMinimap(true).load();
            else if (y == 7 && x == 1)
                pdfView.fromAsset("syllabus.pdf").pages(0, 39,40,41).enableSwipe(true).showMinimap(true).load();
            if (y == 0 && x == 2)
                pdfView.fromAsset("syllabus.pdf").pages(0,42,43).enableSwipe(true).showMinimap(true).load();
            else if (y == 1 && x == 2)
                pdfView.fromAsset("syllabus.pdf").pages(0,44,45,46).enableSwipe(true).showMinimap(true).load();
            else if (y == 2 && x == 2)
                pdfView.fromAsset("syllabus.pdf").pages(0,47, 48).enableSwipe(true).showMinimap(true).load();
            else if (y == 3 && x == 2)
                pdfView.fromAsset("syllabus.pdf").pages(0,49, 50, 51).enableSwipe(true).showMinimap(true).load();

            if (y == 4 && x == 2)
                pdfView.fromAsset("syllabus.pdf").pages(0,52, 53).enableSwipe(true).showMinimap(true).load();
            else if (y == 5 && x == 2)
                pdfView.fromAsset("syllabus.pdf").pages(0,54, 55).enableSwipe(true).showMinimap(true).load();
            else if (y == 6 && x == 2)
                pdfView.fromAsset("syllabus.pdf").pages(0,56, 57, 58, 59).enableSwipe(true).showMinimap(true).load();
            else if (y == 7 && x == 2)
                pdfView.fromAsset("syllabus.pdf").pages(0,60, 61, 62, 63).enableSwipe(true).showMinimap(true).load();
            if (y == 0 && x == 3)
                pdfView.fromAsset("syllabus.pdf").pages(0,64, 65, 66).enableSwipe(true).showMinimap(true).load();
            else if (y == 1 && x == 3)
                pdfView.fromAsset("syllabus.pdf").pages(0,67, 68).enableSwipe(true).showMinimap(true).load();

            if (y == 2 && x == 3)
                pdfView.fromAsset("syllabus.pdf").pages(0,69, 70).enableSwipe(true).showMinimap(true).load();
            else if (y == 3 && x == 3)
                pdfView.fromAsset("syllabus.pdf").pages(0,71, 72).enableSwipe(true).showMinimap(true).load();
            pdfView = (PDFView) findViewById(R.id.pdfview);
            if (y == 4 && x == 3)
                pdfView.fromAsset("syllabus.pdf").pages(0,73, 74).enableSwipe(true).showMinimap(true).load();
            else if (y == 5 && x == 3)
                pdfView.fromAsset("syllabus.pdf").pages(0,75, 76).enableSwipe(true).showMinimap(true).load();
            else if (y == 6 && x == 3)
                pdfView.fromAsset("syllabus.pdf").pages(0,77, 78, 79).enableSwipe(true).showMinimap(true).load();
            else if (y == 7 && x == 3)
                pdfView.fromAsset("syllabus.pdf").pages(0,80, 81).enableSwipe(true).showMinimap(true).load();
            if (y == 8 && x == 3)
                pdfView.fromAsset("syllabus.pdf").pages(0,82, 83).enableSwipe(true).showMinimap(true).load();
            else if (y == 9 && x == 3)
                pdfView.fromAsset("syllabus.pdf").pages(0,84, 85).enableSwipe(true).showMinimap(true).load();

            if (y == 10 && x == 3)
                pdfView.fromAsset("syllabus.pdf").pages(0,86, 87,88).enableSwipe(true).showMinimap(true).load();
            else if (y == 11 && x == 3)
                pdfView.fromAsset("syllabus.pdf").pages(0, 89,90).enableSwipe(true).showMinimap(true).load();
            if (y == 0 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(0, 91, 92,93).enableSwipe(true).showMinimap(true).load();
            else if (y == 1 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(0, 94,95).enableSwipe(true).showMinimap(true).load();

            if (y == 2 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(0, 96, 97,98).enableSwipe(true).showMinimap(true).load();
            else if (y == 3 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(0, 99,100).enableSwipe(true).showMinimap(true).load();
            pdfView = (PDFView) findViewById(R.id.pdfview);
            if (y == 4 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(0, 101,102).enableSwipe(true).showMinimap(true).load();
            else if (y == 5 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(0, 103, 104,105).enableSwipe(true).showMinimap(true).load();

            else if (y == 6 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(0, 106, 107,108).enableSwipe(true).showMinimap(true).load();
            else if (y == 7 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(0, 109, 110,111).enableSwipe(true).showMinimap(true).load();
            if (y == 8 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(0,112,113).enableSwipe(true).showMinimap(true).load();
            else if (y == 9 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(0, 114,115).enableSwipe(true).showMinimap(true).load();
            else if (y == 10 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(0, 116, 117,118).enableSwipe(true).showMinimap(true).load();
            else if (y == 11 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(0, 119,120).enableSwipe(true).showMinimap(true).load();

            else if (y == 12 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(0, 121, 122,123).enableSwipe(true).showMinimap(true).load();
            else if (y == 13 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(0, 124,125).enableSwipe(true).showMinimap(true).load();
            pdfView = (PDFView) findViewById(R.id.pdfview);
            if (y == 14 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(0, 126, 127,128).enableSwipe(true).showMinimap(true).load();
            else if (y == 15 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(0, 129, 130,131).enableSwipe(true).showMinimap(true).load();
            else if (y == 16 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(0, 132,133).enableSwipe(true).showMinimap(true).load();
            else if (y == 17 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(0, 134,135).enableSwipe(true).showMinimap(true).load();
            else if (y == 0 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(0,136,137).enableSwipe(true).showMinimap(true).load();
            else if (y == 1 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(0,138,139).enableSwipe(true).showMinimap(true).load();
            else if (y == 2 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(0,140,141).enableSwipe(true).showMinimap(true).load();
            else if (y == 3 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(0,142,143,144).enableSwipe(true).showMinimap(true).load();

            else if (y == 4 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(0, 145,146).enableSwipe(true).showMinimap(true).load();
            else if (y == 5 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(0, 147,148,149).enableSwipe(true).showMinimap(true).load();

            else if (y == 6 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(0,150,151).enableSwipe(true).showMinimap(true).load();
            else if (y == 7 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(0, 152,153).enableSwipe(true).showMinimap(true).load();
            else if (y == 8 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(0,154,155 ).enableSwipe(true).showMinimap(true).load();
            else if (y == 9 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(0,156,157,158).enableSwipe(true).showMinimap(true).load();
            else if (y == 10 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(0,159,161).enableSwipe(true).showMinimap(true).load();
            else if (y == 11 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(0,161,162).enableSwipe(true).showMinimap(true).load();
            else if (y == 12 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(0,163,164,165).enableSwipe(true).showMinimap(true).load();
            else if (y == 13 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(0,166,167,168).enableSwipe(true).showMinimap(true).load();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
