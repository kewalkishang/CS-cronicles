package com.example.mahimasinghdeo.navigationdrawer;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;


public class newsfeed extends ActionBarActivity {
    TextView tv,tv1;
    private ProgressDialog mProgressDialog;
    String header,contentin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsfeed);
        tv= (TextView) findViewById(R.id.json);
        tv1= (TextView) findViewById(R.id.json1);
        mProgressDialog = new ProgressDialog(newsfeed.this);
        mProgressDialog.setIndeterminate(false);

        mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
       new kewal().execute();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_newsfeed, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public class kewal extends AsyncTask<Void, Void, Void> {

        String url = "http://204.152.203.111/kewal.php";

        @Override
        protected Void doInBackground(Void... params) {
            HttpClient httpClient = new DefaultHttpClient();
            try {
                HttpPost httpPost=new HttpPost(url);
                HttpResponse httpResponse= httpClient.execute(httpPost);
                HttpEntity httpEntity=httpResponse.getEntity();
                String data= EntityUtils.toString(httpEntity);
                parseJson(data);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (ClientProtocolException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        private void parseJson(String data) {
            Log.d("kewal", data);

      header=data.substring(0,data.indexOf('$'));
          contentin=data.substring(data.indexOf('$')+1,data.length()-1);
        }

        protected void onPreExecute(){

            mProgressDialog.show();
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            mProgressDialog.dismiss();
            super.onPostExecute(aVoid);
            
            tv.setText(header);
            tv1.setText(contentin);
        }
    }
}
