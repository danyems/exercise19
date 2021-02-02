package org.fujitsu.training.inner;

import java.util.Arrays;
import java.util.Iterator;

public class CoffeeCupIterator<E> implements Iterator<E>{
	
	private E[] elementData;
	private int i;
	
	public CoffeeCupIterator(E[] elementData) {
		this.elementData = elementData;
	}

	@Override
	public boolean hasNext() {
		if (i < elementData.length) {
			return true;
		}
		return false;
	}

	@Override
	public E next() {
		E data = elementData[i];
		i++;
		return data;
	}
	
	@Override
	public void remove() {
		E temp[] = (E[]) new Object[elementData.length - 1];
		
		E halfAList[] = Arrays.copyOfRange(elementData, 0, i - 1);
		E halfBList[] = Arrays.copyOfRange(elementData, i + 1, elementData.length);
		
		System.arraycopy(halfAList, 0, temp, 0, halfAList.length);
		System.arraycopy(halfBList, 0, temp, halfAList.length - 1, halfBList.length);
		
		elementData = temp;
	}

}
