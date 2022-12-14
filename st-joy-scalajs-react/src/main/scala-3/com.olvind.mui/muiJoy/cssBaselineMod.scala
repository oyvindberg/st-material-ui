package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.cssBaselineCssBaselinePropsMod.CssBaselineProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssBaselineMod {
  
  object default {
    
    /**
      * Kickstart an elegant, consistent, and simple baseline to build upon.
      *
      * Demos:
      *
      * - [CSS Baseline](https://mui.com/joy-ui/react-css-baseline/)
      *
      * API:
      *
      * - [CssBaseline API](https://mui.com/joy-ui/api/css-baseline/)
      */
    inline def apply(props: CssBaselineProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@mui/joy/CssBaseline", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@mui/joy/CssBaseline", "default.propTypes")
    @js.native
    def propTypes: Any = js.native
    inline def propTypes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
