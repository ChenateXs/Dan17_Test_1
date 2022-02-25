package buffers;

import java.util.ArrayList;
import java.util.List;

public class LifoBuffer<T> implements Buffer<T>  {


	private List<T> bufferList;
	
	public LifoBuffer(ArrayList<T> list) {
		this.bufferList = list;
	}
	
	@Override
	public void add(T elem) {
		bufferList.add(elem);
	}

	@Override
	public T remove() {
		return bufferList.remove(size()-1);
	}

	@Override
	public int size() {
		return bufferList.size();
	}
}
