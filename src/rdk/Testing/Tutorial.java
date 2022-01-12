package rdk.Testing;

import rdk.Annotations.RDK;
import rdk.Annotations.Retarded;
import rdk.Classes.Retard;

public class Tutorial {

    public static void main(String[] args) {

        @Retarded @RDK String rtrd = "Welcome to RDK.";
        Retard.out.println(rtrd);

    }
}
