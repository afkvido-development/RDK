package rdk.Interfaces;

import rdk.Annotations.RDK;
import rdk.Annotations.Retarded;
import rdk.Classes.Retard;

public interface Version {


    public @Retarded @RDK String Version = "v0.0.1";

    public @Retarded @RDK
    default Retard m(@Retarded @RDK Retard retard) {

        Retard.out.println("RDK Version: " + Version);

        return new Retard();
    }
}
