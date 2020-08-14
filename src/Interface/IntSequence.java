package Interface;

public interface IntSequence {


    default boolean hasNext() {
        return false;
    }

    default double next() {
        return 0;
    }
}
