package madostau.madostau;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by dominikaulinger on 16.08.16.
 */
public class CreateNewTravel extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newtravel);
        onButtonClick(getCurrentFocus());
    }

    public void onButtonClick(View w){

            Button addWegpunkt = (Button) findViewById(R.id.setWegpunkte);
            addWegpunkt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                    startActivity(intent);
                }
            });

    }


}
