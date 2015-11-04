package putTake;

import java.util.concurrent.Semaphore;

/**
 * Created by Administrator on 11/4/2015.
 */
public class BoundedBuffer<E> {

    private final Semaphore availableItems, availableSpace;
    private final E[] items;
    private int putPosition = 0, takePostion = 0;

    public BoundedBuffer(int capacity) {
        availableItems = new Semaphore(0);
        availableSpace = new Semaphore(capacity);
        items = (E[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return availableItems.availablePermits() == 0;
    }

    public boolean isFull() {
        return availableSpace.availablePermits() == 0;
    }

    public void put(E x) throws InterruptedException {
        availableSpace.acquire();
        doInsert(x);
        availableItems.release();
    }

    public E take() throws InterruptedException {
        availableItems.acquire();
        E item = doExtract();
        availableSpace.release();
        return item;
    }

    private synchronized void doInsert(E x) {
        int i = putPosition;
        items[i] = x;
        putPosition = (++i == items.length) ? 0 : i;
    }

    private synchronized E doExtract() {
        int i = takePostion;
        E x = items[i];
        items[i] = null;
        takePostion = (++i == items.length) ? 0 : i;
        return x;
    }

}
