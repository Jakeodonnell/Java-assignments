package laboration1;

public class DString implements DynamicString { // implementera metoderna i DynamicString - se lab
	private char[] text;
	private int length = 0;
	
	public DString() {
		this(10);
	}
	
	public DString(int size) {
		size = (size<=0) ? 10 : size;
		text = new char[size];
		length = 0;
	}
	
	public DString(String str) {
		text = str.toCharArray();
		length = text.length;
	}
	
	public DString(DString str) {
		text = new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			text[i] = str.charAt(i);
		}
		length = text.length;
	}
	
	private void grow() {
		char[] newArr = new char[length*2];
		System.arraycopy(text, 0, newArr, 0, text.length);
		text = newArr;
	}
	
	public DynamicString append(char chr) {
		if(length==text.length) {
			grow();
		}
		text[length++] = chr;
		
		return this;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return length();
	}

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return text[index];
	}

	@Override
	public DynamicString append(DString str) {
		for(int i = 0; i < str.length; i++) {
			append(str.charAt(i));
		}
		
		return this;
		
	}

	@Override
	public DynamicString delete(int start, int end) {
		System.arraycopy(text, end, text, start, length = end);
		length -= (end-start);
		
		return this;
	}

	@Override
	public DynamicString delete(int index) {
		delete(index, index+1);
		
		return this;
		
	}

	@Override
	public String substring(int start, int end) {
		return new String(text,start,end-start);
	}

	@Override
	public String substring(int start) {
		return substring(start, length-start);
	}

	@Override
	public int indexOf(char chr) {
		for(int i=0; i < length; i++) {
			if (chr == text[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean equals(Object obj) {
		boolean res = (this==obj);
		if(!res && (obj instanceof DString)) {
			
		}
	}
}