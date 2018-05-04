package ru.spluft.remindmeandroidapp.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ru.spluft.remindmeandroidapp.R;
import ru.spluft.remindmeandroidapp.adapter.RemindListAdapter;
import ru.spluft.remindmeandroidapp.dto.RemindDTO;

public class BirthdayFragment extends AbstractTabFragment {

    private static final int LAYOUT = R.layout.fragment_birthday;

    public static BirthdayFragment getInstance(Context context) {
        Bundle bundle = new Bundle();
        BirthdayFragment fragment = new BirthdayFragment();
        fragment.setArguments(bundle);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_birthday));

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        RecyclerView rv = view.findViewById(R.id.recyclerview);
        rv.setLayoutManager(new LinearLayoutManager(context));
        rv.setAdapter(new RemindListAdapter(createMock()));

        return view;
    }

    private List<RemindDTO> createMock() {
        List<RemindDTO> data = new ArrayList<>();
        data.add(new RemindDTO("Item 1"));
        data.add(new RemindDTO("Item 2"));
        data.add(new RemindDTO("Item 3"));
        data.add(new RemindDTO("Item 4"));
        data.add(new RemindDTO("Item 5"));
        data.add(new RemindDTO("Item 6"));
        return data;
    }

    public void setContext(Context context) {
        this.context = context;
    }

}
