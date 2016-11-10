package firebase.sofdroid.com.firebaseapplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Sofien on 10/11/2016.
 */

public class Global {
    /**
     *  GLOBALLIST is a list of Firebase features
     */
    public static final List<String> GLOBALLIST =
            Collections.unmodifiableList(
                    Arrays.asList(
                            "Firebase Authentication",
                            "Firebase DataBase",
                            "Firebase Storage",
                            "Firebase Sign up new users",
                            "Firebase Sign in existing users",
                            "Firebase Access user information"
                    )
            );
}
