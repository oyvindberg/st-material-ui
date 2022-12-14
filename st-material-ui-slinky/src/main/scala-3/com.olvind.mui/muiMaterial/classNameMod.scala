package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classNameMod {
  
  object unstableClassNameGenerator {
    
    @JSImport("@mui/material/className", "unstable_ClassNameGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def configure(generator: js.Function1[/* componentName */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(generator.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def generate(componentName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(componentName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  }
}
