package edu.washington.ghirme.lifecounter;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private int p1Score = 20;
    private int p2Score = 20;
    private int p3Score = 20;
    private int p4Score = 20;
    private String loserText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.p1PlusOne).setOnClickListener(mClickListener);
        findViewById(R.id.p1MinusOne).setOnClickListener(mClickListener);
        findViewById(R.id.p1PlusFive).setOnClickListener(mClickListener);
        findViewById(R.id.p1MinusFive).setOnClickListener(mClickListener);

        findViewById(R.id.p2PlusOne).setOnClickListener(mClickListener);
        findViewById(R.id.p2MinusOne).setOnClickListener(mClickListener);
        findViewById(R.id.p2PlusFive).setOnClickListener(mClickListener);
        findViewById(R.id.p2MinusFive).setOnClickListener(mClickListener);

        findViewById(R.id.p3PlusOne).setOnClickListener(mClickListener);
        findViewById(R.id.p3MinusOne).setOnClickListener(mClickListener);
        findViewById(R.id.p3PlusFive).setOnClickListener(mClickListener);
        findViewById(R.id.p3MinusFive).setOnClickListener(mClickListener);

        findViewById(R.id.p4PlusOne).setOnClickListener(mClickListener);
        findViewById(R.id.p4MinusOne).setOnClickListener(mClickListener);
        findViewById(R.id.p4PlusFive).setOnClickListener(mClickListener);
        findViewById(R.id.p4MinusFive).setOnClickListener(mClickListener);

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("p1Score", p1Score);
        savedInstanceState.putInt("p2Score", p2Score);
        savedInstanceState.putInt("p3Score", p3Score);
        savedInstanceState.putInt("p4Score", p4Score);
        savedInstanceState.putString("loser", loserText);

        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        p1Score = savedInstanceState.getInt("p1Score");
        p2Score = savedInstanceState.getInt("p2Score");
        p3Score = savedInstanceState.getInt("p3Score");
        p4Score = savedInstanceState.getInt("p4Score");
        loserText = savedInstanceState.getString("loser");

        TextView p1TextScore = (TextView) findViewById(R.id.p1Score);
        TextView p2TextScore = (TextView) findViewById(R.id.p2Score);
        TextView p3TextScore = (TextView) findViewById(R.id.p3Score);
        TextView p4TextScore = (TextView) findViewById(R.id.p4Score);
        TextView loser = (TextView) findViewById(R.id.loser);

        p1TextScore.setText(p1Score + "");
        p2TextScore.setText(p2Score + "");
        p3TextScore.setText(p3Score + "");
        p4TextScore.setText(p4Score + "");
        loser.setText(loserText);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    private View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView p1TextScore = (TextView) findViewById(R.id.p1Score);
            TextView p2TextScore = (TextView) findViewById(R.id.p2Score);
            TextView p3TextScore = (TextView) findViewById(R.id.p3Score);
            TextView p4TextScore = (TextView) findViewById(R.id.p4Score);
            TextView loser = (TextView) findViewById(R.id.loser);

            switch(v.getId()) {
                //PLAYER 1
                case R.id.p1PlusOne:
                    p1Score += 1;
                    p1TextScore.setText(p1Score + "");
                    break;
                case R.id.p1MinusOne:
                    p1Score -= 1;
                    p1TextScore.setText(p1Score + "");
                    if (p1Score <= 0) {
                        loser.setText("Player 1 LOSES!");
                        loserText = "Player 1 LOSES!";
                    }
                    break;
                case R.id.p1PlusFive:
                    p1Score += 5;
                    p1TextScore.setText(p1Score + "");
                    break;
                case R.id.p1MinusFive:
                    p1Score -= 5;
                    p1TextScore.setText(p1Score + "");
                    if (p1Score <= 0) {
                        loser.setText("Player 1 LOSES!");
                        loserText = "Player 1 LOSES!";
                    }
                    Log.i("p1", "minus 5 player1");
                    break;
                //PLAYER 2
                case R.id.p2PlusOne:
                    p2Score += 1;
                    p2TextScore.setText(p2Score + "");
                    break;
                case R.id.p2MinusOne:
                    p2Score -= 1;
                    p2TextScore.setText(p2Score + "");
                    if (p2Score <= 0) {
                        loser.setText("Player 2 LOSES!");
                        loserText = "Player 2 LOSES!";
                    }
                    break;
                case R.id.p2PlusFive:
                    p2Score += 5;
                    p2TextScore.setText(p2Score + "");
                    break;
                case R.id.p2MinusFive:
                    p2Score -= 5;
                    p2TextScore.setText(p2Score + "");
                    if (p2Score <= 0) {
                        loser.setText("Player 2 LOSES!");
                        loserText = "Player 2 LOSES!";
                    }
                    break;
                //PLAYER 3
                case R.id.p3PlusOne:
                    p3Score += 1;
                    p3TextScore.setText(p3Score + "");
                    break;
                case R.id.p3MinusOne:
                    p3Score -= 1;
                    p3TextScore.setText(p3Score + "");
                    if (p3Score <= 0) {
                        loser.setText("Player 3 LOSES!");
                        loserText = "Player 3 LOSES!";
                    }
                    break;
                case R.id.p3PlusFive:
                    p3Score += 5;
                    p3TextScore.setText(p3Score + "");
                    break;
                case R.id.p3MinusFive:
                    p3Score -= 5;
                    p3TextScore.setText(p3Score + "");
                    if (p3Score <= 0) {
                        loser.setText("Player 3 LOSES!");
                        loserText = "Player 3 LOSES!";
                    }
                    break;
                //PLAYER 4
                case R.id.p4PlusOne:
                    p4Score += 1;
                    p4TextScore.setText(p4Score + "");
                    break;
                case R.id.p4MinusOne:
                    p4Score -= 1;
                    p4TextScore.setText(p4Score + "");
                    if (p4Score <= 0) {
                        loser.setText("Player 4 LOSES!");
                        loserText = "Player 4 LOSES!";
                    }
                    break;
                case R.id.p4PlusFive:
                    p4Score += 5;
                    p4TextScore.setText(p4Score + "");
                    break;
                case R.id.p4MinusFive:
                    p4Score -= 5;
                    p4TextScore.setText(p4Score + "");
                    if (p4Score <= 0) {
                        loser.setText("Player 4 LOSES!");
                        loserText = "Player 4 LOSES!";
                    }
                    break;
            }

            if (p1Score > 0 && p2Score <= 0 && p3Score <= 0 && p4Score <= 0) {
                loser.setText("Player 1 WINS!");
            } else if (p2Score > 0 && p1Score <= 0 && p3Score <= 0 && p4Score <= 0) {
                loser.setText("Player 2 WINS!");
            } else if (p3Score > 0 && p1Score <= 0 && p2Score <= 0 && p4Score <= 0) {
                loser.setText("Player 3 WINS!");
            } else if (p4Score > 0 && p1Score <= 0 && p3Score <= 0 && p2Score <= 0) {
                loser.setText("Player 4 WINS!");
            }
        }
    };
}
