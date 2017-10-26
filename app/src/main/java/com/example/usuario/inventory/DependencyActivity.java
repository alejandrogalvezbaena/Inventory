package com.example.usuario.inventory;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;

import com.example.usuario.inventory.pojo.Dependency;

/**
 * Created by usuario on 25/10/17.
 */

public class DependencyActivity extends ListActivity{

    private ArrayAdapter<Dependency> dependencies;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dependency);


        dependencies =new ArrayAdapter<Dependency>(this, android.R.layout.simple_list_item_1, ((InventoryAplication)getApplicationContext()).getDependencies());
        getListView().setAdapter(dependencies);
    }
}
