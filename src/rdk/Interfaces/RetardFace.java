package rdk.Interfaces;

import rdk.Annotations.RDK;
import rdk.Annotations.Retarded;
import rdk.Classes.Retard;

public interface RetardFace {

    @RDK String RetardedKid = "Are you a seven year old retard";

    @RDK @Retarded Retard rd = new Retard();
}
