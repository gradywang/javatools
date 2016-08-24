package grady.net;

import static org.junit.Assert.*;

import org.junit.Assume;
import org.junit.Test;

public class NetBytesHandlerTest {

	@Test
	public final void testToLHInt() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testToHHInt() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testToLHShort() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testToHHShort() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testToLHFloat() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testToHHFloat() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testStringToBytesStringInt() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testBytesToString() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testStringToBytesString() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testHBytesToInt() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testLBytesToInt() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testHBytesToShort() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testLBytesToShort() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testHBytesToFloat() {
		float floatValue = 19.8f;
		byte[] lhbytes = NetBytesHandler.toHH(floatValue);
		float floatConvert = NetBytesHandler.hBytesToFloat(lhbytes);
		Assume.assumeTrue(floatValue == floatConvert);
	}

	@Test
	public final void testLBytesToFloat() {
		float floatValue = 19.8f;
		byte[] lhbytes = NetBytesHandler.toLH(floatValue);
		NetBytesHandler.logBytes(lhbytes);
		float floatConvert = NetBytesHandler.lBytesToFloat(lhbytes);
		Assume.assumeTrue(floatValue == floatConvert);
	}

	@Test
	public final void testBytesReverseOrder() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testPrintBytes() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testLogBytes() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testReverseInt() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testReverseShort() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testReverseFloat() {
		fail("Not yet implemented"); // TODO
	}

}
