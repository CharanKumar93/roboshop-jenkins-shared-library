def new1() {
    print "hello"
    def xyz = "hello"
    print "xyz = ${xyz}"
    print "abc = ${abc}"

    if (abc == "Some Data") {
        print "YES"
    } else {
        print "NO"
    }

    def x = 2
    def y = 0
    while(x > y) {
        println "${y}"
        y++
    }

    for(int i = 0;i<5;i++) {
        println(i);
    }

    def fruits = ["apple", "banana", "orange"];

    for(i in fruits) {
        println(i);
    }


}