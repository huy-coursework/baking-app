package com.huyvuong.udacity.bakingapp.ui.activity;

import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.annimon.stream.Stream;
import com.huyvuong.udacity.bakingapp.R;
import com.huyvuong.udacity.bakingapp.dummy.DummyContent;
import com.huyvuong.udacity.bakingapp.model.transport.Recipe;
import com.huyvuong.udacity.bakingapp.model.transport.Step;

/**
 * A fragment representing a single Recipe detail screen.
 *
 * This fragment is either contained in a {@link RecipeListActivity} in two-pane mode (on tablets)
 * or a {@link RecipeDetailActivity} on handsets.
 */
public class RecipeDetailFragment extends Fragment
{
    /**
     * The fragment argument representing the item ID that this fragment represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private Recipe mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the fragment (e.g. upon
     * screen orientation changes).
     */
    public RecipeDetailFragment()
    {
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID))
        {
            // Load the dummy content specified by the fragment arguments. In a real-world scenario,
            // use a Loader to load content from a content provider.
            mItem = DummyContent.RECIPE_MAP.get(getArguments().getLong(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout =
                    (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null)
            {
                appBarLayout.setTitle(mItem.getName());
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.recipe_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (mItem != null)
        {
            ((TextView) rootView.findViewById(R.id.recipe_detail))
                    .setText(
                            (CharSequence) Stream.of(mItem.getSteps())
                                    .map(Step::getDescription)
                                    .reduce("", (a, b) -> a + "\n" + b));
        }

        return rootView;
    }
}
