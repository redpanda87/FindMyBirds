package findmybirds.net.redpandalabs.findmybirds;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by diegovillalta on 11/16/15.
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

   private ArrayList<MainDataSet> mainData;
    public MainAdapter(ArrayList<MainDataSet>a)  {
        this.mainData =a;
    }

    public static class MainViewHolder extends RecyclerView.ViewHolder{

       ImageView imageIcon;
        TextView textName;
        TextView textInfo;

        public MainViewHolder(View v){
            super(v);
          //  this.imageIcon = (ImageView)v.findViewById(R.id.imageLogo);
            this.textName = (TextView) v.findViewById(R.id.name);
            this.textInfo = (TextView) v.findViewById(R.id.info);



        }

    }
    public MainAdapter.MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.bird_main,parent,false);
    v.setOnClickListener(BirdsActivity.mainOnClickListener);
        return new MainViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MainAdapter.MainViewHolder holder, int position) {
        ImageView imageIcon =  holder.imageIcon;
        TextView textName = holder.textName;
        TextView textInfo = holder.textInfo;

       // imageIcon.setImageResource(mainData.get(position).getImage());
        textName.setText(mainData.get(position).getName());
        textInfo.setText(mainData.get(position).getInfo());



    }

    @Override
    public int getItemCount() {
        return mainData.size();
    }
}
