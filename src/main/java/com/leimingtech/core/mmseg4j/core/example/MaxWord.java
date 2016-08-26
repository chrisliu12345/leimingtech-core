package com.leimingtech.core.mmseg4j.core.example;

import java.io.IOException;

import com.leimingtech.core.mmseg4j.core.MaxWordSeg;
import com.leimingtech.core.mmseg4j.core.Seg;

public class MaxWord extends Complex {

	protected Seg getSeg() {

		return new MaxWordSeg(dic);
	}

	public static void main(String[] args) throws IOException {
		new MaxWord().run(args);
	}
}
