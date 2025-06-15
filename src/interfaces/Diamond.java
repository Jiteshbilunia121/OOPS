package interfaces;

public class Diamond {

    interface X {
        default void log() { System.out.println("X"); }
    }

    interface Y {
        default void log() { System.out.println("Y"); }
    }

    class Z implements X, Y {
        @Override
        public void log() {
            X.super.log(); // Explicitly choose X's implementation
            Y.super.log(); // Explicitly choose Y's implementation
        }
    }

}
