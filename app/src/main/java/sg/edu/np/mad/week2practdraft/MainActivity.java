package sg.edu.np.mad.week2practdraft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button followButton;
    private boolean isFollowed;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        TextView nameTextView = findViewById(R.id.textView2);
        followButton = findViewById(R.id.button);

        // Set initial values
        nameTextView.setText("User Name");
        isFollowed = false;
        updateFollowButton();

        // Button click listeners
        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleFollowStatus();
                updateFollowButton();
            }
        });

        Button messageButton = findViewById(R.id.button2);
        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action for message button
            }
        });
    }

    private void toggleFollowStatus() {
        isFollowed = !isFollowed;
        user.setFollowed(isFollowed);
    }

    private void updateFollowButton() {
        if (isFollowed) {
            followButton.setText("UNFOLLOW");
        } else {
            followButton.setText("FOLLOW");
        }
    }
}