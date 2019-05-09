package co.br.zombies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView)findViewById(R.id.minha_lista);
        List<Zombie> zombies = gerarZombies();

        final ListaZombiesAdapter zombiesAdapter = new ListaZombiesAdapter(this,  zombies);
        listView.setAdapter(zombiesAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                Zombie zombie = zombiesAdapter.getItem(position);
                Toast.makeText(getApplicationContext(),zombie.getNome(), Toast.LENGTH_LONG).show();
            }
        });
    }

    private List<Zombie> gerarZombies() {
        List<Zombie> zombies = new ArrayList<Zombie>();
        zombies.add(criarZombie("Shane", 23, R.drawable.z1));
        zombies.add(criarZombie("Hershel", 23, R.drawable.z2));
        zombies.add(criarZombie("Glen", 23, R.drawable.z3));

        return zombies;
    }

    private Zombie criarZombie(String nome, int idade, int image) {
        Zombie zombie = new Zombie(nome, idade, image);
        return zombie;
    }


}
