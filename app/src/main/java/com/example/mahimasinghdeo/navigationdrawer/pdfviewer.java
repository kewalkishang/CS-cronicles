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
                pdfView.fromAsset("syllabus.pdf").pages(1, 2, 3).enableSwipe(true).showMinimap(true).load();
            else if (y == 1 && x == 0)
                pdfView.fromAsset("syllabus.pdf").pages(4, 5, 6).enableSwipe(true).showMinimap(true).load();

            if (y == 2 && x == 0)
                pdfView.fromAsset("syllabus.pdf").pages(7, 8, 9).enableSwipe(true).showMinimap(true).load();
            else if (y == 3 && x == 0)
                pdfView.fromAsset("syllabus.pdf").pages(10, 11).enableSwipe(true).showMinimap(true).load();
            pdfView = (PDFView) findViewById(R.id.pdfview);
            if (y == 4 && x == 0)
                pdfView.fromAsset("syllabus.pdf").pages(12, 13).enableSwipe(true).showMinimap(true).load();
            else if (y == 5 && x == 0)
                pdfView.fromAsset("syllabus.pdf").pages(14, 15).enableSwipe(true).showMinimap(true).load();

            if (y == 6 && x == 0)
                pdfView.fromAsset("syllabus.pdf").pages(16, 17, 18, 19).enableSwipe(true).showMinimap(true).load();
            else if (y == 7 && x == 0)
                pdfView.fromAsset("syllabus.pdf").pages(20, 21, 22, 23).enableSwipe(true).showMinimap(true).load();
            if (y == 0 && x == 1)
                pdfView.fromAsset("syllabus.pdf").pages(24, 25, 26).enableSwipe(true).showMinimap(true).load();
            else if (y == 1 && x == 1)
                pdfView.fromAsset("syllabus.pdf").pages(27, 28).enableSwipe(true).showMinimap(true).load();
            pdfView = (PDFView) findViewById(R.id.pdfview);
            if (y == 2 && x == 1)
                pdfView.fromAsset("syllabus.pdf").pages(29, 30).enableSwipe(true).showMinimap(true).load();
            else if (y == 3 && x == 1)
                pdfView.fromAsset("syllabus.pdf").pages(31, 32).enableSwipe(true).showMinimap(true).load();

            if (y == 4 && x == 1)
                pdfView.fromAsset("syllabus.pdf").pages(33, 34, 35).enableSwipe(true).showMinimap(true).load();
            else if (y == 5 && x == 1)
                pdfView.fromAsset("syllabus.pdf").pages(36, 37).enableSwipe(true).showMinimap(true).load();
            pdfView = (PDFView) findViewById(R.id.pdfview);
            if (y == 6 && x == 1)
                pdfView.fromAsset("syllabus.pdf").pages(38, 39).enableSwipe(true).showMinimap(true).load();
            else if (y == 7 && x == 1)
                pdfView.fromAsset("syllabus.pdf").pages(40, 41, 42).enableSwipe(true).showMinimap(true).load();
            if (y == 0 && x == 2)
                pdfView.fromAsset("syllabus.pdf").pages(43, 44).enableSwipe(true).showMinimap(true).load();
            else if (y == 1 && x == 2)
                pdfView.fromAsset("syllabus.pdf").pages(45, 46, 46).enableSwipe(true).showMinimap(true).load();
            else if (y == 2 && x == 2)
                pdfView.fromAsset("syllabus.pdf").pages(47, 48).enableSwipe(true).showMinimap(true).load();
            else if (y == 3 && x == 2)
                pdfView.fromAsset("syllabus.pdf").pages(49, 50, 51).enableSwipe(true).showMinimap(true).load();

            if (y == 4 && x == 2)
                pdfView.fromAsset("syllabus.pdf").pages(52, 53).enableSwipe(true).showMinimap(true).load();
            else if (y == 5 && x == 2)
                pdfView.fromAsset("syllabus.pdf").pages(54, 55).enableSwipe(true).showMinimap(true).load();
            else if (y == 6 && x == 2)
                pdfView.fromAsset("syllabus.pdf").pages(56, 57, 58, 59).enableSwipe(true).showMinimap(true).load();
            else if (y == 7 && x == 2)
                pdfView.fromAsset("syllabus.pdf").pages(60, 61, 62, 63).enableSwipe(true).showMinimap(true).load();
            if (y == 0 && x == 3)
                pdfView.fromAsset("syllabus.pdf").pages(64, 65, 66).enableSwipe(true).showMinimap(true).load();
            else if (y == 1 && x == 3)
                pdfView.fromAsset("syllabus.pdf").pages(67, 68).enableSwipe(true).showMinimap(true).load();

            if (y == 2 && x == 3)
                pdfView.fromAsset("syllabus.pdf").pages(69, 70).enableSwipe(true).showMinimap(true).load();
            else if (y == 3 && x == 3)
                pdfView.fromAsset("syllabus.pdf").pages(71, 72).enableSwipe(true).showMinimap(true).load();
            pdfView = (PDFView) findViewById(R.id.pdfview);
            if (y == 4 && x == 3)
                pdfView.fromAsset("syllabus.pdf").pages(73, 74).enableSwipe(true).showMinimap(true).load();
            else if (y == 5 && x == 3)
                pdfView.fromAsset("syllabus.pdf").pages(75, 76).enableSwipe(true).showMinimap(true).load();
            else if (y == 6 && x == 3)
                pdfView.fromAsset("syllabus.pdf").pages(77, 78, 79).enableSwipe(true).showMinimap(true).load();
            else if (y == 7 && x == 3)
                pdfView.fromAsset("syllabus.pdf").pages(80, 81).enableSwipe(true).showMinimap(true).load();
            if (y == 8 && x == 3)
                pdfView.fromAsset("syllabus.pdf").pages(82, 83).enableSwipe(true).showMinimap(true).load();
            else if (y == 9 && x == 3)
                pdfView.fromAsset("syllabus.pdf").pages(84, 85).enableSwipe(true).showMinimap(true).load();

            if (y == 10 && x == 3)
                pdfView.fromAsset("syllabus.pdf").pages(86, 87).enableSwipe(true).showMinimap(true).load();
            else if (y == 11 && x == 3)
                pdfView.fromAsset("syllabus.pdf").pages(88, 89).enableSwipe(true).showMinimap(true).load();
            if (y == 0 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(90, 91, 92).enableSwipe(true).showMinimap(true).load();
            else if (y == 1 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(93, 94).enableSwipe(true).showMinimap(true).load();

            if (y == 2 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(95, 96, 97).enableSwipe(true).showMinimap(true).load();
            else if (y == 3 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(98, 99).enableSwipe(true).showMinimap(true).load();
            pdfView = (PDFView) findViewById(R.id.pdfview);
            if (y == 4 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(100, 101).enableSwipe(true).showMinimap(true).load();
            else if (y == 5 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(102, 103, 104).enableSwipe(true).showMinimap(true).load();

            else if (y == 6 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(105, 106, 107).enableSwipe(true).showMinimap(true).load();
            else if (y == 7 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(108, 109, 110).enableSwipe(true).showMinimap(true).load();
            if (y == 8 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(111, 112).enableSwipe(true).showMinimap(true).load();
            else if (y == 9 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(113, 114).enableSwipe(true).showMinimap(true).load();
            else if (y == 10 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(115, 116, 117).enableSwipe(true).showMinimap(true).load();
            else if (y == 11 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(118, 119).enableSwipe(true).showMinimap(true).load();

            else if (y == 12 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(120, 121, 122).enableSwipe(true).showMinimap(true).load();
            else if (y == 13 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(123, 124).enableSwipe(true).showMinimap(true).load();
            pdfView = (PDFView) findViewById(R.id.pdfview);
            if (y == 14 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(125, 126, 127).enableSwipe(true).showMinimap(true).load();
            else if (y == 15 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(128, 129, 130).enableSwipe(true).showMinimap(true).load();
            else if (y == 16 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(131, 132).enableSwipe(true).showMinimap(true).load();
            else if (y == 17 && x == 4)
                pdfView.fromAsset("syllabus.pdf").pages(133, 134).enableSwipe(true).showMinimap(true).load();
            else if (y == 0 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(135,136).enableSwipe(true).showMinimap(true).load();
            else if (y == 1 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(137,138).enableSwipe(true).showMinimap(true).load();
            else if (y == 2 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(139,140).enableSwipe(true).showMinimap(true).load();
            else if (y == 3 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(141,142,143).enableSwipe(true).showMinimap(true).load();

            else if (y == 4 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(144, 145).enableSwipe(true).showMinimap(true).load();
            else if (y == 5 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(146, 147,148).enableSwipe(true).showMinimap(true).load();

            else if (y == 6 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(149,150).enableSwipe(true).showMinimap(true).load();
            else if (y == 7 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(151, 152).enableSwipe(true).showMinimap(true).load();
            else if (y == 8 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(153,154 ).enableSwipe(true).showMinimap(true).load();
            else if (y == 9 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(155,156,157).enableSwipe(true).showMinimap(true).load();
            else if (y == 10 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(158,159).enableSwipe(true).showMinimap(true).load();
            else if (y == 11 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(160,162).enableSwipe(true).showMinimap(true).load();
            else if (y == 12 && x == 5)
                pdfView.fromAsset("syllabus.pdf").pages(163,164,165).enableSwipe(true).showMinimap(true).load();
            else if (y == 13 && x == 5)
                pdfView.fromAsset("syllabus.pdf").defaultPage(166).pages(166,167,168).enableSwipe(true).showMinimap(true).load();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
