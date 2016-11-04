package sampletest.samplejson.parsing;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

import sampletest.samplejson.ParsingPojo;

public class Parsing {

	private static final String TAG = "SearchResultsParser";

	ParsingPojo data_pojo;
	ArrayList<ParsingPojo> dataArray1 = new ArrayList<ParsingPojo>();

	// method to parse the given JSON object by taking the url of the JSON as
	// argument
	public ArrayList<ParsingPojo> getList(String url) {

		url = url.replace(" ", "%20");

		try {

			ServiceHandler sh = new ServiceHandler();

			// Making a request to url and getting response
			String jsonStr = sh.makeServiceCall(url, ServiceHandler.GET);

			Log.d("Response: ", "> " + jsonStr);

			if (jsonStr != null) {

				JSONArray json_array = new JSONArray(jsonStr);

				JSONObject json = json_array.getJSONObject(0);

				JSONArray array1 = json.getJSONArray("allnews");

				// JSONArray array2 = json.getJSONArray("latest_trailers");

				// JSONArray array3 = json.getJSONArray("gallery");

				for (int i = 0; i < array1.length(); i++) {

					JSONObject jsonObject1 = null;

					try {
						jsonObject1 = array1.getJSONObject(i);
						data_pojo = new ParsingPojo(
								jsonObject1.getString("id"),
								jsonObject1.getString("cid"),
								jsonObject1.getString("uid"),
								jsonObject1.getString("created_date"),
								jsonObject1.getString("title_en"),
								jsonObject1.getString("short_desc_en"),
								jsonObject1.getString("detail_text"),
								jsonObject1.getString("xl_image_url"),
								jsonObject1.getString("image_url"),
								jsonObject1.getString("news_url"));
						dataArray1.add(data_pojo);
					} catch (JSONException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

				Log.d("array size>>>>>>>>>>>", "Date"
						+ dataArray1.get(0).getTitle_en());
				Log.d("array size>>>>>>>>>>>", dataArray1.size() + "");

			}
		} catch (Exception e) {
			Log.d(TAG, e.toString());
		}

		return dataArray1;

	}
}
