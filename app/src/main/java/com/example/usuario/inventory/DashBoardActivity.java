package com.example.usuario.inventory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayout;
import android.view.View;
import android.widget.ImageView;

import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Vector;
import java.io.IOException;
import java.io.OutputStream;


/**
 * Created by usuario on 9/10/17.
 */

public class DashBoardActivity extends AppCompatActivity {

    private GridLayout gridDashboard;
    private  ClickListenerDashboard listenerDashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_support);

        gridDashboard=(GridLayout) findViewById(R.id.grdDashBoard);


        //definir un array de int, que contentra el id de las imagenes Inventori, Product, Dependencias, Secciones, Preferencias.
        int[] images={R.drawable.chair,
                R.drawable.closet,
                R.drawable.cpu,
                R.drawable.inventory,
                R.drawable.keyboard,
                R.drawable.logo,
                R.drawable.monitor,
                R.drawable.mouse,
                R.drawable.printer,
                R.drawable.proyector,
                R.drawable.table,
                R.drawable.whiteboard};

        //no se utiliza en Java/Android array de objetos. se utiliza Vector o Colecciones.
        //ImageView[] imageViews = new  ImageView[images.length];

        //no utilizamos la clase Vector porque no trabajamos con hilos y o se requiere sincronizacion
        //Vector<ImageView> vectorImageViews=new Vector<ImageView>();

        listenerDashboard = new ClickListenerDashboard();
        ImageView imageView;
        float width=getResources().getDimension(R.dimen.imgDashBoardWidth);
        float height=getResources().getDimension(R.dimen.imgDashBoardWidth);


        //ArrayList<ImageView> arrayImageViews = new ArrayList<ImageView>();
        for (int i=0; i<images.length;i++)
        {

            imageView= new ImageView(this);

            GridLayout.LayoutParams params = new GridLayout.LayoutParams();
            params.width=(int)width;
            params.height=(int)height;
            params.rowSpec=GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f);
            params.columnSpec=GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f);
            imageView.setImageResource(images[i]);
            imageView.setId(i);
            imageView.setLayoutParams(params);
            imageView.setOnClickListener(listenerDashboard);
            gridDashboard.addView(imageView);
        }
    }

    class ClickListenerDashboard implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            Intent intent;

            switch (v.getId())
            {
                case 3:
                    intent=new Intent(DashBoardActivity.this, InventoryActivity.class);
                    startActivity(intent);
                    break;
                case  6:
                    intent=new Intent(DashBoardActivity.this, ProductActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    }
}
