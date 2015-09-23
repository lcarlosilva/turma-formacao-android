package br.com.cast.turmaformacao.taskmanager.controllers.adapters;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import br.com.cast.turmaformacao.taskmanager.model.entities.Color;
import br.com.cast.turmaformacao.taskmanager.model.entities.Label;

public class SpinnerListAdapter extends BaseAdapter {

    private List<Label> labels;
    private Activity context;

    @Override
    public int getCount() {
        return labels.size();
    }

    @Override
    public Label getItem(int position) {
        return labels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Label item = getItem(position);

        View labelItem = context.getLayoutInflater().inflate();

        return labelItem;
    }
}
