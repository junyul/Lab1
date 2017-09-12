package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Round;
import pkgCore.Die;
import pkgCore.Roll;

import pkgCore.eGameResult;

public class RoundTest {

	public void test() {
		Round k= new Round();
		assertEquals(Round.ComeOutScore(7), eGameResult.NATURAL);
		assertEquals(Round.ComeOutScore(11), eGameResult.NATURAL);
		assertEquals(Round.ComeOutScore(2), eGameResult.CRAPS);
		assertEquals(Round.ComeOutScore(3), eGameResult.CRAPS);
		assertEquals(Round.ComeOutScore(12), eGameResult.CRAPS);
		
	}

}
