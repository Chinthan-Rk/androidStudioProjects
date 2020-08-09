package com.chinthanrk.readexcel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {

    private EditText searchBox;
    private Button search;
    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        InputStream inputStream;
        AssetManager assetManager = getAssets();

        try {
            inputStream = assetManager.open("FileHandler.xls");

            POIFSFileSystem fileSystem = new POIFSFileSystem(inputStream); //create a POIFSFileSystem object

            HSSFWorkbook workbook = new HSSFWorkbook(fileSystem); //create a workbook using the fileSystem object

            HSSFSheet mySheet = workbook.getSheetAt(1); //we get the first sheet from the workbook

            Iterator<Row> rowIterator = mySheet.rowIterator();
            int rowNumber = 4;     //the data starts from row 4 in FileHandler.xls
            displayText.append("\n");

            while (rowIterator.hasNext()) {
                HSSFRow myRow = (HSSFRow) rowIterator.next();

                Iterator<Cell> cellIterator = myRow.cellIterator();
                int colNum = 0;
                String collegeName = "";//, branchName = "", seatPool = "";
                while (cellIterator.hasNext()) {
                    HSSFCell myCell = (HSSFCell) cellIterator.next();
                    if (colNum == 1)
                        collegeName = myCell.toString();
//                    if (colNum == 2)
//                        branchName = myCell.toString();
//                    if (colNum == 5)
//                        seatPool = myCell.toString();
                    colNum++;
                    displayText.append(collegeName +"\n");
                }

                rowNumber++;
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void findViews() {
        search = findViewById(R.id.search);
        searchBox = findViewById(R.id.input);
        displayText = findViewById(R.id.displayText);
    }
}
