package com.olvind.mui.muiJoy

import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classNameMod {
  
  @JSImport("@mui/joy/className", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateUtilityClass(componentName: String, slot: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateUtilityClass")(componentName.asInstanceOf[js.Any], slot.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def generateUtilityClasses[T /* <: String */](componentName: String, slots: js.Array[T]): Record[T, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateUtilityClasses")(componentName.asInstanceOf[js.Any], slots.asInstanceOf[js.Any])).asInstanceOf[Record[T, String]]
  
  object unstableClassNameGenerator {
    
    @JSImport("@mui/joy/className", "unstable_ClassNameGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def configure(generator: js.Function1[/* componentName */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(generator.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def generate(componentName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(componentName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  }
}
