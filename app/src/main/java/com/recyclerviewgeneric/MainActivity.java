package com.recyclerviewgeneric;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.recyclerviewgeneric.model.BaseModel;
import com.recyclerviewgeneric.model.Collection;
import com.recyclerviewgeneric.model.Product;
import com.recyclerviewgeneric.model.Recipe;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        List<BaseModel> baseModels = new ArrayList<>();
        Product product = new Product();
        product.setTitle("BBQ Chicken");
        baseModels.add(product);
        Recipe recipe = new Recipe();
        recipe.setTitle("Pulled Pork");
        baseModels.add(recipe);
        Collection collection = new Collection();
        collection.setTitle("Recipe Collection");
        baseModels.add(collection);
        Recipe recipe2 = new Recipe();
        recipe2.setTitle("Pulled Chicken");
        baseModels.add(recipe2);
        Collection collection2 = new Collection();
        collection2.setTitle("Hot and Spicy Collection");
        baseModels.add(collection2);
        Recipe recipe3 = new Recipe();
        recipe3.setTitle("Beef pepper fry");
        baseModels.add(recipe3);

        RecyclerView list = (RecyclerView) findViewById(R.id.list);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(new InventoryAdapter(baseModels,this));
    }
}