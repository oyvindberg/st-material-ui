package com.olvind.mui.muiMaterial

import com.olvind.mui.react.mod.JSXElementConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsRequirePropFactoryMod {
  
  @JSImport("@mui/material/utils/requirePropFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(componentNameInError: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(componentNameInError.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def default(componentNameInError: String, Component: JSXElementConstructor[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(componentNameInError.asInstanceOf[js.Any], Component.asInstanceOf[js.Any])).asInstanceOf[Any]
}
