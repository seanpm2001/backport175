/*******************************************************************************************
 * Copyright (c) Jonas Bon�r, Alexandre Vasseur. All rights reserved.                      *
 * http://backport175.codehaus.org                                                         *
 * --------------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of Apache License Version 2.0 *
 * a copy of which has been included with this distribution in the license.txt file.       *
 *******************************************************************************************/
package test.filtering;

public class Target {

    /**
     * @test.filtering.MemberFilteringTests.A
     */
    public Target() {
    }

    /**
     * @test.filtering.MemberFilteringTests.B
     */
    public Target(int[][] i, Object[] o, boolean b) {
    }

    /**
     * @test.filtering.MemberFilteringTests.A
     */
    void A(String s, int i, double d, float f, byte b, char c, short t, long l, boolean bool) {
    }

    /**
     * @test.filtering.MemberFilteringTests.B
     */
    void B(String s, int i, double d, float f, byte b, char c, short t, long l, boolean bool) {
    }

    /**
     * @test.filtering.MemberFilteringTests.A
     */
    public String[] A;

    /**
     * @test.filtering.MemberFilteringTests.B
     */
    public int[][] B;
}