package com.shruti.withoutxmldesign.marraigeTemplet

import android.content.Context
import android.graphics.Color
import android.graphics.Paint
import android.graphics.pdf.PdfDocument
import android.os.Environment
import android.widget.Toast
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

class MarriageBioDataClass {



        fun template1(context: Context) {
            val myPdfDocument = PdfDocument()
            val mypageinfo1 = PdfDocument.PageInfo.Builder(595, 842, 1).create()
            val myPage1: PdfDocument.Page = myPdfDocument.startPage(mypageinfo1)
            val canvas = myPage1.canvas

            /// normal text like name


            val textPaint = Paint()
            textPaint.color = Color.rgb(0, 0, 0)
            textPaint.textSize = 8.5f
            textPaint.letterSpacing = 0.05f

            // adhar number
            ///back of  card
            canvas.drawText("Pry Occupation       :", 306f, 80f, textPaint)

            myPdfDocument.finishPage(myPage1)

            val file2: File = File(
                Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS),
                "e_sharam_card.pdf"
            )

            try {
                myPdfDocument.writeTo(FileOutputStream(file2))
                Toast.makeText(context, "Ready to Print", Toast.LENGTH_SHORT).show()
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }}