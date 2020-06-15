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
public class IdentifyFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public IdentifyFragment() {
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
        View view = inflater.inflate(R.layout.fragment_identify, container, false);

        String[] items = {
                "\n• Substance addiction is dependence on any one or more of the following:\n" +
                        "\n" +
                        "    1. nicotine, or tobacco\n" +
                        "    2. alcohol\n" +
                        "    3. inhalants\n" +
                        "    4. drugs, illicit or non-illicit\n" +
                        "    5. medication\n\n",
                "\n• In the early stages, a person might not show telltale signs of a full-blown addiction. Some early stage clues include:\n" +
                        "\n" +
                        "    1. experimentation\n" +
                        "    2. family history of addiction\n" +
                        "    3. being drawn to an activity or substance\n" +
                        "    4. loss of control and no feelings of remorse\n\n",
                "\n• After a person moves past experimenting or the early phase of addiction, they’ll likely exhibit major personality or behavior changes. These changes may be infrequent at first. Telltale signs include:\n" +
                        "\n" +
                        "    1. a lack of interest in hobbies\n" +
                        "    2. neglecting relationships\n" +
                        "    3. missing important obligations like work\n" +
                        "    4. risk taking tendencies\n" +
                        "    5. ignoring negative consequences\n" +
                        "    6. distinct change in sleeping patterns\n" +
                        "    7. increased secrecy\n",
                "\n• Another way to recognize addiction is to pay attention to your friend or family member’s mental and physical health. Whether the addiction is to a drug or a behavior, their health will almost always decline.\n" +
                        "\n" +
                        "Signs that point towards changes in their health can include:\n" +
                        "\n" +
                        "    1. bloodshot or glazed eyes\n" +
                        "    2. constant illness\n" +
                        "    3. unexplained injuries\n" +
                        "    4. abrupt change in weight\n" +
                        "    5. bad skin, hair, teeth, and nails\n" +
                        "    6. increased tolerance to drugs\n" +
                        "    7. physical withdrawal symptoms like sweating\n" +
                        "    8. memory loss or problems with recall\n" +
                        "    9. change in speech like slurred words\n\n",
                        "\nThe following mental and emotional changes could also be signs of an addiction problem:\n" +
                        "\n" +
                        "    1. sudden changes in mood\n" +
                        "    2. aggressive behavior\n" +
                        "    3. irritability\n" +
                        "    4. depression\n" +
                        "    5. apathy\n" +
                        "    6. suicidal thoughts\n" +
                        "\n"
        };

        ListView listView = view.findViewById(R.id.identification);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, items);
        listView.setAdapter(listViewAdapter);

        return view;
    }
}