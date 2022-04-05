package com.gouermazi.craw;

import com.gouermazi.craw.refactoring.Agency;
import com.gouermazi.craw.refactoring.LinkHunter;

import java.io.IOException;

/**
 * @author jie chen
 * @year 2022
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Agency agency = new LinkHunter("/home/chen/xxx");
        agency.takeDown("http://www.hao6v.com/dy/2018-12-03/WuMingZhiBei.html");
    }
}
