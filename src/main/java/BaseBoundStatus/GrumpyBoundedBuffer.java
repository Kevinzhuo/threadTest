package BaseBoundStatus;

/**
 * Created by Administrator on 11/6/2015.
 */
public class GrumpyBoundedBuffer<V> extends BaseBoundedBuffer<V> {

    public GrumpyBoundedBuffer(int size) {
        super(size);
    }

    public synchronized void put(V v) throws Exception {
        if (isFull())
            throw new Exception("Buffer full exception!");
        doPut(v);
    }

    public synchronized V take() throws Exception {
        if (isEmpty())
            throw new Exception("Buffer empty exception!");
        return doTake();
    }

}
