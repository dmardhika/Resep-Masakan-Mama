package com.example.dhianadini.resepmasakanmama;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.support.annotation.NonNull;
import android.widget.TextView;


import com.example.dhianadini.resepmasakanmama.data.Assets;

import org.w3c.dom.Text;

import java.util.List;

public class ResepListAdapter extends BaseAdapter {
//    public ResepListAdapter( Context context, int resource, List<Assets> objects) {
//        super(context, resource, objects);
//    }
//
//    @NonNull
//    @Override
//    public View getView(int position, View convertView,  ViewGroup parent) {
//        View view = convertView;
//
//        if(null == view){
//            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            view = inflater.inflate(R.layout.fragment_allrecipes, null);
//        }
//        Assets assets = getItem(position);
//        ImageView img = (ImageView) view.findViewById(R.id.imageView);
//        TextView text = (TextView) view.findViewById(R.id.namaresep);
//
//        img.setImageResource(assets.getImageId());
//        text.setText(assets.getTitle());
//        return view;
//
//    }

        // Keeps track of the context and list of images to display
    private Context mContext;
    private List<Integer> mImageIds;

    /**
     * Constructor method
     * @param imageIds The list of images to display
     */
    public ResepListAdapter(Context context, List<Integer> imageIds) {
        mContext = context;
        mImageIds = imageIds;
    }

    /**
     * Returns the number of items the adapter will display
     */
    @Override
    public int getCount() {
        return mImageIds.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    /**
     * Creates a new ImageView for each item referenced by the adapter
     */
    public View getView(final int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // If the view is not recycled, this creates a new ImageView to hold an image
            imageView = new ImageView(mContext);
            // Define the layout parameters
            imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        // Set the image resource and return the newly created ImageView
        imageView.setImageResource(mImageIds.get(position));
        return imageView;

    }
}
