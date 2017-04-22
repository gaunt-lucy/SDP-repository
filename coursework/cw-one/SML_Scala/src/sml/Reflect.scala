///**
//  * Created by Lucy on 19/04/2017.
//  */
//package sml
//
//import scala.reflect.runtime.universe
//
//class Reflect (className: String) {
//
//  val runtimeMirror: universe.Mirror = universe.runtimeMirror(getClass.getClassLoader)
//
//  val classSymbol: universe.ClassSymbol = runtimeMirror.classSymbol(Class.forName(className))
//
//  val classMirror: universe.ClassMirror = runtimeMirror.reflectClass(classSymbol)
//
//  val construct = universe.typeOf[].decl(universe.termNames.CONSTRUCTOR).asMethod
//  }
