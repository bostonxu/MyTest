package com.winssoft.test;

public class InterfaceTest {
	public static void main(String[] args) {
		System.out.println("interface demo");
		USB mdDisk = new MoveDisk();
		mdDisk.read();
		mdDisk.write();
		USB ud = new UDisk();
		ud.read();
		ud.write();
		
		USB[] usbs = new USB[2];
		usbs[0] = mdDisk;
		usbs[1] = ud;
		System.out.println("------------------");
		for (int i = 0; i < usbs.length; i++) {
			USB usb = usbs[i];
			usb.read();
			usb.write();
		}
	}
}

interface USB {
	public static final String VERSION = "2.0";
	public void read();
	public void write();
}

class MoveDisk implements USB {
	@Override
	public void read() {
		System.out.println("read" + ", current version" + VERSION);
	}

	@Override
	public void write() {
		System.out.println("write" + ", current version" + VERSION);
	}
	
}

class UDisk implements USB {

	@Override
	public void read() {
		System.out.println("udisk read");
	}

	@Override
	public void write() {
		System.out.println("udisk write");
	}
	
}