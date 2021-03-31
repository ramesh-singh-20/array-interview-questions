package com.alphacoder.arrays

import spock.lang.Specification

class ArrayUtilTest extends Specification{

    def 'Test ArrayUtil | maxNonOverLappingSumCount() | Array with different elements'(){
        given:
        def arr= new int[]{10, 1, 3, 1, 2, 2, 1, 0, 4}

        when:
        def result= ArrayUtil.maxNonOverLappingSumCount(arr);

        then:
        result== 3;
    }

    def 'Test ArrayUtil | maxNonOverLappingSumCount() | Array with same elements'(){
        given:
        def arr= new int[]{9, 9, 9, 9, 9}

        when:
        def result= ArrayUtil.maxNonOverLappingSumCount(arr);

        then:
        result== 2;
    }

    def 'Test ArrayUtil | maxNonOverLappingSumCount() | Array with lot different elements'(){
        given:
        def arr= new int[]{11, 12, 13, 14, 15, 16, 17, 10, 1, 3, 1, 2, 2, 1, 0, 4}

        when:
        def result= ArrayUtil.maxNonOverLappingSumCount(arr);

        then:
        result== 3;
    }

    def 'Test ArrayUtil | maxNonOverLappingSumCount() | Array with lot similiar elements'(){
        given:
        def arr= new int[]{11, 12, 13, 14, 15, 16, 17, 9, 9, 9, 9, 9, 9, 9}

        when:
        def result= ArrayUtil.maxNonOverLappingSumCount(arr);

        then:
        result== 3;
    }

}
