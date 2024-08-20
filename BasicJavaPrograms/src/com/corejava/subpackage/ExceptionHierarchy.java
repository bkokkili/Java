package com.corejava.subpackage;

import java.io.IOException;


class ChildClass extends ExceptionHierarchy {

	@Override
	public void write(String fileName) throws IOException {
	}

}

class childClass2 extends ChildClass{

	@Override
	public void write(String fileName)  {
		
	}
	
}

public class ExceptionHierarchy {

	public void write(String fileName) throws Exception{

	}

	public static void main(String[] args) {

	}

}
