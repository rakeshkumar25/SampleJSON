package sampletest.samplejson;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import sampletest.samplejson.network.NetworkUtil;
import sampletest.samplejson.parsing.ServiceHandler;
import sampletest.samplejson.utils.BaseActivity;

@SuppressWarnings("deprecation")
public class HomeScreen extends BaseActivity {

    // Handler
    Runnable runnable, runnable2 = null;
    Handler handler, handler2, handler3;
    int handler_position, handler_position2 = 0;
    String url, imagesname_String;


    // private GoogleAnalytics mGATracker;

    BannerPojo bannerPojo;
    HomePojo data_pojo;
    ArrayList<BannerPojo> bannerArray = new ArrayList<BannerPojo>();
    ArrayList<HomePojo> latest_headlinesArray = new ArrayList<HomePojo>();
    ArrayList<HomePojo> nowplayingArray = new ArrayList<HomePojo>();
    ArrayList<HomePojo> galleryArray = new ArrayList<HomePojo>();
    ArrayList<HomePojo> latest_trailersArray = new ArrayList<HomePojo>();


    ArrayList<String> imagesURL = new ArrayList<String>();


    BannerAdapter bannerAdapter;



    int bannerPosition;

    ViewPager banner_Pager, nowplaying_pager, iqdb_pager, homegallery_Pager,
            shortfilms_Pager, trailers_Pager = null;

    ProgressDialog Dialog;
    Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.home);


        banner_Pager = (ViewPager) findViewById(R.id.banner_viewPager);

        banner_Pager.setPageTransformer(true, new DepthPageTransformer());


        // Internet COnnection
        int conn = NetworkUtil.getConnectivityStatus(getApplicationContext());

        if (conn == NetworkUtil.TYPE_WIFI) {

            new getData().execute();

        } else if (conn == NetworkUtil.TYPE_MOBILE) {

            new getData().execute();
        } else if (conn == NetworkUtil.TYPE_NOT_CONNECTED) {


        }

        bannerAdapter = new BannerAdapter(getApplicationContext());

    }


    public class BannerAdapter extends PagerAdapter {

        private final Context mContext;

        protected BannerAdapter(Context context) {
            this.mContext = context;

        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return imagesURL.size();
        }

        @Override
        public Object instantiateItem(ViewGroup container, final int position) {
            // TODO Auto-generated method stub

            LayoutInflater inflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.row, container, false);

            ImageView imageView = (ImageView) layout
                    .findViewById(R.id.imageView1);
            final ProgressBar progressBar = (ProgressBar) layout
                    .findViewById(R.id.loading);
            TextView textView = (TextView) layout.findViewById(R.id.text_line);

            textView.setText(bannerArray.get(position).getBanner_title_en());

            Picasso.with(HomeScreen.this)
                    .load(imagesURL.get(position))
                    //this is also optional if some error has occurred in downloading the image this image would be displayed
                    .into(imageView);


            ((ViewPager) container).addView(layout, 0);


            return layout;
        }

        @Override
        public void destroyItem(View container, int position, Object obj) {
            ((ViewPager) container).removeView((View) obj);
        }

        @Override
        public boolean isViewFromObject(View container, Object obj) {
            return container == obj;
        }

    }


    public class getData extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            Dialog = new ProgressDialog(HomeScreen.this);
            Dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            Dialog.setMessage("Loading...");
            Dialog.setCancelable(false);
            Dialog.show();
        }

        protected Void doInBackground(Void... arg0) {
            // TODO Auto-generated method stub

            url = "http://www.iqlikmovies.com/iqlik_api5/home.php";

            ServiceHandler sh = new ServiceHandler();

            // Making a request to url and getting response
            String jsonStr = sh.makeServiceCall(url, ServiceHandler.GET);

            // Log.e("Response: ", "> " + jsonStr);

            if (jsonStr != null) {
                // JSONObject jsonObj = new JSONObject(resp);
                // Log.e("inside jsonStr: ", " jsonStr != null");
                try {
                    // Log.e("inside try1: ", "inside try1: ");
                    JSONArray json_array = new JSONArray(jsonStr);
                    // Log.e("inside try2: ", "inside try1: ");
                    JSONObject json = json_array.getJSONObject(0);
                    // Log.e("inside try3: ", "inside try1: ");

                    JSONArray bannerarray1 = json.getJSONArray("banner");

                    JSONArray latest_headlinearray1 = json
                            .getJSONArray("latest_headline");

                    JSONArray now_playingarray1 = json
                            .getJSONArray("now_playing");

                    JSONArray galleryarray1 = json.getJSONArray("gallery");

                    JSONArray latest_trailersarray1 = json
                            .getJSONArray("latest_trailers");
                    JSONArray short_filmsarray1 = json
                            .getJSONArray("short_films");
                    JSONArray eventsarray1 = json.getJSONArray("events");

                    JSONArray iqdbarray1 = json.getJSONArray("iqdb");

                    JSONArray hidden_treasuresarray1 = json
                            .getJSONArray("hidden_treasures");

                    // Log.e("inside try4: ", "inside try1: ");

                    for (int i = 0; i < bannerarray1.length(); i++) {
                        // Log.e("inside loop: ", "loop");
                        JSONObject jsonObject1 = null;
                        try {
                            jsonObject1 = bannerarray1.getJSONObject(i);
                            bannerPojo = new BannerPojo(
                                    jsonObject1.getString("id"),
                                    jsonObject1.getString("detail_description"),
                                    jsonObject1.getString("image_url"),
                                    jsonObject1.getString("video_url"),
                                    jsonObject1.getString("title_en"));
                            bannerArray.add(bannerPojo);
                            // Log.e("Banner image url>>>>>>>>>>>", "here "
                            // + bannerPojo.getBanner_description());
                            // Log.e("Banner TITLE>>>>>>>>>>>", "here "
                            // + bannerPojo.getBanner_title_en());
                        } catch (JSONException e) {
                            // TODO Auto-generated catch block
                            // Log.e("inside catch json: ",
                            // "inside catch json: ");
                            e.printStackTrace();
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                            // Log.e("inside catche: ", "inside catche: ");
                            e.printStackTrace();
                        }
                    }


                    // Log.e("array size>>>>>>>>>>>", "Date"
                    // + dataArray.get(0).getCreated_date());

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {

                // Log.e("ServiceHandler",
                // "Couldn't get any data from the url");

            }

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            // TODO Auto-generated method stub
            super.onPostExecute(result);

            if (bannerArray != null) {
                for (int i = 0; i < bannerArray.size(); i++) {
                    imagesURL.add(bannerArray.get(i).getBanner_image_url());
                    // imagesURL2.add(dataArray.get(i).getHeadlines_image_url());
                }

                banner_Pager.setAdapter(bannerAdapter);


            }

            Dialog.dismiss();

        }
    }



    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub


    }






    @Override
    public void onDestroy() {
        super.onDestroy();
        if (Dialog != null && Dialog.isShowing()) {
            Dialog.dismiss();
        }


    }

}
