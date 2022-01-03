package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.ScrollbarColor
import com.olvind.mui.muiMaterial.anon.Thumb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object darkScrollbarMod {
  
  @JSImport("@mui/material/darkScrollbar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): ScrollbarColor = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[ScrollbarColor]
  inline def default(options: Thumb): ScrollbarColor = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[ScrollbarColor]
}
