package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsScopedCssBaselineTy
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scopedCssBaselineMod {
  
  @JSImport("@mui/material/ScopedCssBaseline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Css Baseline](https://mui.com/components/css-baseline/)
    *
    * API:
    *
    * - [ScopedCssBaseline API](https://mui.com/api/scoped-css-baseline/)
    */
  @JSImport("@mui/material/ScopedCssBaseline", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsScopedCssBaselineTy, Element] = js.native
  
  inline def getScopedCssBaselineUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getScopedCssBaselineUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Inlined std.Record<'root', string> */
  object scopedCssBaselineClasses {
    
    @JSImport("@mui/material/ScopedCssBaseline", "scopedCssBaselineClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@mui/material/ScopedCssBaseline", "scopedCssBaselineClasses.root")
    @js.native
    def root: String = js.native
    inline def root_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("root")(x.asInstanceOf[js.Any])
  }
}
