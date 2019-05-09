package co.br.zombies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListaZombiesAdapter extends ArrayAdapter<Zombie> {

    private Context context;
    private List<Zombie> zombies = null;

    public ListaZombiesAdapter(Context context,  List<Zombie> zombies) {
        super(context,0, zombies);
        this.zombies = zombies;
        this.context = context;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        Zombie zombie = zombies.get(position);

        if(view == null)
            view = LayoutInflater.from(context).inflate(R.layout.item_list_zombies, null);

        ImageView imageViewZombie = (ImageView) view.findViewById(R.id.image_view_zombie);
        imageViewZombie.setImageResource(zombie.getImagem());

        TextView textViewNomeZombie = (TextView) view.findViewById(R.id.text_view_nome_zombie);
        textViewNomeZombie.setText(zombie.getNome());

        TextView textViewIdade = (TextView)view.findViewById(R.id.text_view_idade_zombie);
        String textoIdade = String.valueOf(zombie.getIdade()) + " anos de idade." ;
        textViewIdade.setText(textoIdade);

        return view;
    }
}


