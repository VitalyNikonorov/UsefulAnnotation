package net.nikonorov.usefulannotation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import net.nikonorov.lib.NeedRefactoring;
import net.nikonorov.lib.RefactorThisShit;

/**
 * Created by Vitaly Nikonorov on 26.05.2018.
 * email@nikonorov.net
 *
 * Example of using useful annotations
 */
public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @RefactorThisShit(description = "extract this code in repository or data layer")
    private void networkCall() {
        //some method for network request - activity is not the best place for this code
    }

    @NeedRefactoring(description = "extract this code in model or in interactor (domain layer)")
    private void someBusinessLogic() {
        //some method with 1k lines of code with application business logic
    }
}
