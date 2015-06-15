package com.hannah.hannahworld;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.View.OnDragListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeNumberActivity extends Activity {
    private static final String TAG = "MakeNumberActivity";

    private TextView myCard;
    private static final String TextView_TAG = "The Android Logo";
    public GridView numberGridView;
    public GridView formulaGridView;
    public GridView operatorGridView;
    public ArrayList<String> mFormulaList = new ArrayList<String>();
    public ArrayList<String> mNumberList = new ArrayList<String>(Arrays.asList("1", "2", "3", "4"));
    public ArrayList<String> mOperatorList = new ArrayList<String>(Arrays.asList("+", "-", "*","/"));

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_makenumberactivity);
        myCard = (TextView) findViewById(R.id.card0);

        findViewById(R.id.toplinear).setOnDragListener(new MyDragListener());
        findViewById(R.id.grid_view_formula).setOnDragListener(new MyDragListener());
        gridView = (GridView) findViewById(R.id.grid_view_formula);


    }

}