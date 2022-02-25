package buffers;

public interface Buffer<T> {
	void add(T elem);
	T remove();
	int size();
}
