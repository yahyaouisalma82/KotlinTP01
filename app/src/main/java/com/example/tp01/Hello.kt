package com.example.tp01

import java.lang.Math.abs

data class Point(val x:Int,val y: Int)
fun distance(p :Point, q:Point):Int{
    return  ( kotlin.math.abs((p.x).minus(q.x)) + kotlin.math.abs((p.y).minus(q.y)));
}
class Rectangle(private val p :Point=Point(0,0), private val q:Point=Point(1,1) ){
    override fun toString():String {return "p=$p q=$q"}
    fun surface():Int{
        return (distance(Point(p.x,q.y),p)* distance(Point(q.x,p.y),p))
    }
}
fun main(argv : Array<String> ){
    println("Hello")
    val rect1=Rectangle();
    val rect2=Rectangle(q=Point(5,6));
    val rect3=Rectangle(Point(9,6));
    val rect4=Rectangle(Point(2,7),Point(8,5));
    val tab= listOf(rect1,rect2,rect3,rect4)
    for(element in tab){
        println("surface de rectangle aux points   ${element.toString()} est égale à ${element.surface()}")
    }
}
