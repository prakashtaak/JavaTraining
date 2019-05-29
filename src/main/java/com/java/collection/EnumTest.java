package com.java.collection;

import java.util.*;
import java.util.stream.Collectors;

public class EnumTest {

    /*
     Enum to demonstrate Optional usage when trying to access enum constant using string

     */
    enum OptionalEnum {

        STATE1("state1"), STATE2("state1"), STATE3("state1");
        private String value;

        OptionalEnum(String value) {
            this.value = value;
        }

        public static Optional<OptionalEnum> getEnumFromString(String name) {
            return Optional.ofNullable(StaticEnumStringConstant.mapOfEnumConstants.get(name));
        }


        static class StaticEnumStringConstant {
            final static Map<String, OptionalEnum> mapOfEnumConstants = getEumStringConstantMap();

            private static Map<String, OptionalEnum> getEumStringConstantMap() {
                return Arrays.stream(OptionalEnum.values()).collect(Collectors.toMap(Object::toString, r -> r));
            }


        }
    }



    public static void main(String[] args) {

        Optional<OptionalEnum> data = OptionalEnum.getEnumFromString("state");
        System.out.println(data.isPresent());




    }


}
