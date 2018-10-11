package udemy.functional

fun main(args: Array<String>) {
    val props = System.getProperties()

    with(props) {
        list(System.out)
        println(propertyNames().toList())
        println(getProperty("user.home"))
    }

    /*props.list(System.out)
    println(props.propertyNames().toList())
    println(props.getProperty("user.home"))*/

}