package laboration1;

public class DString implements DynamicString, Comparable<DString>{ // implementera metoderna i DynamicString - se lab
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

	public int length() {
		return length;
	}

	public char charAt(int index) {
		return text [index];
	}

	public int indexOf(char chr) { 
		for(int i=0; i<length; i++) {
			if(chr==text[i]) 
				return i;
		}
		
		return -1; 
	}

	public String substring(int start, int end) { 
		return new String(text,start,end-start);
	}

	public String substring(int index) { 
		return substring(index, length-index);
	}

	public DynamicString append(char chr) { 
		if(length==text.length) {
			grow(); }
		text[length++] = chr;
		return this;
	}
	
	public DynamicString append(DString str) { 
		for(int i=0; i<str.length(); i++) {
			append(str.charAt(i)); }
		return this;
	}
	
	public DynamicString delete(int start, int end) { 
		System.arraycopy(text, end, text, start, length-end); 
		length -= (end-start);
		return this;
	}
	
	public DynamicString delete(int index) {
		delete(index,index+1);
		return this;
	}

	public String toString() {
		return new String(text, 0, length);
	}

	public void reverse() { 
		char tmp;
		for(int i=0; i<length/2; i++) { tmp = text[i];
		text[i] = text[length-1-i];
		text[length-1-i] = tmp; }
	}

	public boolean equals(Object o) { 
		boolean res = (this==o);
		if(!res && (o instanceof DString)) {
			DString str = (DString)o;
			res = (length==str.length);
			for(int i=0; i<length && res==true; i++) {
				res = (text[i]==str.text[i]); }
		}
		return res; 
	}

	public int compareTo(DString str) { 
		int res = 0;
		int len = Math.min(length, str.length); 
		for(int i=0; i<len && res==0; i++) {
			if(text[i]<str.text[i]) // if(text[i]<str.charAt(i))
				res = -1;
			else if(text[i]>str.text[i]) // if(text[i]>str.charAt(i)) 
				res = 1;
		}
		return res; 
	}


	public static void main(String[] args) {
		DString str1 = new DString("Laboration");
		str1.append(' ').append('1').append(new DString("\nUppgift3")); 
		System.out.println(str1);
		str1.delete(2).delete(4,6).delete(8);
		System.out.println(str1);
		DString str2 = new DString(str1);
		str2.reverse();
		System.out.println(str2);
		System.out.println(str2.compareTo(str2));
		
		
		
		
		
	}
}

