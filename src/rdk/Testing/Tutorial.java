package rdk.Testing;

import rdk.Annotations.RDK;
import rdk.Annotations.Retarded;
import rdk.Classes.Retard;
import rdk.Interfaces.RetardFace;
import rdk.Records.RecordThing;

public class Tutorial {

    public static void main(String[] args) {

        @Retarded @RDK String rtrd = "Welcome to RDK.";

        Retard.out.println(rtrd);

        RetardFace.RetardedKid.strip(); // Retard style


        RecordThing thing = new RecordThing(rdk.Enums.Retard.RETARDED_RETARD);



    }
}
