package com.example.usuario.inventory;

import android.app.Application;

import com.example.usuario.inventory.pojo.Dependency;

import java.util.ArrayList;

/**
 * Created by usuario on 25/10/17.
 */

public class InventoryAplication extends Application {
    ArrayList<Dependency> dependencies;

    public InventoryAplication(){}

    public InventoryAplication(ArrayList<Dependency> dependencies) {
        dependencies = new ArrayList<>();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        dependencies=new ArrayList<>();
        addDependency(new Dependency(1, "1º Ciclo Formativo Grado Superior", "1CFGS", "1CFGS Desarrollo aplicaciones Multiplataforma" ));
        addDependency(new Dependency(2, "2º Ciclo Formativo Grado Superior", "2CFGS", "2CFGS Desarrollo aplicaciones Multiplataforma" ));
    }

    /**
     * Metodo que añade una dependencia
     * @param dependency
     */

    public void addDependency(Dependency dependency)
    {
        dependencies.add(dependency);
    }

    public ArrayList<Dependency> getDependencies()
    {
        return dependencies;
    }
}
