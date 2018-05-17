package com.example.androidbti.provamobile;


import android.app.Activity;
import android.os.Bundle;
import android.app.ListFragment;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListaContatosFragment extends ListFragment {

    static interface ListaContatosListener {
        void itemClicked(long id);
    }

    private ListaContatosListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] names = new String[Contato.contatos.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = Contato.contatos[i].getNome();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                inflater.getContext(), android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);

        return super.onCreateView(inflater, container,savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.listener = (ListaContatosListener) activity;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if (listener != null) {
           listener.itemClicked(id);
        }
    }

}
