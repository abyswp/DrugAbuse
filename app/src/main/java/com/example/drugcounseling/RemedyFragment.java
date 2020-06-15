package com.example.drugcounseling;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HelplineFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RemedyFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RemedyFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HelplineFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HelplineFragment newInstance(String param1, String param2) {
        HelplineFragment fragment = new HelplineFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_remedy, container, false);

        String[] items = {
                "\n• Addiction treatment helps the person do the following:\n" +
                        "\n" +
                        "    • stop using drugs\n" +
                        "    • stay drug-free\n" +
                        "    • be productive in the family, at work, and in society \n\n",
                "\n• There are many options that have been successful in treating drug addiction, including:\n" +
                        "\n" +
                        "    • behavioral counseling\n" +
                        "    • medication\n" +
                        "    • medicines used to treat withdrawal symptoms\n" +
                        "    • evaluation and treatment for mental health\n" +
                        "    • long-term follow-up to prevent relapse\n\n",
                "\n• Behavioral therapies help patients:\n" +
                        "\n" +
                        "    • modify their attitudes related to drug use\n" +
                        "    • increase healthy life skills\n" +
                        "    • persist with other forms of treatment\n\n",
                "\n• A Successful treatment has several steps:\n" +
                        "\n" +
                        "    • detoxification\n" +
                        "    • behavioral counseling\n" +
                        "    • medication (for opioid, tobacco, or alcohol)\n" +
                        "    • evaluation and treatment for mental issues\n" +
                        "    • long-term follow-up to prevent relapse\n\n",
        };

        ListView listView = view.findViewById(R.id.remedies);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, items);
        listView.setAdapter(listViewAdapter);

        return view;
    }
}