package personthecat.cavegenerator;

// This doesn't work
public class WriteOnceLock<T> {
    private T readOnly;
    private T value;

    public T get() {
        if (this.readOnly == null) {
            synchronized (this) {
                if (this.value == null) {
                    throw new IllegalStateException("Uninitialized value");
                }
                this.readOnly = this.value;
                this.value = null;
            }
        }
        return this.readOnly;
    }

    public synchronized void set(T value) {
        if (this.readOnly != null) {
            throw new IllegalStateException("Already defined");
        }
        this.value = value;
    }
}
