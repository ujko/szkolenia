package day5.classInClass;

public class OneMoreClass {
    private int dynamicPrivateA = 10;
    private static int staticPrivateA = 7;
    public int dynamicPublicA = 10;
    public static int staticPublicA = 7;

    public class SecondDynamicClass {
        private int dynamicPrivateBB = 10;
        //        private static int staticPrivateBB = 7; // w podklasie dynamicznej nie morze byc zmiennych statycznych!
        public int dynamicPublicBB = 10;
        //        public static int staticPublicBB = 7;
        public void method() {
            dynamicPrivateA += 10;
            staticPrivateA += 7;
            dynamicPublicA += 10;
            staticPublicA += 7;
            System.out.println(dynamicPrivateA + ": "
                    + staticPrivateA + ": "
                    + dynamicPublicA + ": "
                    + staticPublicA);
        }
        public void methodPrint() {
            System.out.println(dynamicPublicBB);
        }
    }

    public static class SecondStaticClass {
        private int dynamicPrivateCC = 10;
        private static int staticPrivateCC = 7;
        public int dynamicPublicCC = 10;
        public static int staticPublicCC = 7;

        public void methodInStaticClass() {
//            dynamicPrivateA += 10;  // Podklasa statyczna niema dostempu do dynamicznych zmiennych clasy glownej..
            staticPrivateA += 7;
//            dynamicPublicA +=10;
            staticPublicA += 7;
            staticPublicCC += 13;
            System.out.println(/*dynamicPrivateA*/  ": "
                    + staticPrivateA + ": "
                    + /*dynamicPublicA*/  ": "
                    + staticPublicA +": " + staticPublicCC);
        }

        /**
         * "/**" - W ten sposob tworzymy Java Doc. <br/> "<.b.r./." (bez kropek)- W ten sposob przechodzimy na drugi zad.
         */
            public static void methodStatic() {
                System.out.println(staticPublicCC);
        }
    }

    public void sampleMethod() {
        SecondDynamicClass secondDynamicClass = new SecondDynamicClass();
        secondDynamicClass.method();

        SecondStaticClass secondStaticClass = new SecondStaticClass();
        secondStaticClass.methodInStaticClass();
        SecondStaticClass.staticPrivateCC += 10;
    }
}
